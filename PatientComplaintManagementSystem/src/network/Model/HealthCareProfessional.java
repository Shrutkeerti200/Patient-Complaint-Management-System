/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;
import network.Complaint.ComplaintDirectory;
import network.Medication.Medication;
import network.Treatment.Treatment;

/**
 *
 * @author SS
 */
public class HealthCareProfessional extends User {

    private String professionalId;
    private String name;
    private String email;
    private String specialization;
    private List<Complaint> handledComplaints;
    private int experience;

    public HealthCareProfessional(String userId, String username, String password, String specialization, String professionalId, String name, String email) {
        super(userId, username, password, "HCP");
        this.specialization = specialization;
        this.handledComplaints = new ArrayList<>();
        this.professionalId = professionalId;
        this.name = name;
        this.email = email;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    
    public String getProfessionalId() {
        return professionalId;
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

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Complaint> getHandledComplaints() {
        return handledComplaints;
    }
    
    public void addComplaint(Complaint complaint) {
        handledComplaints.add(complaint);
        System.out.println("Complaint " + complaint.getComplaintId() + " added to healthcare professional " + name);
    }

    public void pullComplaint(Complaint complaint) {
        handledComplaints.add(complaint);
        System.out.println("Handling complaint: " + complaint.getComplaintId());
    }

    public void performAssessment(Patient patient) {
        System.out.println("Performing assessment for patient: " + patient.getUserId());
    }

    public void recommendTreatment(Treatment treatment) {
        System.out.println("Recommending treatment: " + treatment.getTreatmentId());
    }

    public void recommendMedication(Medication medication) {
        System.out.println("Recommending medication: " + medication.getDrugName());
    }

    public void viewAndHandleComplaints(ComplaintDirectory directory) {
        List<Complaint> severeComplaints = directory.getComplaintsByPriority("Severe");
        System.out.println("Severe Complaints:");
        for (Complaint complaint : severeComplaints) {
            System.out.println("Complaint ID: " + complaint.getComplaintId() + ", Patient ID: " + complaint.getPatient().getPatientId()
                    + ", Description: " + complaint.getDescription() + ", Status: " + complaint.getStatus());
        }
    }

    public void updateComplaintStatus(String complaintId, String status, ComplaintDirectory directory) {
        directory.updateComplaintStatus(complaintId, status);
    }

}
