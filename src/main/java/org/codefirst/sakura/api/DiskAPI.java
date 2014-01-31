package org.codefirst.sakura.api;

import javax.ws.rs.core.Response;

import org.codefirst.sakura.beans.Disk;
import org.codefirst.sakura.responses.DiskResponse;
import org.codefirst.sakura.responses.DisksResponse;
import org.codefirst.sakura.responses.ResultResponse;

public class DiskAPI {
    private static final String RESOURCE_NAME = "disk";

    private final SakuraCloud endpoint;

    protected DiskAPI(SakuraCloud endpoint) {
        this.endpoint = endpoint;
    }

    public DisksResponse get() {
        Response response = endpoint.get(RESOURCE_NAME);
        return response.readEntity(DisksResponse.class);
    }

    public DiskResponse get(String diskId) {
        Response response = endpoint.get(RESOURCE_NAME + "/" + diskId);
        return response.readEntity(DiskResponse.class);
    }

    public DiskResponse post(Disk disk) {
        DiskResponse diskResponse = new DiskResponse();
        diskResponse.disk = disk;
        Response response = endpoint.post(RESOURCE_NAME, diskResponse);
        return response.readEntity(DiskResponse.class);
    }

    public ResultResponse putToServer(String diskId, String serverId) {
        Response response = endpoint.put(RESOURCE_NAME + "/" + diskId + "/to/server/" + serverId);
        return response.readEntity(ResultResponse.class);
    }

    public ResultResponse putConfig(String diskId) {
        Response response = endpoint.put(RESOURCE_NAME + "/" + diskId + "/config");
        return response.readEntity(ResultResponse.class);
    }
}
