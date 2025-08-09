/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Organization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SS
 */
public class DrugSupplyOrganization extends Organization {

    private Map<String, Integer> drugInventory;
    private List<String> registeredPharmacist;

    public DrugSupplyOrganization() {
        super("Drug Supply Organization");
        this.drugInventory = new HashMap<>();
        this.registeredPharmacist = new ArrayList<>();
    }

    public Map<String, Integer> getDrugInventory() {
        return drugInventory;
    }

    public void addDrug(String drugName, int quantity) {
        drugInventory.put(drugName, drugInventory.getOrDefault(drugName, 0) + quantity);
    }

    public void dispenseDrug(String drugName, int quantity) {
        if (drugInventory.containsKey(drugName) && drugInventory.get(drugName) >= quantity) {
            drugInventory.put(drugName, drugInventory.get(drugName) - quantity);
            System.out.println(quantity + " units of " + drugName + " dispensed.");
        } else {
            System.out.println("Insufficient stock for " + drugName);
        }
    }

    public List<String> getRegisteredPharmacist() {
        return registeredPharmacist;
    }
    
    
    
    public void registerPharmacist(String pharmacistId) {
        registeredPharmacist.add(pharmacistId);
        System.out.println("Patient " + pharmacistId + " registered.");
    }
}
