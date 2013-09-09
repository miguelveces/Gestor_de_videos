package panama.sportline.ssh;

/**
 *
 * @author Miguel Veces Telefónica Panamá
 */
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Pattern;
import sportline.panama.datos.ClsUserResponse;

public class ClsSSHClient {

    static String comando1;
    static String comando2;
    static String comando3;
    // nohup
    private String user;
    private String host;
    private String password;
    private Channel channel;
    private PipedOutputStream pos;
    private PipedInputStream pis;
    private static final String TERMINATOR = "zDonez";
    private Pattern alphaNumeric = Pattern.compile("([^a-zA-z0-9])");
    private int SERVER_RESPONSE_TIMEOUT = 1500;
    private Session session;

    public ClsSSHClient(String ip, String user, String pwd) {
        this.host = ip;
        this.user = user;
        this.password = pwd;
    }

    //metodo que corre los procesos
    public void ejecutarcmd(List<String> lstcmd) throws Exception {

        JSch jsch = new JSch();
        //final Session session = jsch.getSession(user, host, 22);
        session = jsch.getSession(user, host, 22);
        UserInfo ui = new MyUserInfo(password);
        session.setUserInfo(ui);
        session.connect();
        channel = session.openChannel("shell");
        pos = new PipedOutputStream();
        channel.setInputStream(new PipedInputStream(pos));
        PrintWriter stdin = new PrintWriter(new OutputStreamWriter(pos, "utf-8"));

        for (String valor : lstcmd) {
            stdin.println(valor);
        }

        stdin.close();
        channel.connect(3 * 1000);
    }

    //metodo que verifica si se esta conectado con el servidor
    public boolean isConnected() {
        return (channel != null && channel.isConnected());
    }

    // Recupera la respuesta del servidor para el comando de Shell
    public String getServerResponse(String comando) throws Exception {
        StringBuffer builder = new StringBuffer();
        String result = null;
        try {
            int count = 0;
            String line = "";

            BufferedReader reader = new BufferedReader(new InputStreamReader(pis));
            if (reader.ready()) {
                for (int i = 0; true; i++) {
                    try {
                        line = reader.readLine();
                    } catch (IOException e) {
                        System.out.println("Cominicacion cerrada");
                        break;
                    }
                    builder.append(line).append("\n");
                    if (line.indexOf(TERMINATOR) != -1 && (++count > 1)) {
                        break;
                    }
                }
                //tiene el resultado de todo lo que se ha impreso en el servidor
                result = builder.toString();
                int beginIndex = result.indexOf(TERMINATOR + "\"")
                        + ((TERMINATOR + "\"").length());
                result = result.substring(beginIndex);
                result = result.replaceAll(escape(TERMINATOR), "").trim();
                System.out.println("Command : " + comando + " -> Result : "
                        + result);
                return result;
            } else {
                throw new Exception("El servidor no ha respondido en el tiempo ("
                        + SERVER_RESPONSE_TIMEOUT + "ms) to command ("
                        + comando + ")");
            }
        } catch (IOException e) {
            e.printStackTrace();
            //  LOGGER.error(e);
            throw new Exception(e.getLocalizedMessage());
        }
    }

    private String escape(String subjectString) {
        return alphaNumeric.matcher(subjectString).replaceAll("\\\\$1");
    }

    public void disconnect() {
        if (isConnected()) {
            channel.disconnect();
            session.disconnect();
        }
    }

//Clase para validad contraseña en servidores.....
    public static class MyUserInfo implements UserInfo {

        MyUserInfo(String password) {
            this.password = password;
        }
        private final String password;

        @Override
        public String getPassword() {
            return password;
        }

        @Override
        public boolean promptYesNo(String str) {
            return true;
        }

        @Override
        public String getPassphrase() {
            return null;
        }

        @Override
        public boolean promptPassphrase(String message) {
            return false;
        }

        @Override
        public boolean promptPassword(String message) {
            return true;
        }

        @Override
        public void showMessage(String message) {
        }
    }
}
