/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Medication;

import java.util.ArrayList;
import network.Drug.Drug;
import network.Drug.DrugCatalog;

/**
 *
 * @author SS
 */
public class MedicationOrder {
    
    private String orderId;
    private String patientId;
    //private String drugId;
    private String status; // Fulfilled, Pending
    private ArrayList<Medication> medicationsList;
    private double totalPrice;

    public MedicationOrder(String orderId, String patientId, String drugId) {
        this.orderId = orderId;
        this.patientId = patientId;
        //this.drugId = drugId;
        this.status = "Pending";  // Default status
        this.medicationsList = new ArrayList<>();
        this.totalPrice = 0;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

//    public String getDrugId() {
//        return drugId;
//    }
//
//    public void setDrugId(String drugId) {
//        this.drugId = drugId;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Medication> getMedicationsList() {
        return medicationsList;
    }

    public void setMedicationsList(ArrayList<Medication> medicationsList) {
        this.medicationsList = medicationsList;
    }

    // Method to fulfill an order
    public void fulfillOrder() {
        this.status = "Fulfilled";
        System.out.println("Order " + orderId + " for patient " + patientId + " has been fulfilled.");
    }

    // Method to update the order status
    public void updateOrderStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderId + " status updated to: " + newStatus);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public double calculateTotalPrice(DrugCatalog drugCatalog) {
        totalPrice = 0;
        for (Medication med : medicationsList) {
            Drug drug = drugCatalog.getDrugByName(med.getDrugName());
            if (drug != null) {
                totalPrice += Double.parseDouble(med.getDosage()) * drug.getPrice();
            }
        }
        return totalPrice;
    }
}
