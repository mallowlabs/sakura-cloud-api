package org.codefirst.sakura.api;

import javax.ws.rs.core.Response;

import org.codefirst.sakura.beans.Archive;
import org.codefirst.sakura.responses.ArchiveResponse;
import org.codefirst.sakura.responses.ArchivesResponse;
import org.codefirst.sakura.responses.ResultResponse;

public class ArchiveAPI {
    private static final String RESOURCE_NAME = "archive";

    private final SakuraCloud endpoint;

    protected ArchiveAPI(SakuraCloud endpoint) {
        this.endpoint = endpoint;
    }

    public ArchivesResponse get() {
        Response response = endpoint.get(RESOURCE_NAME);
        return response.readEntity(ArchivesResponse.class);
    }

    public ArchiveResponse post(Archive archive) {
        ArchiveResponse archiveResponse = new ArchiveResponse();
        archiveResponse.archive = archive;
        Response response = endpoint.post(RESOURCE_NAME, archiveResponse);
        return response.readEntity(ArchiveResponse.class);
    }

    public ArchiveResponse get(String archiveId) {
        Response response = endpoint.get(RESOURCE_NAME + "/" + archiveId);
        return response.readEntity(ArchiveResponse.class);
    }

    public ArchiveResponse put(Archive archive) {
        ArchiveResponse archiveResponse = new ArchiveResponse();
        archiveResponse.archive = archive;
        Response response = endpoint.put(RESOURCE_NAME + "/" + archive.id, archiveResponse);
        return response.readEntity(ArchiveResponse.class);
    }

    public ResultResponse delete(String archiveId) {
        Response response = endpoint.delete(RESOURCE_NAME + "/" + archiveId);
        return response.readEntity(ResultResponse.class);
    }

    public ResultResponse putFTP(String archiveId) {
        Response response = endpoint.put(RESOURCE_NAME + "/" + archiveId + "/ftp");
        return response.readEntity(ResultResponse.class);
    }

    public ResultResponse deleteFTP(String archiveId) {
        Response response = endpoint.delete(RESOURCE_NAME + "/" + archiveId + "/ftp");
        return response.readEntity(ResultResponse.class);
    }

}
