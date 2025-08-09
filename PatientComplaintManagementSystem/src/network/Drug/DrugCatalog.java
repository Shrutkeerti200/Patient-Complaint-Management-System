/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Drug;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SS
 */
public class DrugCatalog {
    
    private List<Drug> drugList;

    public DrugCatalog() {
        this.drugList = new ArrayList<>();
    }

    public List<Drug> getDrugList() {
        return drugList;
    }
    
    public void addDrug(Drug drug) {
        drugList.add(drug);
        System.out.println("Drug " + drug.getDrugName() + " added to the catalog.");
    }
    
    public Drug getDrugByName(String name) {
        for (Drug drug : drugList) {
            if (drug.getDrugName().equalsIgnoreCase(name)) {
                return drug;
            }
        }
        return null;  
    }
    
    public void removeDrug(String drugName) {
        Drug drugToRemove = getDrugByName(drugName);
        if (drugToRemove != null) {
            drugList.remove(drugToRemove);
            System.out.println("Drug " + drugName + " has been removed from the catalog.");
        } else {
            System.out.println("Drug " + drugName + " not found in the catalog.");
        }
    }
}
