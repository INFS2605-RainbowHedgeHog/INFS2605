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
public class Consultation {

    private int consultantNum;
    private float price;
    private String createdDate;

    public Consultation() {

    }

    public Consultation(int consultantNum, float price, String createdDate) {
        this.consultantNum = consultantNum;
        this.price = price;
        this.createdDate = createdDate;
    }

    public int getConsultantNum() {
        return consultantNum;
    }

    public void setConsultantNum(int consultantNum) {
        this.consultantNum = consultantNum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

}
