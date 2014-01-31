package org.codefirst.sakura.api;

import javax.ws.rs.core.Response;

import org.codefirst.sakura.beans.Server;
import org.codefirst.sakura.responses.ResultResponse;
import org.codefirst.sakura.responses.ServerResponse;
import org.codefirst.sakura.responses.ServersResponse;

public class ServerAPI {
    private static final String RESOURCE_NAME = "server";

    private final SakuraCloud endpoint;

    protected ServerAPI(SakuraCloud endpoint) {
        this.endpoint = endpoint;
    }

    public ServersResponse get() {
        Response response = endpoint.get(RESOURCE_NAME);
        return response.readEntity(ServersResponse.class);
    }

    public ServerResponse get(String serverId) {
        Response response = endpoint.get(RESOURCE_NAME + "/" + serverId);
        return response.readEntity(ServerResponse.class);
    }

    public ServerResponse post(Server server) {
        ServerResponse serverResponse = new ServerResponse(server);
        Response response = endpoint.post(RESOURCE_NAME, serverResponse);
        return response.readEntity(ServerResponse.class);
    }

    public ResultResponse putPower(String serverId) {
        Response response = endpoint.put(RESOURCE_NAME + "/" + serverId + "/power");
        return response.readEntity(ResultResponse.class);
    }
}
