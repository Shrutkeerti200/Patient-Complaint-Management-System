/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Complaint;

import java.util.Date;
import network.Model.Patient;

/**
 *
 * @author SS
 */
public class Complaint {

    
    private static int complaintCounter = 1;
    private String complaintId;
    private String description;
    private String status; // e.g., New, In Progress, Resolved
    private String assignedTo; // HealthcareProfessional handling the complaint
    private Date timestamp;
    private String priorityLevel; // Critical, High, Medium, Low
    private String complaintType; // Medical Emergency, General Query, Follow-up
    private Patient patient;

    public Complaint(String complaintId, String description, String priorityLevel, String complaintType, Patient patient) {
        this.complaintId = "C" + complaintCounter++;
        this.complaintId = complaintId;
        this.description = description;
        this.status = "New";  // Default status
        this.timestamp = new Date();  // Current date
        this.priorityLevel = priorityLevel;
        this.complaintType = complaintType;
        this.patient = patient;

        //addNotification();
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

}
