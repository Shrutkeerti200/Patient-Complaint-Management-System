/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Complaint;

import java.util.ArrayList;
import java.util.List;
import network.Model.Patient;

/**
 *
 * @author SS
 */
public class ComplaintDirectory {

    private List<Complaint> complaints;
    private int nextComplaintId;

    // Constructor
    public ComplaintDirectory() {
        this.complaints = new ArrayList<>();
        this.nextComplaintId = 1;
    }

    // Getters and Setters
    public List<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

    //Method to generate the next complaint ID
    public String generateComplaintId() {
        return "C" + nextComplaintId++; // Complaint ID will be C1, C2, C3 etc.
    }

    // Method to add a new complaint
    public void addComplaint(Complaint complaint) {
        complaints.add(complaint);
        System.out.println("Complaint ID: " + complaint.getComplaintId() + " has been added.");
    }

    // Method to get complaints by priority (e.g., severe)
    public List<Complaint> getComplaintsByPriority(String priority) {
        List<Complaint> filteredComplaints = new ArrayList<>();
        for (Complaint complaint : complaints) {
            if (complaint.getPriorityLevel().equalsIgnoreCase(priority)) {
                filteredComplaints.add(complaint);
            }
        }
        return filteredComplaints;
    }

    // Method to update complaint status
    public void updateComplaintStatus(String complaintId, String status) {
        for (Complaint complaint : complaints) {
            if (complaint.getComplaintId().equals(complaintId)) { // String comparison using equals
                complaint.setStatus(status);
                System.out.println("Complaint ID: " + complaintId + " status updated to: " + status);
                return;
            }
        }
        System.out.println("Complaint ID: " + complaintId + " not found.");
    }

    // Method to display all complaints
    public void displayAllComplaints() {
        for (Complaint complaint : complaints) {
            System.out.println("Complaint ID: " + complaint.getComplaintId() + ", Patient ID: " + complaint.getPatient().getPatientId()
                    + ", Priority: " + complaint.getPriorityLevel() + ", Status: " + complaint.getStatus());
        }
    }

    // Method to get complaints for specialists (Critical priority)
    public List<Complaint> getComplaintsForSpecialist() {
        List<Complaint> criticalComplaints = new ArrayList<>();
        for (Complaint complaint : complaints) {
            if ("Critical".equalsIgnoreCase(complaint.getPriorityLevel())) {
                criticalComplaints.add(complaint);

            }
        }
        return criticalComplaints;
    }
    
    //Method to get complaints for HealthCareProfessional (High, Medium, Low)
    public List<Complaint> getComplaintsForHealthcareOrganization() {
        List<Complaint> nonCriticalComplaints = new ArrayList<>();
        for (Complaint complaint : complaints) {
            // Filter out non-critical complaints for Healthcare Professionals
            if (!"Critical".equalsIgnoreCase(complaint.getPriorityLevel())) {
                nonCriticalComplaints.add(complaint);
            }
        }
        return nonCriticalComplaints;
    }
}
