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
public class CarShareSystem {
    private String DATA_FILE = "database.txt";
    
    //constuctor

    public CarShareSystem() {
    }
    
    //getter

    public String getDATA_FILE() {
        return DATA_FILE;
    }
    
    
    //setter 
    public void setDATA_FILE(String DATA_FILE) {
        this.DATA_FILE = DATA_FILE;
    }
    
}
