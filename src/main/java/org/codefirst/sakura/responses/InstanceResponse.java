package org.codefirst.sakura.responses;

import javax.xml.bind.annotation.XmlElement;

import org.codefirst.sakura.beans.Instance;

public class InstanceResponse {
    @XmlElement(name = "Instance")
    public Instance instance;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public InstanceResponse() {
        super();
    }
}
