/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;

/**
 *
 * @author SS
 */
public class Admin extends User{
    
    private String adminId;
    private String name;
    private String email;
    private List<Complaint> complaints;
    
    public Admin(String userId, String username, String password, String adminId, String name, String email) {
        super(userId, username, password, "Admin");
        this.complaints = new ArrayList<>();
        this.adminId = adminId;
        this.name = name;
        this.email = email;
    }

    public String getAdminId() {
        return adminId;
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

    public List<Complaint> getComplaints() {
        return complaints;
    }
    
    public void trackComplaintStatus(Complaint complaint) {
        System.out.println("Tracking status for complaint ID: " + complaint.getComplaintId());
    }
}
