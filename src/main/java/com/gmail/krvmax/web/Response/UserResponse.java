package com.gmail.krvmax.web.Response;

/**
 * Created by Max on 9/25/2014.
 */
public class UserResponse {

    private long id;
    private String email;
    private String displayNickName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDisplayNickName() {
        return displayNickName;
    }

    public void setDisplayNickName(String displayNickName) {
        this.displayNickName = displayNickName;
    }
}
