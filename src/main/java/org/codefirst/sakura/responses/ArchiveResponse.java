package org.codefirst.sakura.responses;

import javax.xml.bind.annotation.XmlElement;

import org.codefirst.sakura.beans.Archive;

public class ArchiveResponse {
    @XmlElement(name = "Archive")
    public Archive archive;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public ArchiveResponse() {
        super();
    }

}
