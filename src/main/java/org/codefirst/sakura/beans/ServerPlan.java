package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServerPlan {
    @XmlElement(name = "ID")
    public int id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "CPU")
    public int cpu;
    @XmlElement(name = "MemoryMB")
    public int memoryMB;
    @XmlElement(name = "ServiceClass")
    public String serviceClass;
    @XmlElement(name = "Availability")
    public String availability;

    public ServerPlan() {
        super();
    }

    public ServerPlan(int id) {
        this();
        this.id = id;
    }
}
