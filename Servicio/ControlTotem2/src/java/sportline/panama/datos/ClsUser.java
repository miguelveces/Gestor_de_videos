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
@XmlType(name = "set_user", propOrder = {
    "now",
    "login",
    "company",
    "authString"
})
public class ClsUser {

    @XmlElement(required = true)
    protected String now;
    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String company;
    @XmlElement(required = true)
    protected String authString;

    /**
     * Obtiene el valor de la propiedad now.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNow() {
        return now;
    }

    /**
     * Define el valor de la propiedad now.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNow(String value) {
        this.now = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad company.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCompany() {
        return company;
    }

    /**
     * Define el valor de la propiedad company.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Obtiene el valor de la propiedad authString.
     *
     * @return possible object is {@link String }
     *
     */
    public String getAuthString() {
        return authString;
    }

    /**
     * Define el valor de la propiedad authString.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setAuthString(String value) {
        this.authString = value;
    }
}
