/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;
import network.Complaint.ComplaintDirectory;
import network.Complaint.VitalSigns;
import network.Notification.Notification;

/**
 *
 * @author SS
 */
public class Patient extends User {

    private static int patientCounter = 1;
    private String patientId;
    private String name;
    private String gender;
    private String age;
    private String condition;
    private String phone;
    private String email;
    private String medicalHistory;
    private List<Complaint> complaints;
    private List<Notification> notifications;
    private VitalSigns vitalSigns;

    public Patient(String userId, String username, String password, String patientId, String name, String gender, String age, String condition, String phoneNumber, String email, String medicalHistory) {
        super(userId, username, password, "Patient");
        this.patientId = patientId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.condition = condition;
        this.phone = phone;
        this.email = email;
        this.medicalHistory = medicalHistory;
        this.complaints = new ArrayList<>();
        this.notifications = new ArrayList<>();
        this.vitalSigns = vitalSigns;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public void submitComplaint(String complaint) {
        System.out.println("Submitting complaint: " + complaint);
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

//    public void viewNotifications() {
//        for (Notification notification : notifications) {
//            System.out.println("Notification: " + notification.getMessage());
//        }
//    }
    

    public void submitComplaint(String description, String priority, String complaintType, ComplaintDirectory directory) {
        // Auto-generate complaintId
        String complaintId = "C" + directory.getComplaints().size() + 1; // Simple auto-incremented ID
        // Create new complaint object
        Complaint complaint = new Complaint(complaintId, description, priority, complaintType, this);
        
        // Add to complaint directory
        directory.addComplaint(complaint);

        // Add to the patient's complaints list
        this.complaints.add(complaint);

        System.out.println("Complaint submitted: " + description + " with priority: " + priority);
    }


}
