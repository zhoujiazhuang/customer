package edu.lfsfxy.customer.entity;

import java.util.Date;

public class Customer {
    private int custId;
    private String custName;
    private int  custUserId;
    private int custCreateId;
    private String custSource;
    private String custIndustry;
    private String custLevel;
    private String custLinkman;
    private String custPhone;
    private String custMobile;
    private String custZipcode;
    private String custAddress;
    private Date custCreatetime;

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName='" + custName + '\'' + ", custUserId=" + custUserId + ", custCreateId=" + custCreateId + ", custSource='" + custSource + '\'' + ", custIndustry='" + custIndustry + '\'' + ", custLevel='" + custLevel + '\'' + ", custLinkman='" + custLinkman + '\'' + ", custPhone='" + custPhone + '\'' + ", custMobile='" + custMobile + '\'' + ", custZipcode='" + custZipcode + '\'' + ", custAddress='" + custAddress + '\'' + ", custCreatetime=" + custCreatetime + '}';
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(int custUserId) {
        this.custUserId = custUserId;
    }

    public int getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(int custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public Date getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(Date custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    public Customer() {
    }

    public Customer(int custId, String custName, int custUserId, int custCreateId, String custSource, String custIndustry, String custLevel, String custLinkman, String custPhone, String custMobile, String custZipcode, String custAddress, Date custCreatetime) {

        this.custId = custId;
        this.custName = custName;
        this.custUserId = custUserId;
        this.custCreateId = custCreateId;
        this.custSource = custSource;
        this.custIndustry = custIndustry;
        this.custLevel = custLevel;
        this.custLinkman = custLinkman;
        this.custPhone = custPhone;
        this.custMobile = custMobile;
        this.custZipcode = custZipcode;
        this.custAddress = custAddress;
        this.custCreatetime = custCreatetime;
    }
}
