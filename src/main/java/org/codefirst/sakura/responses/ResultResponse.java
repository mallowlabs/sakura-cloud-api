package org.codefirst.sakura.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultResponse {
    @XmlElement(name = "Success")
    public boolean success;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public ResultResponse() {
        super();
    }
}
