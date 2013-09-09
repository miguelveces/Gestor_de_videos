/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sportline.panama.datos;

/**
 *
 * @author earboleda
 */
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comandos", propOrder = {"propertyCommand"})
public class ClsComandos {

    @XmlElement(name = "propertyCommand")
    protected List<String> propertyCommand;

    public List<String> getPropertyFilter() {
        if (propertyCommand == null) {
            propertyCommand = new ArrayList<String>();
        }
        return this.propertyCommand;
    }
}
