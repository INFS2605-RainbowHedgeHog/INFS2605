/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author manan
 */
public class CarShareOffice {
    
    private int userID;
    private int seekID;
    private int officeID;
    private int agreementID;
    private int adjustmentID;
    private int consultID;
    private int corporateID;
    private int paymentID;
    private User currentAccountID;

    public CarShareOffice() {
    }

    public CarShareOffice(int userID, int seekID, int officeID, int agreementID, int adjustmentID, int consultID, int corporateID, int paymentID, User currentAccountID) {
        this.userID = userID;
        this.seekID = seekID;
        this.officeID = officeID;
        this.agreementID = agreementID;
        this.adjustmentID = adjustmentID;
        this.consultID = consultID;
        this.corporateID = corporateID;
        this.paymentID = paymentID;
        this.currentAccountID = currentAccountID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getSeekID() {
        return seekID;
    }

    public void setSeekID(int seekID) {
        this.seekID = seekID;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public int getAgreementID() {
        return agreementID;
    }

    public void setAgreementID(int agreementID) {
        this.agreementID = agreementID;
    }

    public int getAdjustmentID() {
        return adjustmentID;
    }

    public void setAdjustmentID(int adjustmentID) {
        this.adjustmentID = adjustmentID;
    }

    public int getConsultID() {
        return consultID;
    }

    public void setConsultID(int consultID) {
        this.consultID = consultID;
    }

    public int getCorporateID() {
        return corporateID;
    }

    public void setCorporateID(int corporateID) {
        this.corporateID = corporateID;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public User getCurrentAccountID() {
        return currentAccountID;
    }

    public void setCurrentAccountID(User currentAccountID) {
        this.currentAccountID = currentAccountID;
    }
    
    
    
    
    
}
