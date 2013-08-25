package sportline.panama.principal;

import sportline.panama.servicios.*;
import sportline.panama.validacion.*;
import sportline.panama.md5.*;


/**
 *
 * @author NCN00973
 */
public class llamado {
    
    public static void main (String[]args)
    {
        ClsCredenciales  datos = new ClsCredenciales();
        ClsConvertirMD5 md5 = new ClsConvertirMD5();
        String login = datos.getuser();
        String now = datos.getnow();
        String pass = datos.getpassword();
        String company = datos.getcompany();
        String austring = md5.MD5(now + md5.MD5(pass));
        //se arma el xml set_user
        SetUser usuarios = new SetUser();
        usuarios.setNow(now);
        usuarios.setLogin(login);
        usuarios.setCompany(company);
        usuarios.setAuthString(austring);
        
        //datos de la caja xml set_caja
        SetCaja caja = new SetCaja();
        caja.setIp("192.168.0.100");
        caja.setUsrcaja("home");
        caja.setPwdcaja("root");
        
        
        Comandos comandos = new Comandos();
        comandos.getPropertyCommand().add("export DISPLAY=:0.0");
        comandos.getPropertyCommand().add("cd $HOME/videos");
        comandos.getPropertyCommand().add("nohup totem --enqueue $HOME/videos/Daddy Yankee - Limbo.mp4 --fullscreen > log.out ");
        comandos.getPropertyCommand().add("exit");
        
       UserResponse resultado = controlremoto(usuarios, caja, comandos);
       System.out.println(resultado.getErrorMsg());
       System.out.println(resultado.getResultCode());
        
    }
    public int controles(String parametro_comansos, String parametros_comandos2){
        
         ClsCredenciales  datos = new ClsCredenciales();
        ClsConvertirMD5 md5 = new ClsConvertirMD5();
        String login = datos.getuser();
        String now = datos.getnow();
        String pass = datos.getpassword();
        String company = datos.getcompany();
        String austring = md5.MD5(now + md5.MD5(pass));
        //se arma el xml set_user
        SetUser usuarios = new SetUser();
        usuarios.setNow(now);
        usuarios.setLogin(login);
        usuarios.setCompany(company);
        usuarios.setAuthString(austring);
        
        //datos de la caja xml set_caja
        SetCaja caja = new SetCaja();
        caja.setIp("192.168.0.100");
        caja.setUsrcaja("home");
        caja.setPwdcaja("root");
        
        
        Comandos comandos = new Comandos();
        comandos.getPropertyCommand().add("export DISPLAY=:0.0");
        comandos.getPropertyCommand().add(parametro_comansos);
        comandos.getPropertyCommand().add(parametros_comandos2);
        comandos.getPropertyCommand().add("exit");
        
       UserResponse resultado = controlremoto(usuarios, caja, comandos);
       System.out.println(resultado.getErrorMsg());
       System.out.println(resultado.getResultCode());
       if(resultado.getResultCode()==0){
           return 1;
       }
       else 
           return 2;
        
    }
    private static UserResponse controlremoto(SetUser setUser, SetCaja setCaja, Comandos setCmd) {
        WsdControlRemoto_Service service = new WsdControlRemoto_Service();
        WsdControlRemoto port = service.getWsdControlRemotoPort();
        return port.controlremoto(setUser, setCaja, setCmd);
    }
}
