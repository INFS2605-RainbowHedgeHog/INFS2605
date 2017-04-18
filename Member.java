/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Vector;


/**
 *
 * @author manan
 */
public class Member {
    
    private String lastMatchDate;
    private Vector offerList;
    private Vector agreementList;
    private Vector payment;
    private int commissionRate;
    private CorporateMember corporateMem;
    private MembershipPayment membershipPayment;
    private String creditCard;
    private String accountExpiry;
    private String accountOwnerName;
    private String paymentMedia;
    private String password;

    public Member() {
    }
    
    public Member(String lastMatchDate, Vector offerList, Vector agreementList, Vector payment, int commissionRate, CorporateMember corporateMem, String password) {
        this.lastMatchDate = lastMatchDate;
        this.offerList = offerList;
        this.agreementList = agreementList;
        this.payment = payment;
        this.commissionRate = commissionRate;
        this.corporateMem = corporateMem;
        this.password = password;
    }

    public void setLastMatchDate(String lastMatchDate) {
        this.lastMatchDate = lastMatchDate;
    }

    public void setOfferList(Vector offerList) {
        this.offerList = offerList;
    }

    public void setAgreementList(Vector agreementList) {
        this.agreementList = agreementList;
    }

    public void setPayment(Vector payment) {
        this.payment = payment;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setCorporateMem(CorporateMember corporateMem) {
        this.corporateMem = corporateMem;
    }

    public void setMembershipPayment(MembershipPayment membershipPayment) {
        this.membershipPayment = membershipPayment;
    }

    public void setPaymentMedia(String paymentMedia) {
        this.paymentMedia = paymentMedia;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setCreditCardInfo(String creditCard, String accountExpiry, String accountOwnerName) {
        this.creditCard = creditCard;
        this.accountExpiry = accountExpiry;
        this.accountOwnerName = accountOwnerName;
    }
    
    public void getCreditCardInfo() {
        System.out.println("Credit Card: " + this.creditCard);
        System.out.println("Account Expiry: " + this.accountExpiry);
        System.out.println("Account Owner Name: " + this.accountOwnerName);
    }

    public String getLastMatchDate() {
        return lastMatchDate;
    }

    public Vector getOfferList() {
        return offerList;
    }

    public Vector getAgreementList() {
        return agreementList;
    }

    public Vector getPayment() {
        return payment;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public CorporateMember getCorporateMem() {
        return corporateMem;
    }

    public MembershipPayment getMembershipPayment() {
        return membershipPayment;
    }

    public String getPaymentMedia() {
        return paymentMedia;
    }

    
    
    
    
    
}
