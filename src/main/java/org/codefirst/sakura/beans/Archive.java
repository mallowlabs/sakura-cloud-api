package org.codefirst.sakura.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Archive {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "Description")
    public String description;
    @XmlElement(name = "Scope")
    public String scope;
    @XmlElement(name = "Availability")
    public String availability;
    @XmlElement(name = "SizeMB")
    public Integer sizeMB;
    @XmlElement(name = "MigratedMB")
    public Integer migratedMB;
    @XmlElement(name = "WaitingJobCount")
    public Integer waitingJobCount;
    @XmlElement(name = "OriginalArchive")
    public Archive originalArchive;
    // SourceDiskTemplate
    @XmlElement(name = "ServiceClass")
    public String serviceClass;
    @XmlElement(name = "CreatedAt")
    public Date createdAt;

    // CreatedAt
    // Plan

    // SourceDisk
    // SourceDiskSnapshot
    // SourceArchive
    // Storage

    public Archive() {
        super();
    }

    public Archive(String id) {
        super();
        this.id = id;
    }
}
