package org.codefirst.sakura.api;

import javax.ws.rs.core.Response;

import org.codefirst.sakura.responses.ArchiveResponse;
import org.codefirst.sakura.responses.ArchivesResponse;

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

    public ArchiveResponse get(String archiveId) {
        Response response = endpoint.get(RESOURCE_NAME + "/" + archiveId);
        return response.readEntity(ArchiveResponse.class);
    }
}
