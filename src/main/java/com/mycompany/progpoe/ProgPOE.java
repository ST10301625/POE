/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpoe;


/**
 *
 * @author totca
 */
public class ProgPOE {
 /////////////// Main Method //////////////////
    public static void main(String[] args) {
        String sUName = "";
        String sPass = "" ;
       Login u = new Login();
       u.checkUsername(sUName);
       u.checkPasswordComplexity(sPass) ; 
       u.loginUser();
       u.returnLoginStatus();
    }
}


      