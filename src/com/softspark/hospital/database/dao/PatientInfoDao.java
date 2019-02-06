/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.database.dao;

import static com.softspark.hospital.database.dao.Dao.getConnection;
import com.softspark.hospital.database.vo.PatientInfoVo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo_(O_o)
 */
public class PatientInfoDao extends Dao implements DaoList<PatientInfoVo>{
    
    private static PatientInfoDao patientInfoDao;
    
    private PatientInfoDao(){
        
    }
public static PatientInfoDao getinstance(){
    if(patientInfoDao==null)
     patientInfoDao=new PatientInfoDao();
return patientInfoDao;    
}

    @Override
    public List<PatientInfoVo> loadAll(PatientInfoVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(PatientInfoVo piv) throws Exception {
Connection con = null;
        PreparedStatement pst = null;
        int count = 0;
        try {
            con = getConnection();
 
            String patientInfoSql = "insert into patient_info(ID,FIRST_NAME,FATHER_NAME,AGE,GENDER,MOBILE,EMAIL,USER_ID)values(?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(patientInfoSql);
           pst.setInt(1, piv.getId());

            pst.setString(2, piv.getFirstName());
        pst.setString(3, piv.getfatherName());
        pst.setInt(4, piv.getAge());
            pst.setString(5,piv.getGender());
            pst.setString(6,piv.getMobile());
            pst.setString(7,piv.getEmail());
            pst.setInt(4, piv.getUsersVo().getId());
            //  pst.setInt(1, udv.getUsersVo().getId());   //USERID is foreign key referenc to USERS(id)
            // pst.setString(2, udv.getFirstName());
            //   pst.setString(3, udv.getFatherName());
            //  pst.setString(4, udv.getMobile());

           count= pst.executeUpdate();                //if pst executed will return 1 if not will return 2
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
    public int update(PatientInfoVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(PatientInfoVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientInfoVo getData(PatientInfoVo t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PatientInfoVo getDataById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}