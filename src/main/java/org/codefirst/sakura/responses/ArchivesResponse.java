package org.codefirst.sakura.responses;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codefirst.sakura.beans.Archive;

@XmlRootElement
public class ArchivesResponse {
    @XmlElement(name = "From")
    public int from;
    @XmlElement(name = "Count")
    public int count;
    @XmlElement(name = "Total")
    public int total;
    @XmlElement(name = "Archives")
    public List<Archive> archives;
    @XmlElement(name = "is_ok")
    public boolean isOK;

    public ArchivesResponse() {
        super();
    }

}
