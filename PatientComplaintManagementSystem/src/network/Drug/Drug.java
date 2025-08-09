/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Drug;

import java.util.Date;

/**
 *
 * @author SS
 */
public class Drug {
    
    private String drugId;
    private String drugName;
    private double price;

    private boolean isAvailable;
    private String Avail;
    private Date expDate;

    private int availablility;


    public Drug(String drugId, String drugName, double price, int availablility) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.price = price;
        this.availablility = availablility;
    }

    public String getAvail() {
        return Avail;
    }

    public void setAvail(String Avail) {
        this.Avail = Avail;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    
    
    
    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailablility() {
        return availablility;
    }

    public void setAvailablility(int availablility) {
        this.availablility = availablility;
    }

    // Method to check the price of the drug
    public double checkPrice() {
        return price;
    }
}
