package com.gmail.krvmax.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * author: Maxim Diland
 */
@Entity
public class User implements Serializable {

    @GeneratedValue
    @Id
    private long id;

    private String email;
    private String password;
    private String displayNickName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayNickName() {
        return displayNickName;
    }

    public void setDisplayNickName(String displayNickName) {
        this.displayNickName = displayNickName;
    }
}
