package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Config {
    @XmlElement(name = "Password")
    public String password;
    @XmlElement(name = "HostName")
    public String hostName;
    @XmlElement(name = "UserIPAddress")
    public String userIPAddress;

    public Config() {
        super();
    }
}
