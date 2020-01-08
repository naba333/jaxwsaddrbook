
package com.absi.jaxwsaddrbook.webapp.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addPerson", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPerson", namespace = "http://webapp.jaxwsaddrbook.absi.com/")
public class AddPerson {

    @XmlElement(name = "arg0", namespace = "")
    private com.absi.jaxwsaddrbook.webapp.Person arg0;

    /**
     * 
     * @return
     *     returns Person
     */
    public com.absi.jaxwsaddrbook.webapp.Person getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.absi.jaxwsaddrbook.webapp.Person arg0) {
        this.arg0 = arg0;
    }

}
