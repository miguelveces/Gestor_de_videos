/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.validacion;

import sportline.panama.datos.ClsUser;
import sportline.panama.datos.ClsUserResponse;
import sportline.panama.md5.ClsConvertirMD5;

/**
 *
 * @author earboleda
 */
public class ClsValidarUsuario {

    public boolean ValidarUsuario(ClsUser set_user, ClsUserResponse resul) throws Exception {

        ClsCredenciales obj_cre = new ClsCredenciales();
        //Obtiene los parametros del request para validar usuario
        String input_now = set_user.getNow();
        String input_nowh = "";
        String input_user = set_user.getLogin();
        String input_company = set_user.getCompany();
        String input_authstring = set_user.getAuthString();
        int i = input_now.indexOf(":");
        if (i != -1) {
            input_nowh = input_now.substring(0, i);
        }

        //Obtiene los parametros del internos para validar usuario
        String ouput_nowh = obj_cre.getnow();
        String ouput_user = obj_cre.getuser();
        String ouput_company = obj_cre.getcompany();
        String ouput_password = obj_cre.getpassword();
        String ouput_authstring = ClsConvertirMD5.MD5(input_now + ClsConvertirMD5.MD5(ouput_password));

        if (input_user.equals(ouput_user)
                && input_company.equals(ouput_company)
                && input_authstring.equals(ouput_authstring)
                && input_nowh.equals(ouput_nowh)) {
            return true;
        } else {
            return false;
        }
    }
}
