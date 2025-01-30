package com.jocata.externalservices.form;

public class AadhaarResponseForm {
        private Uid uidNumber;
        private Demographic demographic;
        private Photo photo;
        private Mobile mobileNo;
        private Email email;

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Mobile getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Mobile mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Uid getUidNumber() {
        return uidNumber;
    }

    public void setUidNumber(Uid uidNumber) {
        this.uidNumber = uidNumber;
    }
}
