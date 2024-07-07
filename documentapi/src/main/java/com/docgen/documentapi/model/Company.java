package com.docgen.documentapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyID;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(length = 255)
    private String shortName;

    @Column(length = 255, unique = true)
    private String registrationNumber;

    @Column(length = 255, unique = true)
    private String tinNumber;

    @Column(length = 255, unique = true)
    private String panNumber;

    @Column(length = 255, unique = true)
    private String gstin;

    @Column(length = 255, unique = true)
    private String iec;

    @Column(length = 20)
    private String phone;

    @Column(length = 255)
    private String email;

    @Column(length = 255)
    private String logo;

    @Column(length = 255)
    private String website;

    // Constructors, getters, and setters
    public Company() {
    }

    public Company(int companyID, String name, String shortName, String registrationNumber, String tinNumber, String panNumber, String gstin, String iec, String phone, String email, String logo, String website) {
        this.companyID = companyID;
        this.name = name;
        this.shortName = shortName;
        this.registrationNumber = registrationNumber;
        this.tinNumber = tinNumber;
        this.panNumber = panNumber;
        this.gstin = gstin;
        this.iec = iec;
        this.phone = phone;
        this.email = email;
        this.logo = logo;
        this.website = website;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getIec() {
        return iec;
    }

    public void setIec(String iec) {
        this.iec = iec;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    
}