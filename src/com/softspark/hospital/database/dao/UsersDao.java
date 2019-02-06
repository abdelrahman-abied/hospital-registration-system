/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.dao;

import com.softspark.hospital.database.type.UsersType;
import com.softspark.hospital.database.vo.UsersVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author abdo_(O_o)
 */
public class UsersDao extends Dao implements DaoList<UsersVo> {

    /**
     * inherit Dao class to get connection from database implements DaoList to
     * control database with Query by DaoList methods
     */
    private static UsersDao usersDao;       //make it private to encapsulate it and made it class variable

    private UsersDao() {
        //private constructor to prevent instantiate
    }

    public static UsersDao getInstance() {
        if (usersDao == null) {
            usersDao = new UsersDao();
            return usersDao;

        }
        return null;
    }

    @Override
    public UsersVo getData(UsersVo uv) throws Exception {
        Connection con = null;
        UsersVo usersVo = null;
        ResultSet rs = null;
        try {
            con = getConnection();
            String Query = "select*from users where USER_NAME='" + uv.getUserName() + "'and PASSWORD='" + uv.getPassword() + "'";
            PreparedStatement pst = con.prepareStatement(Query);
            rs = pst.executeQuery();
            while (rs.next()) {
                usersVo = new UsersVo();
                usersVo.setId(rs.getInt("id"));
                usersVo.setPassword(rs.getString("PASSWORD"));
                usersVo.setUserName(rs.getString("USERS_NAME"));
                UsersType userType = UsersType.getUsersTypeById(rs.getInt("USERS_TYPE"));
                /**
                 * UsersType is enumerator class with private constructor can
                 * not create object from it we invoke getUsersTypeById method
                 * and send USERS_TYPE parameter to get # of USER in database
                 * (id) to know kind of user(admin,doctor,....)
                 */
                usersVo.setUsersType(userType);   //after we know type of user by id set it invoke setUserType(method) in UserVo

            }
            rs.close();
            pst.close();
        } catch (Exception e) {

        } finally {
            /**
             * invoke method closeConnection in class Dao and close connection
             * if con value not equal null
             */
            closeConnection(con);

        }
        return usersVo; //retrieve usersVo information

    }

    @Override
    public List<UsersVo> loadAll(UsersVo uv) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(UsersVo uv) throws Exception {
        /**
         *
         */
        Connection con = null;
        int count = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO users(USER_NAME,PASSWORD,USER_TYPE,ID)VALUES(?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uv.getUserName());
            pst.setString(2, uv.getPassword());
            pst.setInt(3, uv.getUsersType().getId());
            pst.setInt(4, uv.getId());
            count = pst.executeUpdate();
            pst.close();
        } catch (Exception e) {
            //   JOptionPane.showMessageDialog(null, e);
        } finally {
            closeConnection(con);
        }

        return count;
    }

    @Override
    public int update(UsersVo uv) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(UsersVo uv) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UsersVo getDataById(int id) throws Exception {
  Connection con = null;
        UsersVo usersVo = null;
        ResultSet rs = null;
        try {
            con = getConnection();
        
           
            PreparedStatement pst = con.prepareStatement("select*from users where ID=?");
             pst.setInt(1,id);
            rs = pst.executeQuery();
            while (rs.next()) {
                usersVo = new UsersVo();
                usersVo.setId(rs.getInt("id"));
                usersVo.setPassword(rs.getString("PASSWORD"));
                usersVo.setUserName(rs.getString("USERS_NAME"));
                UsersType userType = UsersType.getUsersTypeById(rs.getInt("USERS_TYPE"));
                /**
                 * UsersType is enumerator class with private constructor can
                 * not create object from it we invoke getUsersTypeById method
                 * and send USERS_TYPE parameter to get # of USER in database
                 * (id) to know kind of user(admin,doctor,....)
                 */
                usersVo.setUsersType(userType);   //after we know type of user by id set it invoke setUserType(method) in UserVo

            }
            rs.close();
            pst.close();
        } catch (Exception e) {

        } finally {
            /**
             * invoke method closeConnection in class Dao and close connection
             * if con value not equal null
             */
            closeConnection(con);

        }
        return usersVo; //retrieve usersVo information

    }

}
