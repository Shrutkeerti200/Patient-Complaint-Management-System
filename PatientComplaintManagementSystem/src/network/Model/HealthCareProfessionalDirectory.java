/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SS
 */
public class HealthCareProfessionalDirectory {
    
    private List<HealthCareProfessional> healthCareProfessionalList;

    public HealthCareProfessionalDirectory() {
        this.healthCareProfessionalList = new ArrayList<>();
    }

    public List<HealthCareProfessional> getHealthCareProfessionalList() {
        return healthCareProfessionalList;
    }

    public void addHealthCareProfessional(HealthCareProfessional hcp) {
        healthCareProfessionalList.add(hcp);
    }
}
