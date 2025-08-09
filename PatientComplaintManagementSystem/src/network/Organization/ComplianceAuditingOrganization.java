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
public class ComplianceAuditingOrganization extends Organization {

    private List<String> auditReports;
    private int totalAuditsConducted;
    private List<String> registeredAuditors;

    public ComplianceAuditingOrganization() {
        super("Compliance Auditing Organization");
        this.auditReports = new ArrayList<>();
        this.totalAuditsConducted = 0;
        this.registeredAuditors = new ArrayList<>();
    }

    public List<String> getAuditReports() {
        return auditReports;
    }

    public int getTotalAuditsConducted() {
        return totalAuditsConducted;
    }

    public void addAuditReport(String report) {
        auditReports.add(report);
        totalAuditsConducted++;
    }

    public void conductAudit(String organizationName) {
        String report = "Audit conducted for " + organizationName + " - Compliance Passed";
        addAuditReport(report);
        System.out.println(report);
    }

    public List<String> getRegisteredAuditors() {
        return registeredAuditors;
    }
    
    
    
    public void registerAuditor(String auditorId) {
        registeredAuditors.add(auditorId);
        System.out.println("Patient " + auditorId + " registered.");
    }
}
