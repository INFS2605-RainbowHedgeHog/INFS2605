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
public class Agreement {
    
    private Member seeker;
    private Member offerer;
    private String status;
    private String payAmt;
    private String agreeDate;
    private String uniqueNo;
    private String createDay;
    private String initiateBy;
    private CarOffer offer;
    private Double offerReceivable;
    private Long toPin;
    private Long fromPin;
    private Long pUpFrom;
    private Long pUpTo;
    private String day;

    //construcctor
    public Agreement(Member seeker, Member offerer, String status, String payAmt, String agreeDate, String uniqueNo, String createDay, String initiateBy, CarOffer offer, Double offerReceivable, Long toPin, Long fromPin, Long pUpFrom, Long pUpTo, String day) {
        this.seeker = seeker;
        this.offerer = offerer;
        this.status = status;
        this.payAmt = payAmt;
        this.agreeDate = agreeDate;
        this.uniqueNo = uniqueNo;
        this.createDay = createDay;
        this.initiateBy = initiateBy;
        this.offer = offer;
        this.offerReceivable = offerReceivable;
        this.toPin = toPin;
        this.fromPin = fromPin;
        this.pUpFrom = pUpFrom;
        this.pUpTo = pUpTo;
        this.day = day;
    }
    
    // getter
    
    public Member getSeeker() {
        return seeker;
    }

    public Member getOfferer() {
        return offerer;
    }

    public String getStatus() {
        return status;
    }

    public String getPayAmt() {
        return payAmt;
    }

    public String getAgreeDate() {
        return agreeDate;
    }

    public String getUniqueNo() {
        return uniqueNo;
    }

    public String getCreateDay() {
        return createDay;
    }

    public String getInitiateBy() {
        return initiateBy;
    }

    public CarOffer getOffer() {
        return offer;
    }

    public Double getOfferReceivable() {
        return offerReceivable;
    }

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

    public String getDay() {
        return day;
    }
    
    //setter

    public void setSeeker(Member seeker) {
        this.seeker = seeker;
    }

    public void setOfferer(Member offerer) {
        this.offerer = offerer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPayAmt(String payAmt) {
        this.payAmt = payAmt;
    }

    public void setAgreeDate(String agreeDate) {
        this.agreeDate = agreeDate;
    }

    public void setUniqueNo(String uniqueNo) {
        this.uniqueNo = uniqueNo;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    public void setInitiateBy(String initiateBy) {
        this.initiateBy = initiateBy;
    }

    public void setOffer(CarOffer offer) {
        this.offer = offer;
    }

    public void setOfferReceivable(Double offerReceivable) {
        this.offerReceivable = offerReceivable;
    }

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

    public void setDay(String day) {
        this.day = day;
    }

    
}
