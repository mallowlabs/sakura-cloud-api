package org.codefirst.sakura.beans;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Server {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "HostName")
    public String hostName;
    @XmlElement(name = "Description")
    public String description;
    @XmlElement(name = "ServiceClass")
    public String serviceClass;
    @XmlElement(name = "Disks")
    public List<Disk> disks;
    @XmlElement(name = "Tags")
    public List<String> tags;
    @XmlElement(name = "Icon")
    public Icon icon;
    @XmlElement(name = "ServerPlan")
    public ServerPlan serverPlan;
    @XmlElement(name = "Zone")
    public Zone zone;
    @XmlElement(name = "Interfaces")
    public List<Interface> interfaces;
    @XmlElement(name = "ConnectedSwitches")
    public List<ConnectedSwitch> connectedSwitches;
    @XmlElement(name = "CreatedAt")
    public Date createdAt;

    public Server() {
        super();
    }

    public Server(String id) {
        super();
        this.id = id;
    }
}
