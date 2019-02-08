/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem;

import com.softspark.hospital.view.Login;

/**
 *
 * @author abdo_(O_o)
 */
public class HospitalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //the form appear to users to login into program
        //by default user is admin and password is admin
    Login login=new Login();
    login.setVisible(true);
    }
    
}
