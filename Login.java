/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author elyse
 */
public class Login {
    private Login loginScreen;

//constructor

    public Login(Login loginScreen) {
        this.loginScreen = loginScreen;
    }
    
//getter
    public Login getLoginScreen() {    
        return loginScreen;
    }

//setter
    public void setLoginScreen(Login loginScreen) {
        this.loginScreen = loginScreen;
    }
    
    
    
}
