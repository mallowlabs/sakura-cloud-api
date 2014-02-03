package org.codefirst.sakura.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class Instance {
    @XmlElement(name = "Server")
    public Server server;
    @XmlElement(name = "Status")
    public String status;
    @XmlElement(name = "BeforeStatus")
    public String beforeStatus;
    @XmlElement(name = "StatusChangedAt")
    public Date statusChangedAt;
    // MigrationProgress
    // MigrationSchedule
    // IsMigrating
    // MigrationAllowed
    @XmlElement(name = "ModifiedAt")
    public Date modifiedAt;
    // Host
    // CDROM
    // CDROMStorage
}
