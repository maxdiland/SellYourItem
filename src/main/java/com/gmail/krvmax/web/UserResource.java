package com.gmail.krvmax.web;


import com.gmail.krvmax.dao.UserDao;
import com.gmail.krvmax.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Max on 9/25/2014.
 */

@Path("/user")
public class UserResource {

    @Autowired
    private UserDao userDao;

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public User getUserById(@PathParam("id") long requestedId) {
        return userDao.getUserById(requestedId);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
