/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.datos;

/**
 *
 * @author earboleda
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "set_caja", propOrder = {
    "ip",
    "usrcaja",
    "pwdcaja"
})
public class ClsCaja {

    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    protected String usrcaja;
    @XmlElement(required = true)
    protected String pwdcaja;

    /**
     * Obtiene el valor de la propiedad ip.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtiene el valor de la propiedad usrcaja.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUsrCaja() {
        return usrcaja;
    }

    /**
     * Define el valor de la propiedad usrcaja.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUsrCaja(String value) {
        this.usrcaja = value;
    }

    /**
     * Obtiene el valor de la propiedad pwdcaja.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPwdCaja() {
        return pwdcaja;
    }

    /**
     * Define el valor de la propiedad pwdcaja.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPwdCaja(String value) {
        this.pwdcaja = value;
    }
}
