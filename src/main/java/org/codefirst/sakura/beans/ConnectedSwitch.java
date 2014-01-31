package org.codefirst.sakura.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConnectedSwitch {
    @XmlElement(name = "Scope")
    public String scope = "shared";
    @XmlElement(name = "BandWidthMbps")
    public int bandWidthMbps = 100;

    public ConnectedSwitch() {
        super();
    }
}
