/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progpoe;

import javax.swing.JOptionPane;

public class Login {
    /////////////// Declaration of variables //////////////////
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final boolean isUsernameValid;
    private final boolean isPasswordValid;
    /////////////// Declaration of Constants  //////////////////
    private final String PASSWORD_VALID_MESSAGE = "Password successfully captured";
    private final String PASSWORD_INVALID_MESSAGE = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
    private final String USERNAME_INVALID_MESSAGE = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
    private final String USERNAME_VALID_MESSAGE = "Username successfully captured";

    private final int PASSWORD_LENGTH = 8;

    public Login() {
        /////////////// Prompts to obtain users Information //////////////////
        firstName = JOptionPane.showInputDialog(null, "Enter first name:");
        lastName = JOptionPane.showInputDialog(null, "Enter last name:");
        username = JOptionPane.showInputDialog(null, "Enter username:");
        isUsernameValid = checkUsername(username); /////////// Check done to see if the username is in the correct format

        password = JOptionPane.showInputDialog(null, "Enter password:");
        isPasswordValid = checkPasswordComplexity(password); //////////////// Check to see if password follows the correct criteria

        if (isUsernameValid && isPasswordValid) {
            JOptionPane.showMessageDialog(null, "Account created successfully."); 
        }
    }
 /////////////// Method to check username against the requirements//////////////////
    public final boolean checkUsername(String username) {
        if (username.contains("_") && username.length() <= 5) {  //////// Checks if username contains an underscore and is less than or equal o 5 digits
            JOptionPane.showMessageDialog(null, USERNAME_VALID_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, USERNAME_INVALID_MESSAGE);
            return false;
        }
    }
 /////////////// Method to check the password against the requirements //////////////////
    public final boolean checkPasswordComplexity(String password) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?"; /////// Declaration of special characters
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= PASSWORD_LENGTH) {
            for (char cCheck : password.toCharArray()) {
                if (Character.isUpperCase(cCheck)) { /// Checking if the password contains a letter of uppercase
                    hasUppercase = true; 
                } else if (Character.isLowerCase(cCheck)) { /// Checks if the password contains 
                    hasLowercase = true;
                } else if (Character.isDigit(cCheck)) { /// /// Checks if the password contains a number
                    hasNumber = true;
                } else if (specialChars.contains(Character.toString(cCheck))) { /// Checks if the password contains a special character
                    hasSpecialChar = true;
                }
            }
        }

        if (hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {   /// if password meets/does not the requirements, the appropriate error message will be shown
            JOptionPane.showMessageDialog(null, PASSWORD_VALID_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, PASSWORD_INVALID_MESSAGE);
            return false;
        }
    }
 /////////////// Method displaying the correct error messaging when a user enters their credentials//////////////////
    public boolean loginUser() { 
       
        String inputUsername = JOptionPane.showInputDialog(null, "Enter username:");
        String inputPassword = JOptionPane.showInputDialog(null, "Enter password:");

        if (inputUsername.equals(username) && inputPassword.equals(password)) {  ///Checks to see if the username entered matches as well as the password
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + "! It's good to see you again.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username or password."); /// error message
            return false;
        }
    }
   /////////////// Method to return if a users log in was successful or not //////////////////  
    public String returnLoginStatus() {
        String inputUsername = JOptionPane.showInputDialog(null, "Enter username:");
        String inputPassword = JOptionPane.showInputDialog(null, "Enter password:");

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            return "Welcome " + firstName + " " + lastName + " it is great to see you again!" ;
        }
        return "Username or Password does not match";
        }
}
        
    

    



     
        
          
            
      
        
     
        
          
            
      
  
   






     
            
           

                
                
              
                
      
            
              
            ///////////////////////////////////////////////////////////////// 
            //https://www.youtube.com/watch?v=h0lGGZbK9zE
            ////////////////////////////////////////////////////////////////
            
         
         
           
            


                       
                    
               
                    
                   
         
                
             
                 
                 
                
            
            


        
    
    
    

    

    
    

    
    
   
    
    

