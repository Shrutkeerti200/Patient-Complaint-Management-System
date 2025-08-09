/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Complaint;

/**
 *
 * @author SS
 */
public class VitalSigns {
    
    private int bloodPressure;
    private int heartRate;
    private double bodyTemperature;
    private int respiratoryRate;
    private int oxygenSaturation;
    private double bloodSugarLevel;
    private double height; // calculate in meters
    private double weight; // calculate in Kg
    private double bmi; // Calculated using height and weight
    private int painLevel; // Scale: 0 (no pain) to 10 (worst pain)
    private double cholesterolLevel;
    private String ecgResults; // "Normal", "Irregular heartbeat"

    public VitalSigns(int bloodPressure, int heartRate, double bodyTemperature, int respiratoryRate, int oxygenSaturation, double bloodSugarLevel, double height, double weight, double bmi, int painLevel, double cholesterolLevel, String ecgResults) {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.bodyTemperature = bodyTemperature;
        this.respiratoryRate = respiratoryRate;
        this.oxygenSaturation = oxygenSaturation;
        this.bloodSugarLevel = bloodSugarLevel;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.painLevel = painLevel;
        this.cholesterolLevel = cholesterolLevel;
        this.ecgResults = ecgResults;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public int getOxygenSaturation() {
        return oxygenSaturation;
    }

    public double getBloodSugarLevel() {
        return bloodSugarLevel;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public double getCholesterolLevel() {
        return cholesterolLevel;
    }

    public String getEcgResults() {
        return ecgResults;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public void setOxygenSaturation(int oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public void setBloodSugarLevel(double bloodSugarLevel) {
        this.bloodSugarLevel = bloodSugarLevel;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    public void setCholesterolLevel(double cholesterolLevel) {
        this.cholesterolLevel = cholesterolLevel;
    }

    public void setEcgResults(String ecgResults) {
        this.ecgResults = ecgResults;
    }
    
    private void calculateBMI() {
        if (height > 0) {
            this.bmi = weight / (height * height); // Height is already in meters
        } else {
            this.bmi = 0; // Invalid height case
        }
    }
}
