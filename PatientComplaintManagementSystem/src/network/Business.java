 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;


import network.Drug.DrugCatalog;

import network.Complaint.ComplaintDirectory;

import network.Enterprise.EnterpriseDirectory;
import network.Medication.MedicationOrder;
import network.Model.UserDirectory;
import network.Notification.NotificationDirectory;
import network.Organization.OrganizationDirectory;
import network.Reports.ReportDirectory;
import network.Treatment.AssessmentDirectory;

/**
 *
 * @author Abhishek Patil
 */
public class Business {
    
    String name;
    UserDirectory userDirectory;
    EnterpriseDirectory enterpriseDirectory;

    NotificationDirectory notificationDirectory;
    ReportDirectory reportDirectory;
    OrganizationDirectory organizationDirectory;
    DrugCatalog drugCatalog;
    ComplaintDirectory complaintDirectory;
    AssessmentDirectory assessmentDirectory;
    MedicationOrder medicationorder;

    
    public Business(String n){
        name=n;
        userDirectory = new UserDirectory();
        enterpriseDirectory = new EnterpriseDirectory();

        drugCatalog=new DrugCatalog();
        reportDirectory = new ReportDirectory();
        organizationDirectory = new OrganizationDirectory();
        notificationDirectory = new NotificationDirectory();
        complaintDirectory = new ComplaintDirectory();
        assessmentDirectory = new AssessmentDirectory();
        
    }

    public AssessmentDirectory getAssessmentDirectory() {
        return assessmentDirectory;
    }

    public void setAssessmentDirectory(AssessmentDirectory assessmentDirectory) {
        this.assessmentDirectory = assessmentDirectory;
    }
    
    public NotificationDirectory getNotificationDirectory() {
        return notificationDirectory;
    }

    public void setNotificationDirectory(NotificationDirectory notificationDirectory) {
        this.notificationDirectory = notificationDirectory;
    }

    public ReportDirectory getReportDirectory() {
        return reportDirectory;
    }

    public void setReportDirectory(ReportDirectory reportDirectory) {
        this.reportDirectory = reportDirectory;

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public ComplaintDirectory getComplaintDirectory() {
        return complaintDirectory;
    }

    public void setComplaintDirectory(ComplaintDirectory complaintDirectory) {
        this.complaintDirectory = complaintDirectory;
    }
    
    
    
}
