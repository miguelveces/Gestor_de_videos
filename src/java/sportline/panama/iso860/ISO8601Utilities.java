/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.iso860;

/**
 *
 * @author earboleda
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ISO8601Utilities {

    private static DateFormat m_ISO8601Local = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.GERMANY);
    private static DateFormat m_ISO8601Local2 = new SimpleDateFormat("yyyy-MM-dd'T'HH", Locale.GERMANY);

    public static String formatDateTime() {
        return formatDateTime(new Date());
    }

    public static String formatDate() {
        return formatDate(new Date());
    }

    private static String formatDateTime(Date date) {
        if (date == null) {
            return formatDateTime(new Date());
        }
        // Convertir a formato de ISO
        String dateStr = m_ISO8601Local.format(date);
        return dateStr;
    }

    private static String formatDate(Date date) {
        if (date == null) {
            return formatDateTime(new Date());
        }
        // Convertir a formato de ISO
        String dateStr = m_ISO8601Local2.format(date);
        return dateStr;
    }
}
