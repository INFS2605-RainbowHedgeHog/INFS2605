/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Jane Ji Hee Kim
 */
public class Payment {

    protected String date;
    private String ID;
    private String paymentAccount;
    private String paymentType;
    private String accountExpiry;
    private String accountOwnerName;
    private String pamentMedia;
    protected double amount;

    public Payment() {

    }

    public Payment(double amount, String date, String ID, String paymentAccount, String paymentType, String accountExpiry, String accountOwnerName, String pamentMedia) {
        this.amount = amount;
        this.date = date;
        this.ID = ID;
        this.paymentAccount = paymentAccount;
        this.paymentType = paymentType;
        this.accountExpiry = accountExpiry;
        this.accountOwnerName = accountOwnerName;
        this.pamentMedia = pamentMedia;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAccountExpiry() {
        return accountExpiry;
    }

    public void setAccountExpiry(String accountExpiry) {
        this.accountExpiry = accountExpiry;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public String getPamentMedia() {
        return pamentMedia;
    }

    public void setPamentMedia(String pamentMedia) {
        this.pamentMedia = pamentMedia;
    }

}
