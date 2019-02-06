/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.dao;

import com.softspark.hospital.database.type.UsersType;
import com.softspark.hospital.database.vo.UserDetailsVo;
import com.softspark.hospital.database.vo.UsersVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo_(O_o)
 */
public class UserDetailsDao extends Dao implements DaoList<UserDetailsVo> {

    private static UserDetailsDao userDetailsDao;      //use  Singleton Pattern design pattern

    private UserDetailsDao() {                          // to prevent create object                  
    }

    public static UserDetailsDao getInstance() {               // to create object from UserDeatailsDao
        if (userDetailsDao == null) {
            userDetailsDao = new UserDetailsDao();
        }
        return userDetailsDao;
    }

    @Override
    public List<UserDetailsVo> loadAll(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(UserDetailsVo udv) throws Exception {
        Connection con = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            /**
             * don't commit with sequence below until error will happen in any
             * insert statement nothing will happen in database or change data
             * in it and will see change if code run without Exception or wrong
             */
            String usersDetailsSql = "insert into users_details(USER_ID,FIRST_NAME,FATHER_NAME,MOBILE,image)values('" + udv.getUsersVo().getId() + "','" + udv.getFirstName() + "','" + udv.getFatherName() + "','" + udv.getMobile() + "','" + udv.getImage() + "')";
            pst = con.prepareStatement(usersDetailsSql);
            String userSql = "insert into users(ID,USER_NAME,PASSWORD,USER_TYPE)VALUES(?,?,?,?)";

            pst = con.prepareStatement(userSql);

            pst.setInt(1, udv.getUsersVo().getId());

            pst.setString(2, udv.getUsersVo().getUserName());

            pst.setString(3, udv.getUsersVo().getPassword());
            pst.setInt(4, udv.getUsersVo().getUsersType().getId());
            //  pst.setInt(1, udv.getUsersVo().getId());   //USERID is foreign key referenc to USERS(id)
            // pst.setString(2, udv.getFirstName());
            //   pst.setString(3, udv.getFatherName());
            //  pst.setString(4, udv.getMobile());

            pst.executeUpdate();                //if pst executed will return 1 if not will return 2
            con.commit();                       //didn't arrive here if happened any Exception
            count = 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

            con.rollback();                   //here say if happened any exception undo any insert in tables
        } finally {
            pst.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public int update(UserDetailsVo udv) throws Exception {
        Connection con = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            /**
             * don't commit with sequence below until error will happen in any
             * insert statement nothing will happen in database or change data
             * in it and will see change if code run without Exception or wrong
             */
            String userSql = "update users set USER_NAME=?,PASSWORD=?,USER_TYPE=?where ID=?";
            pst = con.prepareStatement(userSql);
            pst.setString(1, udv.getUsersVo().getUserName());
            pst.setString(2, udv.getUsersVo().getPassword());
            pst.setInt(3, udv.getUsersVo().getUsersType().getId());
            pst.setInt(4, udv.getUsersVo().getId());
            pst.executeUpdate();
            String usersDetailsSql = "update users_details set FIRST_NAME=?,FATHER_NAME=?,MOBILE=?,image=? where USER_ID=?";
            pst = con.prepareStatement(usersDetailsSql);

            pst.setString(1, udv.getFirstName());
            pst.setString(2, udv.getFatherName());
            pst.setString(3, udv.getMobile());
            pst.setBytes(4, udv.getImage());
            pst.setInt(5, udv.getUsersVo().getId());
            pst.executeUpdate();                //if pst executed will return 1 if not will return 2
            con.commit();                       //didn't arrive here if happened any Exception
            count = 1;
        } catch (Exception e) {
            con.rollback();                   //here say if happened any exception undo any insert in tables
        } finally {
            pst.close();
            closeConnection(con);
        }
        return count;
    }

    @Override
    public int delete(UserDetailsVo udv) throws Exception {
        Connection con = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            con = getConnection();
            con.setAutoCommit(false);
            /**
             * don't commit with sequence below until error will happen in any
             * insert statement nothing will happen in database or change data
             * in it and will see change if code run without Exception or wrong
             */
            String usersDetailsSql = "delete from users_details where USER_ID=?";
            pst = con.prepareStatement(usersDetailsSql);
            pst.setInt(1, udv.getUsersVo().getId());   //USERID is foreign key referenc to USERS(id)
            pst.executeUpdate();                //if pst executed will return 1 if not will return 2
            String userSql = "delete from users where ID=?";
            pst = con.prepareStatement(userSql);

            pst.setInt(1, udv.getUsersVo().getId());
            pst.executeUpdate();

            con.commit();                       //didn't arrive here if happened any Exception
            count = 1;
        } catch (Exception e) {
            con.rollback();                   //here say if happened any exception undo any insert in tables
        } finally {
            pst.close();
            closeConnection(con);
        }
        return count;

    }

    @Override
    public UserDetailsVo getData(UserDetailsVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDetailsVo getDataById(int id) throws Exception {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        UsersVo usersVo = null;
        UserDetailsVo usersDetailsVo = null;

        try {
            con = getConnection();

            String userSql = "select users.ID ,users.USER_NAME, users.PASSWORD, users.USER_TYPE,users_details.FIRST_NAME,users_details.FATHER_NAME,users_details.MOBILE,users_details.image from users inner join users_details on users_details.USER_ID=users.ID where users.ID=?";
            /**
             * we made join between users_details and users table on condition
             * [used on query to make that] USERS_DETAILS.ID=USERS.ID where
             * USERS.ID= (inserted id)
             */
            pst = con.prepareStatement(userSql);
            pst.setInt(1, id);

            rs = pst.executeQuery();
            while (rs.next()) {
                usersVo = new UsersVo();
                usersVo.setId(rs.getInt("ID"));
                usersVo.setUserName(rs.getString("USER_NAME"));
                usersVo.setPassword(rs.getString("PASSWORD"));
                UsersType usersType = UsersType.getUsersTypeById(rs.getInt("USER_TYPE"));
                usersVo.setUsersType(usersType);
                usersDetailsVo = new UserDetailsVo();
                usersDetailsVo.setFirstName(rs.getString("FIRST_NAME"));
                usersDetailsVo.setFatherName(rs.getString("FATHER_NAME"));
                usersDetailsVo.setMobile(rs.getString("MOBILE"));
                usersDetailsVo.setImage(rs.getBytes("image"));
                usersDetailsVo.setUsersVo(usersVo);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

            //here say if happened any exception undo any insert in tables
        } finally {
            rs.close();
            pst.close();
            closeConnection(con);
        }
        return usersDetailsVo;
    }

}
