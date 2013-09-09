package sportline.panama.datos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user_response", propOrder = {
    "resultCode",
    "errorMsg"
})
public class ClsUserResponse {

    @XmlElement(name = "result_code")
    protected int resultCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;

    /**
     * Obtiene el valor de la propiedad resultCode.
     *
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Define el valor de la propiedad resultCode.
     *
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad errorMsg.
     *
     * @return possible object is {@link String }
     *
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Define el valor de la propiedad errorMsg.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }
}
