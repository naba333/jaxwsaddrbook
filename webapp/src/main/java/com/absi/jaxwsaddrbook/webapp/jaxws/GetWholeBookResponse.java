
package com.absi.jaxwsaddrbook.webapp.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getWholeBookResponse", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWholeBookResponse", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
public class GetWholeBookResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.absi.jaxwsaddrbook.webapp.Person> _return;

    /**
     * 
     * @return
     *     returns List<Person>
     */
    public List<com.absi.jaxwsaddrbook.webapp.Person> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.absi.jaxwsaddrbook.webapp.Person> _return) {
        this._return = _return;
    }

}
