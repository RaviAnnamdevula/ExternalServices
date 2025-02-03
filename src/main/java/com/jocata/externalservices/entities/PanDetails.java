package com.jocata.externalservices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAN")
public class PanDetails {

    @Id
    @Column(name = "panNo", unique = true, nullable = false)
    private String panNo;
    private String panStatus;
    private String panName;
    private String panDob;

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getPanStatus() {
        return panStatus;
    }

    public void setPanStatus(String panStatus) {
        this.panStatus = panStatus;
    }

    public String getPanName() {
        return panName;
    }

    public void setPanName(String panName) {
        this.panName = panName;
    }

    public String getPanDob() {
        return panDob;
    }

    public void setPanDob(String panDob) {
        this.panDob = panDob;
    }
}
