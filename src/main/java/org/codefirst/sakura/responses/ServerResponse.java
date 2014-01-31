package org.codefirst.sakura.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codefirst.sakura.beans.Server;

@XmlRootElement
public class ServerResponse {
    @XmlElement(name = "Server")
    public Server server;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public ServerResponse() {
        super();
    }

    public ServerResponse(Server server) {
        super();
        this.server = server;
    }
}
