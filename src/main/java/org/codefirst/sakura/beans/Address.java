package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {
    @XmlElement(name = "HostName")
    public String hostName;
    @XmlElement(name = "IPAddress")
    public String ipAddress;

    public Address() {
        super();
    }
}
