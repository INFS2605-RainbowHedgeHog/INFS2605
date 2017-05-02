
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Hashtable;

/**
 *
 * @author manan
 */
public class AgreementList {
    
    private Hashtable mainAgreementList;
    
    // No arg constructor
    public AgreementList() {        
        mainAgreementList = new Hashtable();
    }
    
    
    // Getter methods
    public Hashtable getMainAgreementList() {
        return mainAgreementList;
    }
    
    // Setter methods
    public void setMainAgreementList(Hashtable mainAgreementList) {
        this.mainAgreementList = mainAgreementList;
    }
    
    
    
}

