package com.gmail.krvmax.resourceregistering;

import com.gmail.krvmax.web.SimpleResource;
import com.gmail.krvmax.web.UserResource;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by mkrivoruchko on 8/11/14.
 */
public class ResourceRegistrationManager extends ResourceConfig {

    public ResourceRegistrationManager() {
        register(SimpleResource.class);
        register(UserResource.class);
    }
}
