package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Interface {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "MACAddress")
    public String macAddress;
    @XmlElement(name = "IPAddress")
    public String ipAddress;
    @XmlElement(name = "UserIPAddress")
    public String userIPAddress;
    @XmlElement(name = "HostName")
    public String hostName;

    public Interface() {
        super();
    }
}
