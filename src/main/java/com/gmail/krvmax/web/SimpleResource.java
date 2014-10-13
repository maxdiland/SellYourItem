package com.gmail.krvmax.web;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by mkrivoruchko on 8/11/14.
 */

@Path("/hello")
public class SimpleResource {
    @Autowired
    private String injectedString;

    @GET
    public String greeting() {
        return "HELLO FROM JERSEY!" + injectedString;
    }

    public String getInjectedString() {
        return injectedString;
    }

    public void setInjectedString(String injectedString) {
        this.injectedString = injectedString;
    }
}
