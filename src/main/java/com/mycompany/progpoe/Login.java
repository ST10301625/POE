/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField ;
import javax.swing.JTextField ; 


public class Login {
    /////// Variable Declaration ////// 
     String username;
     String password;
     String firstName;
     String lastName ;
     String inputUsername = "" ;
     String inputPassword = "" ;
     boolean isUsernameValid;
     
    /////////////// Declaration of Constants  //////////////////
     String PASSWORD_VALID_MESSAGE = "Password successfully captured";
     String PASSWORD_INVALID_MESSAGE = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
     String USERNAME_INVALID_MESSAGE = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
     String USERNAME_VALID_MESSAGE = "Username successfully captured";

     int PASSWORD_LENGTH = 8;
   /////// Prompts user to enter their full name //////   
   public void askDetails(){
     firstName = JOptionPane.showInputDialog(null,"Enter frist name");
     lastName = JOptionPane.showInputDialog(null,"Enter surname");
   }
  /////// Check done to see if username contains the correct criteria////// 
    public boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {  //////// Checks if username contains an underscore and is less than or equal o 5 digits
            return true;
        } else {
           
            return false;
        }
        
    }
    /////////////// Method to check the password against the requirements //////////////////
    public boolean checkPasswordComplexity(String password) {
     String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        if (password.length()>= 8 && password.matches(specialChars)) {
            return true;
            
        } else {
            return false ;
        }
    }
    /////////////// Method displaying the correct error messaging when a user enters their credentials//////////////////
    public boolean loginUser(String inputUsername, String inputPassword) { 
        if (username.equals(inputUsername)&& username.equals(inputPassword)) {
            return true; 
            
        } else {
            return false ;
        }
        
  
       
    }
    /////// Registering user if the requirements have been met////// 
    public void RegisterUser(){
        while (true) {            
         username = JOptionPane.showInputDialog(null,"Enter Username: ") ; 
            if (checkUsername(username)) {
                JOptionPane.showMessageDialog(null,USERNAME_VALID_MESSAGE );
                break;
                
            } else {
                JOptionPane.showMessageDialog(null, USERNAME_INVALID_MESSAGE);
                continue;
            }
        }
        while (true) {
        password = JOptionPane.showInputDialog(null,"Enter Password: ");
            if (!checkPasswordComplexity(password)) {
                JOptionPane.showMessageDialog(null, PASSWORD_VALID_MESSAGE);
                break;
                
            } else {
                JOptionPane.showMessageDialog(null, PASSWORD_INVALID_MESSAGE);
                continue;
                
            }
        }            
            
        }
    /////////////// Method to return if a users log in was successful or not //////////////////  
    public String returnLoginStatus() {
        JPanel u = new JPanel(new GridLayout(0,1));
        u.add(new JLabel("Username: ")) ;
        JTextField f = new JTextField();
        u.add(f);
        u.add(new JLabel("Password: "));
        JPasswordField pf = new JPasswordField();
        u.add(pf) ;
        
        while (true) { 
            int LoginResult = JOptionPane.showConfirmDialog(null,u,"Login",JOptionPane.OK_CANCEL_OPTION,JOptionPane.OK_OPTION);
            if (LoginResult == JOptionPane.OK_OPTION) {
                String inputUsername = f.getText();
                String inputPassword = new String(pf.getPassword());
                if (!loginUser(inputUsername, inputPassword)) {
                   JOptionPane.showMessageDialog(null, "Welcome, it is great to see you again" );
                   break;
                } else {
                    JOptionPane.showMessageDialog(null,"Username or password incorrect, please try again");
                }
            }else{
                        break;
                        }
            }
return null;
    }
}
                     
            
    
          
                

        
    

    



     
        
          
            
      
        
     
        
          
            
      
  
   






     
            
           

                
                
              
                
      
            
              
            ///////////////////////////////////////////////////////////////// 
            //https://www.youtube.com/watch?v=h0lGGZbK9zE
            ////////////////////////////////////////////////////////////////
            
         
         
           
            


                       
                    
               
                    
                   
         
                
             
                 
                 
                
            
            


        
    
    
    

    

    
    

    
    
   
    
    

