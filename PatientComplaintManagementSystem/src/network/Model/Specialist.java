/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;
import network.Treatment.Assessment;
import network.Treatment.Treatment;

/**
 *
 * @author SS
 */
public class Specialist extends User {

    private String specialistId;
    private String name;
    private String specialty;
    private String email;
    private List<Treatment> treatments;
    private List<Assessment> assessments;
    private List<Complaint> handledComplaints;

    public Specialist(String userId, String username, String password, String specialistId, String name, String specialty, String email) {
        super(userId, username, password, "HCP-S");
        this.treatments = new ArrayList<>();
        this.assessments = new ArrayList<>();
        this.handledComplaints = new ArrayList<>(); // Initialize the list
        this.specialistId = specialistId;
        this.name = name;
        this.specialty = specialty;
        this.email = email;
    }

    // Getter for the list of handled complaints
    public List<Complaint> getHandledComplaints() {
        return handledComplaints;
    }

    // Method to add a complaint to the specialist
    public void addComplaint(Complaint complaint) {
        handledComplaints.add(complaint);
        System.out.println("Complaint " + complaint.getComplaintId() + " added to specialist " + name);
    }

    public String getSpecialistId() {
        return specialistId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void recommendAdvancedTreatment(Treatment treatment) {
        treatments.add(treatment);
        System.out.println("Recommending advanced treatment: " + treatment.getTreatmentPlan());
    }

    public void consultWithHealthcareProfessional(HealthCareProfessional hp, Complaint complaint) {
        System.out.println("Consulting with Healthcare Professional for complaint: " + complaint.getComplaintId());
    }

}
