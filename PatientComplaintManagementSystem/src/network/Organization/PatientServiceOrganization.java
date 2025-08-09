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
public class PatientServiceOrganization extends Organization{

    private List<String> registeredPatients;

    public PatientServiceOrganization() {
        super("Patient Service Organization");
        this.registeredPatients = new ArrayList<>();
    }

    public List<String> getRegisteredPatients() {
        return registeredPatients;
    }

    public void registerPatient(String patientId) {
        registeredPatients.add(patientId);
        System.out.println("Patient " + patientId + " registered.");
    }
}
