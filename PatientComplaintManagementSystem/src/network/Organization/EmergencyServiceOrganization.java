/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SS
 */
public class EmergencyServiceOrganization extends Organization {

    private List<String> emergencyCases;
    private List<String> registeredSpecialist;

    public EmergencyServiceOrganization() {
        super("Emergency Service Organization");
        this.emergencyCases = new ArrayList<>(); ;
        this.registeredSpecialist = new ArrayList<>(); ;
    }

    public List<String> getEmergencyCases() {
        return emergencyCases;
    }

    public List<String> getRegisteredSpecialist() {
        return registeredSpecialist;
    }

    public void addEmergencyCase(String caseId) {
        emergencyCases.add(caseId);
        System.out.println("Emergency case " + caseId + " added.");
    }

    public void resolveEmergencyCase(String caseId) {
        if (emergencyCases.remove(caseId)) {
            System.out.println("Emergency case " + caseId + " resolved.");
        } else {
            System.out.println("Emergency case " + caseId + " not found.");
        }
    }

    public void registerSpecialist(String specialistId) {
        registeredSpecialist.add(specialistId);
        System.out.println("Patient " + specialistId + " registered.");
    }
}
