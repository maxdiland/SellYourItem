package com.gmail.krvmax.web.Request;

import javax.ws.rs.PathParam;

/**
 * Created by Max on 9/25/2014.
 */
public class UserRequest {

//    @PathParam("id")
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
