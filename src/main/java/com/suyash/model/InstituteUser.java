package com.suyash.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InstituteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int instituteId;

    private int clgUid;
    private String clgName;
    private String username;

    private String password;
    private String clgPan;
    private String placementOfficer;
    private String email;
    private Date regDate;
    private String phone;

    public int getClgUid() {
        return clgUid;
    }

    public void setClgUid(int clgUid) {
        this.clgUid = clgUid;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getClgPan() {
        return clgPan;
    }

    public void setClgPan(String clgPan) {
        this.clgPan = clgPan;
    }

    public String getPlacementOfficer() {
        return placementOfficer;
    }

    public void setPlacementOfficer(String placementOfficer) {
        this.placementOfficer = placementOfficer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
