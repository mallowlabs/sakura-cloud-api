package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Icon {
    @XmlElement(name = "ID")
    public String id;
    @XmlElement(name = "URL")
    public String url;
    @XmlElement(name = "Name")
    public String name;
    @XmlElement(name = "Scope")
    public String scope;

    public Icon() {
        super();
    }

}
