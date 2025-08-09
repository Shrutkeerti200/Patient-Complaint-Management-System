/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Medication;

/**
 *
 * @author SS
 */
public class Medication {
    
    private int drugId;
    private String drugName;
    private String dosage;
    private String frequency;
    

    public Medication(int drugId, String drugName, String dosage, String frequency) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.dosage = dosage;
        this.frequency = frequency;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
