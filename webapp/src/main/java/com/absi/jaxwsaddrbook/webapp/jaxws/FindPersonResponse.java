
package com.absi.jaxwsaddrbook.webapp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findPersonResponse", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findPersonResponse", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
public class FindPersonResponse {

    @XmlElement(name = "return", namespace = "")
    private com.absi.jaxwsaddrbook.webapp.Person _return;

    /**
     * 
     * @return
     *     returns Person
     */
    public com.absi.jaxwsaddrbook.webapp.Person getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.absi.jaxwsaddrbook.webapp.Person _return) {
        this._return = _return;
    }

}
