/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.md5;

/**
 *
 * @author earboleda
 */
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClsConvertirMD5 {

    private static String convertedToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < data.length; i++) {
            int halfOfByte = (data[i] >>> 4) & 0x0F;
            int twoHalfBytes = 0;

            do {
                if ((0 <= halfOfByte) && (halfOfByte <= 9)) {
                    buf.append((char) ('0' + halfOfByte));
                } else {
                    buf.append((char) ('a' + (halfOfByte - 10)));
                }

                halfOfByte = data[i] & 0x0F;

            } while (twoHalfBytes++ < 1);
        }
        return buf.toString();
    }

    public static String MD5(String text) {
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("MD5");
            byte[] md5 = new byte[64];
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            md5 = md.digest();
            return convertedToHex(md5);
        } catch (Exception ex) {
            Logger.getLogger(ClsConvertirMD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
