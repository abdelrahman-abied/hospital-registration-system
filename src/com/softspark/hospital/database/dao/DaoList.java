/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.dao;

import java.util.List;

public interface DaoList<T> {  //interface and generic because we will use it in many time and in different place with special way
    public List<T>loadAll(T t)throws Exception;       //method will use to load all database info we need 
    public int  insert(T t)throws Exception;        //  insert into database   
    public int update(T t)throws Exception;        // method response update database 
    public int  delete(T t)throws Exception;        //delete in database
    public T getData(T t)throws Exception;            //method response of get data from database with speacial condition
      public T getDataById(int id)throws Exception;  
}
