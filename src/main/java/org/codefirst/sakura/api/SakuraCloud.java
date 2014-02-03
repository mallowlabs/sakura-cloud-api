package org.codefirst.sakura.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codefirst.sakura.beans.Empty;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class SakuraCloud {
    private final String accessToken;
    private final String accessTokenSecret;
    private final String zone;

    public SakuraCloud(String accessToken, String accessTokenSecret) {
        this(accessToken, accessTokenSecret, "is1a");
    }

    public SakuraCloud(String accessToken, String accessTokenSecret, String zone) {
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
        this.zone = zone;
    }

    protected String getEndPoint() {
        return "https://secure.sakura.ad.jp/cloud/zone/" + this.zone + "/api/cloud/1.1/";
    }

    public DiskAPI disk() {
        return new DiskAPI(this);
    }

    public ArchiveAPI archive() {
        return new ArchiveAPI(this);
    }

    public ServerAPI server() {
        return new ServerAPI(this);
    }

    protected Response get(String path) {
        Client client = newClient();
        WebTarget target = client.target(getEndPoint()).path(path);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
        return response;
    }

    protected Response post(String path, Object entity) {
        Client client = newClient();
        WebTarget target = client.target(getEndPoint()).path(path);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).post(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE));
        return response;
    }

    protected Response put(String path, Object entity) {
        Client client = newClient();
        WebTarget target = client.target(getEndPoint()).path(path);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).put(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE));
        return response;
    }

    protected Response put(String path) {
        return put(path, new Empty());
    }

    protected Response delete(String path) {
        Client client = newClient();
        WebTarget target = client.target(getEndPoint()).path(path);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).delete();
        return response;
    }

    protected Client newClient() {
        Client client = ClientBuilder.newClient();
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(this.accessToken, this.accessTokenSecret);
        client.register(feature);
        return client;
    }

}
