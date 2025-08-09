/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Drug.Drug;
import network.Medication.MedicationOrder;

/**
 *
 * @author SS
 */
public class Pharmacist extends User {

    private String pharmacistId;
    private String name;
    private String email;
    private List<MedicationOrder> pendingOrders;

    public Pharmacist(String userId, String username, String password, String pharmacistId, String name, String email) {
        super(userId, username, password, "Pharmacist");
        this.pendingOrders = new ArrayList<>();  // Initialize here
        this.pharmacistId = pharmacistId;
        this.name = name;
        this.email = email;
    }

    public String getPharmacistId() {
        return pharmacistId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void fulfillMedicationOrder(String orderId) {
        System.out.println("Fulfilling medication order ID: " + orderId);
    }

    public List<MedicationOrder> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(List<MedicationOrder> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public void processMedicationOrder(MedicationOrder order) {
        order.setStatus("Processed");
        System.out.println("Processing medication order: " + order.getOrderId());
    }

    public void updateDrugCatalog(Drug drug) {
        System.out.println("Updating drug catalog with: " + drug.getDrugName());
    }
}
