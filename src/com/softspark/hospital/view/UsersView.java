/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softspark.hospital.view;

import com.softspark.hospital.database.dao.UserDetailsDao;
import com.softspark.hospital.database.dao.UsersDao;
import com.softspark.hospital.database.type.UsersType;
import com.softspark.hospital.database.vo.UserDetailsVo;
import com.softspark.hospital.database.vo.UsersVo;
import com.softspark.hospital.validation.Validation;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo_(O_o)
 */
public class UsersView extends javax.swing.JFrame {
public static byte[]imageByte;
    /**
     * Creates new form UsersView
     */
    public UsersView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cUserType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFisrtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnChooseImage = new javax.swing.JButton();
        txtImagePath = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ID");

        jLabel2.setText("User name");

        jLabel3.setText("Password");

        jLabel4.setText("User type");

        cUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Nurse" }));
        cUserType.setToolTipText("");
        cUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUserTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("First name");

        jLabel6.setText("Father name");

        jLabel7.setText("Mobile");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operation"));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnChooseImage.setText("Choose image");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });

        btnInsert.setText("Add");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtImagePath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChooseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChooseImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addContainerGap())
        );

        jLabel9.setText("User image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(59, 59, 59)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFisrtName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cUserType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(lImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFisrtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        boolean isTextEmpty = Validation.isEmpty(txtId.getText(), txtUserName.getText(), txtPassword.getText(), txtFisrtName.getText(), txtFatherName.getText(), txtMobile.getText());
        boolean isEmpty = Validation.isEmpty(cUserType.getSelectedIndex());
        boolean isDigit = Validation.isDigit(txtId.getText(), txtMobile.getText());
        boolean isText = Validation.isText(txtUserName.getText(), txtPassword.getText(), txtFisrtName.getText(), txtFatherName.getText());
        if (isDigit == false || isText == false) { //if any field not be inserted look like it dataType required appear message
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        if (isTextEmpty == true || isEmpty == true) {
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        int id = Integer.valueOf(txtId.getText());
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
//        if (cUserType.getSelectedIndex() == -1) {
//            JOptionPane.showMessageDialog(null, "please select valid usertype");
//        }
    
 
        UsersType userType = UsersType.getUsersTypeById(cUserType.getSelectedIndex()+1);
        /**
         * here will retrieve selected index from comboBox it will be (1
         * ,for,admin),(2,doctor),(3,nurse) and send it to method
         * getUsersTypeById in UsersType class
         */ 
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        usersVo.setUserName(userName);
        usersVo.setPassword(password);
        usersVo.setUsersType(userType);
        String firstName = txtFisrtName.getText();
        String fatherName = txtFatherName.getText();
        String mobile = txtMobile.getText();
       
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        userDetailsVo.setImage(imageByte);
       
        try {
            //int usersCount = UsersDao.getInstance().insert(usersVo);
            int count = UserDetailsDao.getInstance().insert(userDetailsVo);

            if (count == 1) {
                JOptionPane.showMessageDialog(null, "Insert successfully");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, "Insert not successfully");

            } 
        } catch (Exception ex) {
            Logger.getLogger(UsersView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        boolean isEmpty = Validation.isEmpty(txtId.getText());
        boolean isDigit = Validation.isDigit(txtId.getText());
        if (isEmpty == true) {
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        if (isDigit == false) { //if any field not be inserted look like it dataType required appear message
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        int id = Integer.valueOf(txtId.getText());
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        try {
            UsersVo uv = UsersDao.getInstance().getDataById(id);
            if (uv == null) {
                JOptionPane.showMessageDialog(null, "Please enter valid ID");
            }
            int count = UserDetailsDao.getInstance().delete(userDetailsVo);
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "delete successfully");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, "delete not successfully");

            }
        } catch (Exception ex) {
            Logger.getLogger(UsersView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        boolean isTextEmpty = Validation.isEmpty(txtId.getText(), txtUserName.getText(), txtPassword.getText(), txtFisrtName.getText(), txtFatherName.getText(), txtMobile.getText());
        boolean isEmpty = Validation.isEmpty(cUserType.getSelectedIndex());
        boolean isDigit = Validation.isDigit(txtId.getText(), txtMobile.getText());
        boolean isText = Validation.isText(txtUserName.getText(), txtPassword.getText(), txtFisrtName.getText(), txtFatherName.getText());
        if (isDigit == false || isText == false) {
            //if any field not be inserted look like it dataType required appear message
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        if (isTextEmpty == true || isEmpty == true) {
            JOptionPane.showMessageDialog(null, "Please enter valid data");
            return;
        }
        int id = Integer.valueOf(txtId.getText());
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        //        if (cUserType.getSelectedIndex() == -1) {
            //            JOptionPane.showMessageDialog(null, "please select valid usertype");
            //        }

        UsersType userType = UsersType.getUsersTypeByType(cUserType.getSelectedItem().toString().toLowerCase());
        /**
        * here will retrieve selected index from comboBox it will be (1
            * ,for,admin),(2,doctor),(3,nurse) and send it to method
        * getUsersTypeById in UsersType class
        */
        UsersVo usersVo = new UsersVo();
        usersVo.setId(id);
        usersVo.setUserName(userName);
        usersVo.setPassword(password);
        usersVo.setUsersType(userType);
        String firstName = txtFisrtName.getText();
        String fatherName = txtFatherName.getText();
        String mobile = txtMobile.getText();
        UserDetailsVo userDetailsVo = new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        userDetailsVo.setImage(imageByte);
        try {
            UsersVo uv = UsersDao.getInstance().getDataById(id);
            if (uv == null) {
                JOptionPane.showMessageDialog(null, "Please enter valid ID");
            }
            int count = UserDetailsDao.getInstance().update(userDetailsVo);
            if (count == 1) {
                JOptionPane.showMessageDialog(null, "update successfully");
                reset();
            } else {
                JOptionPane.showMessageDialog(null, "update not successfully");

            }
        } catch (Exception ex) {
            Logger.getLogger(UsersView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        /**code from web*/
        JFileChooser jFileChooser=new JFileChooser();
        jFileChooser.showOpenDialog(null);
        File file=jFileChooser.getSelectedFile();
        String ImagePath=file.getAbsolutePath();
        txtImagePath.setText(ImagePath);
        try{
            File file2=new File(ImagePath);
            FileInputStream fis=new FileInputStream(file2);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[]length=new byte[1024];
            for(int i;(i=fis.read(length))!=-1;){
                baos.write(length,0,1 );
            }imageByte=baos.toByteArray();
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUserTypeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        boolean isTextEmpty=Validation.isEmpty(txtId.getText());
        boolean isDigit=Validation.isDigit(txtId.getText());
        if(isDigit==false){
            JOptionPane.showMessageDialog(null,"Please enter valid Id");
            return;
        }
       if( isTextEmpty==true)
       {
               JOptionPane.showMessageDialog(null,"Please enter valid Id");
            return;
       }
        try{
            int id=Integer.valueOf(txtId.getText());
            UserDetailsVo userDetailsVo=UserDetailsDao.getInstance().getDataById(id);
            
            if(userDetailsVo==null){
                JOptionPane.showMessageDialog(null,"id not exist");
                txtId.setText("");
                return;
            }else{

                txtUserName.setText(userDetailsVo.getUsersVo().getUserName());
                txtPassword.setText(userDetailsVo.getUsersVo().getPassword());
                txtFisrtName.setText(userDetailsVo.getFirstName());
                txtFatherName.setText(userDetailsVo.getFatherName());
                txtMobile.setText(userDetailsVo.getMobile());
                cUserType.setSelectedIndex(userDetailsVo.getUsersVo().getUsersType().getId()-1);
                byte[]imageByte=userDetailsVo.getImage();
              ImageIcon imageIcon=new ImageIcon(imageByte);
              lImage.setIcon(imageIcon);
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnSearchActionPerformed
    protected void reset() {
        txtId.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtFisrtName.setText("");
        txtFatherName.setText("");
        txtMobile.setText("");
        cUserType.setSelectedIndex(0);
        txtImagePath.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lImage;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFisrtName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
