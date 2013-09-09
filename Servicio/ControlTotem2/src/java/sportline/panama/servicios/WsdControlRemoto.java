/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.servicios;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import panama.sportline.ssh.ClsSSHClient;
import sportline.panama.datos.ClsCaja;
import sportline.panama.datos.ClsComandos;
import sportline.panama.datos.ClsUser;
import sportline.panama.datos.ClsUserResponse;
import sportline.panama.validacion.ClsValidarUsuario;

/**
 *
 * @author earboleda
 */
@WebService(serviceName = "wsdControlRemoto")
public class WsdControlRemoto {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "controlremoto")
    public ClsUserResponse controlremoto(@WebParam(name = "set_user") ClsUser set_user, @WebParam(name = "set_caja") ClsCaja set_caja, @WebParam(name = "set_cmd") ClsComandos set_cmd) {

        ClsValidarUsuario objvalusr = new ClsValidarUsuario();
        ClsUserResponse resul = new ClsUserResponse();

        try {

            if (objvalusr.ValidarUsuario(set_user, resul)) {
                //lista de parametro para conectarse con la caja
                String ip = set_caja.getIp();
                String usrcaja = set_caja.getUsrCaja();
                String pwdcaja = set_caja.getPwdCaja();
                //lista de comando a ejecutar dentro de la caja
                List<String> lstcmd = set_cmd.getPropertyFilter();

                try {
                    ClsSSHClient lote = new ClsSSHClient(ip, usrcaja, pwdcaja);
                    lote.ejecutarcmd(lstcmd);
                    resul.setResultCode(0);
                    resul.setErrorMsg("successful");
                } catch (Exception e) {
                    resul.setResultCode(3);
                    resul.setErrorMsg(e.getMessage().toString());
                }
            } else {
                resul.setResultCode(2);
                resul.setErrorMsg("Error: Login incorrecto");
            }
        } catch (Exception e) {
            resul.setResultCode(1);
            resul.setErrorMsg(e.getMessage().toString());
        }
        return resul;
    }
}
