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
public class User {

    private String ID;
    private String name;
    private int userType;
    private String gender;
    private int age;
    private String homeAddr;
    private String compAddr;
    private long homepCode;
    private long companypCode;
    private long homeNum;
    private long hpNum;
    private String email;
    private String vehicle;

    public User() {

    }

    public User(String ID, String name, int userType, String gender, int age, String homeAddr, String compAddr, long homepCode, long companypCode, long homeNum, long hpNum, String email, String vehicle) {
        this.ID = ID;
        this.name = name;
        this.userType = userType;
        this.gender = gender;
        this.age = age;
        this.homeAddr = homeAddr;
        this.compAddr = compAddr;
        this.homepCode = homepCode;
        this.companypCode = companypCode;
        this.homeNum = homeNum;
        this.hpNum = hpNum;
        this.email = email;
        this.vehicle = vehicle;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public String getCompAddr() {
        return compAddr;
    }

    public void setCompAddr(String compAddr) {
        this.compAddr = compAddr;
    }

    public long getHomepCode() {
        return homepCode;
    }

    public void setHomepCode(long homepCode) {
        this.homepCode = homepCode;
    }

    public long getCompanypCode() {
        return companypCode;
    }

    public void setCompanypCode(long companypCode) {
        this.companypCode = companypCode;
    }

    public long getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(long homeNum) {
        this.homeNum = homeNum;
    }

    public long getHpNum() {
        return hpNum;
    }

    public void setHpNum(long hpNum) {
        this.hpNum = hpNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

}
