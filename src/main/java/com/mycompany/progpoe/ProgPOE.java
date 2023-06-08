/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;
import javax.swing.JOptionPane;


/**
 *
 * @author totca
 */
public class ProgPOE {
 /////////////// Main Method //////////////////
    public static void main(String[] args) {
 /////////////// Part 1 //////////////////       
        String sUName = "";
        String sPass = "" ; 
       Login u = new Login();
       u.RegisterUser();
       u.checkUsername(sUName);
       u.checkPasswordComplexity(sPass) ; 
       u.loginUser(sUName,sPass);
       u.returnLoginStatus(); 
  /////////////// Part 2 //////////////////       
       Task t = new Task();
       int numTasks = 0;
        t.addTaskDetails(numTasks);

        
      
       
       
       
    }
}



      