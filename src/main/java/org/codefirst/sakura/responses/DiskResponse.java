package org.codefirst.sakura.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codefirst.sakura.beans.Disk;

@XmlRootElement
public class DiskResponse {
    @XmlElement(name = "Disk")
    public Disk disk;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public DiskResponse() {
        super();
    }
}
