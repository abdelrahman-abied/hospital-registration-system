/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.vo;

import com.softspark.hospital.database.type.UsersType;

/**
 *Value object
 * @author abdo_(O_o)
 */

public class UsersVo {
/**
 * it will communicate with USERS table in database
 * we store data from database in it attribute
 */
    private int id;
    private String userName;
    private String password;
    private UsersType usersType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UsersType getUsersType() {
        return usersType;
    }

    public void setUsersType(UsersType usersType) {
        this.usersType = usersType;
    }
    /**
     * it is from UsersType Because it foreign key to connect with to table in
     * database USERS_TYPE and USERS
     */
    
}
