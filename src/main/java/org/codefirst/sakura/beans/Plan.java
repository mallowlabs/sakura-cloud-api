package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Plan {
    @XmlElement(name = "ID")
    public int id;
    @XmlElement(name = "StorageClass")
    public String storageClass;
    @XmlElement(name = "Name")
    public String name;

    public Plan() {
        super();
    }

    public Plan(int id) {
        this();
        this.id = id;
    }
}
