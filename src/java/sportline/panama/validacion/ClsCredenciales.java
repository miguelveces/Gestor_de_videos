/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.validacion;

import sportline.panama.iso860.ISO8601Utilities;

/**
 *
 * @author earboleda
 */
public class ClsCredenciales {

    private static String user = "earboleda";
    private static String company = "sportline";
    private static String password = "12345678";
    private static String now = ISO8601Utilities.formatDate();

    public String getuser() {
        return user;
    }

    public String getcompany() {
        return company;
    }

    public String getpassword() {
        return password;
    }

    public String getnow() {
        return now;
    }
}
