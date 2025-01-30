package com.jocata.externalservices.form;

public class Mobile {
    private String mobileNo;
    private String hashedMobile;
    private String maskedMobile;

    public String getHashedMobile() {
        return hashedMobile;
    }

    public void setHashedMobile(String hashedMobile) {
        this.hashedMobile = hashedMobile;
    }

    public String getMaskedMobile() {
        return maskedMobile;
    }

    public void setMaskedMobile(String maskedMobile) {
        this.maskedMobile = maskedMobile;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
