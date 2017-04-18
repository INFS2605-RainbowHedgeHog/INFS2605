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
public class UserOption {
    protected Long toPin;
    protected Long fromPin;
    protected Long pUpFrom;
    protected Long pUpTo;
    protected String date;
    protected Vector agreementList;
    protected String uniqueNo;
    protected Int flag;
    protected String createDay;

    //setters
    public void setToPin(Long toPin) {
        this.toPin = toPin;
    }

    public void setFromPin(Long fromPin) {
        this.fromPin = fromPin;
    }

    public void setpUpFrom(Long pUpFrom) {
        this.pUpFrom = pUpFrom;
    }

    public void setpUpTo(Long pUpTo) {
        this.pUpTo = pUpTo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAgreementList(Vector agreementList) {
        this.agreementList = agreementList;
    }

    public void setUniqueNo(String uniqueNo) {
        this.uniqueNo = uniqueNo;
    }

    public void setFlag(Int flag) {
        this.flag = flag;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    
    //getters
    public Long getToPin() {
        return toPin;
    }

    public Long getFromPin() {
        return fromPin;
    }

    public Long getpUpFrom() {
        return pUpFrom;
    }

    public Long getpUpTo() {
        return pUpTo;
    }

    public String getDate() {
        return date;
    }

    public Vector getAgreementList() {
        return agreementList;
    }

    public String getUniqueNo() {
        return uniqueNo;
    }

    public Int getFlag() {
        return flag;
    }

    public String getCreateDay() {
        return createDay;
    }

    //constructor
    public UserOption(Long toPin, Long fromPin, Long pUpFrom, Long pUpTo, String date, Vector agreementList, String uniqueNo, Int flag, String createDay) {
        this.toPin = toPin;
        this.fromPin = fromPin;
        this.pUpFrom = pUpFrom;
        this.pUpTo = pUpTo;
        this.date = date;
        this.agreementList = agreementList;
        this.uniqueNo = uniqueNo;
        this.flag = flag;
        this.createDay = createDay;
    }
    
}
