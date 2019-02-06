/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.type;

import javax.swing.JOptionPane;

/**
 *
 * @author abdo_(O_o)
 */

/**
 * class enumerator responsible to determine type of user 
 * it will communicate with USERS_TYPE table in database 
 */
public enum UsersType { // enum class because all data is constant 
    ADMIN(1, "admin"), DOCTOR(2, "doctor"),NURSE(3,"nurse");
    private int id;               //id of user in database
    private String type;       //type of user in database

       private UsersType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    
    public static UsersType getUsersTypeById(int id) {
        for (UsersType usersType : UsersType.values()) {
            if (usersType.getId() == id) {
                return usersType;
            }

        }
        return null;
    }
       public static UsersType getUsersTypeByType(String type) {
        for (UsersType usersType : UsersType.values()) {
            if (usersType.getType() ==type) {
                JOptionPane.showMessageDialog(null, usersType.getType());
                        
                return usersType;
            }

        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
