package org.codefirst.sakura.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disk {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "Description")
    public String description;
    @XmlElement(name = "Connection")
    public String connection;
    @XmlElement(name = "ConnectionOrder")
    public String connectionOrder;
    @XmlElement(name = "ReinstallCount")
    public int reinstallCount;
    @XmlElement(name = "SizeMB")
    public int sizeMB;
    @XmlElement(name = "MigratedMB")
    public Integer migratedMB;
    @XmlElement(name = "WaitingJobCount")
    public Integer waitingJobCount;
    @XmlElement(name = "SourceArchive")
    public Archive sourceArchive;
    @XmlElement(name = "Plan")
    public Plan plan;
    @XmlElement(name = "CreatedAt")
    public Date createdAt;

    public Disk() {
        super();
    }

}
