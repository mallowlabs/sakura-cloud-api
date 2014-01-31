package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zone {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "Description")
    public String description;
    @XmlElement(name = "VNCProxy")
    public Address vncProxy;
    @XmlElement(name = "FTPServer")
    public Address ftpServer;
}
