/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;
import network.Organization.Organization;

/**
 *
 * @author SS
 */
public class Auditor extends User {

    private String auditorId;
    private String name;
    private String email;
    private List<Complaint> auditComplaints;
    private List<String> auditReports;

    public Auditor(String userId, String username, String password, String auditorId, String name, String email) {
        super(userId, username, password, "Auditor");
        this.auditComplaints = new ArrayList<>();
        this.auditReports = new ArrayList<>();
        this.auditorId = auditorId;
        this.name = name;
        this.email = email;
    }

    public String getAuditorId() {
        return auditorId;
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
    
    public List<Complaint> getAuditComplaints() {
        return auditComplaints;
    }

    public List<String> getAuditReports() {
        return auditReports;
    }

    public void performAudit(Complaint complaint) {
        auditComplaints.add(complaint);
        System.out.println("Performing audit on complaint: " + complaint.getComplaintId());
    }

    public void generateAuditReport(String report) {
        auditReports.add(report);
        System.out.println("Audit report generated: " + report);
    }

    public void validateCompliance(Organization organization) {
        System.out.println("Validating compliance for organization: " + organization.getOrganizationName());
    }
}
