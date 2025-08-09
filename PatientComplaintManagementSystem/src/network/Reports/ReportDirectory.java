/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Reports;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import network.Drug.Drug;
import network.Drug.DrugCatalog;
import network.Enterprise.Enterprise;
import network.Enterprise.EnterpriseDirectory;
import network.Model.HealthCareProfessional;
import network.Model.Patient;
import network.Model.User;
import network.Model.UserDirectory;
import network.Organization.ClaimProcessOrganization;
import network.Organization.ComplianceAuditingOrganization;
import network.Organization.DrugSupplyOrganization;
import network.Organization.EmergencyServiceOrganization;
import network.Organization.Organization;
import network.Organization.OrganizationDirectory;
import network.Organization.PatientServiceOrganization;
import network.Organization.ResearchOrganization;

/**
 *
 * @author Abhishek Patil
 */
public class ReportDirectory {
    
    ArrayList<Report> reports;
    private String subject; // OrganizationList, DrugReport, PatientReport, HCPReport, ComplaintReport
    private Date timeStamp;

    public ReportDirectory(String subject) {
        this.subject = subject;
        this.timeStamp= new Date();
        
    }
    
    public ReportDirectory(){
    
        reports = new ArrayList<>();
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    
    
    
    public ArrayList<Report> getReports() {
        return reports;
    }

    public void setReports(ArrayList<Report> reports) {
        this.reports = reports;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public ArrayList<Report> getReportsBySubject(String subjectFilter) {
        ArrayList<Report> filteredReports = new ArrayList<>();
        for (Report report : reports) {
            if (subjectFilter.equals(this.subject)) {
                filteredReports.add(report);
            }
        }
        return filteredReports;
    }
    
    
    public void generateDemoDataForOrganizationList(ArrayList<Organization> organizationList, EnterpriseDirectory enterpriseDirectory, String subject) {
    // Set timestamp to December 2023
    Calendar calendar = Calendar.getInstance();
    calendar.set(2023, Calendar.DECEMBER, 1);
    this.timeStamp = calendar.getTime();
    this.subject = subject;

    int reportIDCounter = 1; // Initialize report ID counter
    for (Organization org : organizationList) {
        // Example data for each organization
        String subjectID = "ORG-" + reportIDCounter++;  // Unique ID for the report
        String subjectName = org.getOrganizationName(); // Organization name as subjectName
        String enterpriseName = enterpriseDirectory.getEnterpriseNameByOrganization(org);
        String subjectQ1 = "Enterprise: " + enterpriseName; // Enterprise name
        
        String subjectQ2 = ""; // Initialize the subjectQ2
        
        if (org instanceof PatientServiceOrganization) {
            // Count the number of patients registered in the Patient Service Organization
            PatientServiceOrganization patientServiceOrg = (PatientServiceOrganization) org;
            int numOfPatients = patientServiceOrg.getRegisteredPatients().size();
            subjectQ2 = "Users: " + numOfPatients + " patients"; // Number of patients registered in this organization
        }
        else if (org instanceof ResearchOrganization) {
            // For Research Organization, if there are users, you can handle them similarly
            ResearchOrganization researchOrg = (ResearchOrganization) org;
            int numOfResearchers = researchOrg.getRegisteredResearchers().size();  // Assume getRegisteredResearchers exists
            subjectQ2 = "Users: " + numOfResearchers + " researchers"; // Number of researchers registered in this organization
        }
        else if (org instanceof EmergencyServiceOrganization) {
            // For Emergency Service Organization
            EmergencyServiceOrganization emergencyServiceOrg = (EmergencyServiceOrganization) org;
            int numOfEmergencyStaff = emergencyServiceOrg.getRegisteredSpecialist().size();  // Assume getRegisteredStaff exists
            subjectQ2 = "Users: " + numOfEmergencyStaff + " emergency staff";  // Number of emergency staff
        }
        else if (org instanceof DrugSupplyOrganization) {
            // For Drug Supply Organization
            DrugSupplyOrganization drugSupplyOrg = (DrugSupplyOrganization) org;
            int numOfSuppliers = drugSupplyOrg.getRegisteredPharmacist().size();  // Assume getRegisteredSuppliers exists
            subjectQ2 = "Users: " + numOfSuppliers + " suppliers"; // Number of suppliers registered in this organization
        }
        else if (org instanceof ComplianceAuditingOrganization) {
            // For Compliance Auditing Organization
            ComplianceAuditingOrganization complianceOrg = (ComplianceAuditingOrganization) org;
            int numOfAuditors = complianceOrg.getRegisteredAuditors().size();  // Assume getRegisteredAuditors exists
            subjectQ2 = "Users: " + numOfAuditors + " auditors"; // Number of auditors
        }
        else if (org instanceof ClaimProcessOrganization) {
            // For Claim Process Organization
            ClaimProcessOrganization claimProcessOrg = (ClaimProcessOrganization) org;
            int numOfClaimsHandlers = claimProcessOrg.getRegisteredInsuranceAgent().size();  // Assume getRegisteredClaimsHandlers exists
            subjectQ2 = "Users: " + numOfClaimsHandlers + " claims handlers"; // Number of claims handlers
        }

        // Create and add the report to the list
        Report report = new Report(subjectID, subjectName, subjectQ1, subjectQ2);
        
        reports.add(report);
    }

    System.out.println("Demo reports generated for subject: " + subject);
}

    
    public void generateReportsBasedOnSubject(String selectedSubject, 
                                          UserDirectory userDirectory, 
                                          DrugCatalog drugDirectory, OrganizationDirectory organizationDirectory,
                                          EnterpriseDirectory enterpriseDirecory) {
        
    //reports.clear(); // Clear previous reports
    Calendar calendar = Calendar.getInstance();
    this.timeStamp = calendar.getTime();
    this.subject = selectedSubject;
    switch (selectedSubject) {
        case "PatientReport":
            for (User user : userDirectory.getUserList()) {
                if (user instanceof Patient) { // Filter patients
                    Patient patient = (Patient) user;
                    reports.add(new Report(
                        patient.getPatientId(),
                        patient.getName(),
                        String.valueOf(patient.getComplaints().size()), // Number of complaints registered
                        String.valueOf(5) // Number of complaints resolved
                    ));
                }
            }
            break;

        case "HCPReport":
            for (User user : userDirectory.getUserList()) {
                if (user instanceof HealthCareProfessional) { // Filter healthcare professionals
                    HealthCareProfessional hcp = (HealthCareProfessional) user;
                    reports.add(new Report(
                        hcp.getProfessionalId(),
                        hcp.getName(),
                        String.valueOf(hcp.getHandledComplaints().size()), // Complaints handled
                        String.valueOf(hcp.getExperience()) // Years of experience
                    ));
                }
            }
            break;
            
        case "DrugReport":
                for (Drug drug : drugDirectory.getDrugList()) {
                    reports.add(new Report(
                        drug.getDrugId(),
                        drug.getDrugName(),
                        String.valueOf(drug.getAvail()),
                        drug.getExpDate().toString()
                    ));
                }
                break;
                
        case "OrganizationList":
                for (Organization org : organizationDirectory.getOrganizationList()) {
                    String enterpriseName = enterpriseDirecory.getEnterpriseNameByOrganization(org);
                    
                    String subjectQ2 = ""; // Initialize the subjectQ2
        
            if (org instanceof PatientServiceOrganization) {
             // Count the number of patients registered in the Patient Service Organization
              PatientServiceOrganization patientServiceOrg = (PatientServiceOrganization) org;
             int numOfPatients = patientServiceOrg.getRegisteredPatients().size();
              subjectQ2 = "Users: " + numOfPatients + " patients"; // Number of patients registered in this organization
            }
         else if (org instanceof ResearchOrganization) {
             // For Research Organization, if there are users, you can handle them similarly
             ResearchOrganization researchOrg = (ResearchOrganization) org;
             int numOfResearchers = researchOrg.getRegisteredResearchers().size();  // Assume getRegisteredResearchers exists
             subjectQ2 = "Users: " + numOfResearchers + " researchers"; // Number of researchers registered in this organization
         }
         else if (org instanceof EmergencyServiceOrganization) {
                // For Emergency Service Organization
                EmergencyServiceOrganization emergencyServiceOrg = (EmergencyServiceOrganization) org;
                int numOfEmergencyStaff = emergencyServiceOrg.getRegisteredSpecialist().size();  // Assume getRegisteredStaff exists
                subjectQ2 = "Users: " + numOfEmergencyStaff + " emergency staff";  // Number of emergency staff
         }
         else if (org instanceof DrugSupplyOrganization) {
             // For Drug Supply Organization
             DrugSupplyOrganization drugSupplyOrg = (DrugSupplyOrganization) org;
             int numOfSuppliers = drugSupplyOrg.getRegisteredPharmacist().size();  // Assume getRegisteredSuppliers exists
             subjectQ2 = "Users: " + numOfSuppliers + " suppliers"; // Number of suppliers registered in this organization
         }
         else if (org instanceof ComplianceAuditingOrganization) {
                // For Compliance Auditing Organization
                ComplianceAuditingOrganization complianceOrg = (ComplianceAuditingOrganization) org;
                int numOfAuditors = complianceOrg.getRegisteredAuditors().size();  // Assume getRegisteredAuditors exists
                subjectQ2 = "Users: " + numOfAuditors + " auditors"; // Number of auditors
            }
            else if (org instanceof ClaimProcessOrganization) {
                // For Claim Process Organization
                ClaimProcessOrganization claimProcessOrg = (ClaimProcessOrganization) org;
                int numOfClaimsHandlers = claimProcessOrg.getRegisteredInsuranceAgent().size();  // Assume getRegisteredClaimsHandlers exists
              subjectQ2 = "Users: " + numOfClaimsHandlers + " claims handlers"; // Number of claims handlers
            }
                    
                    reports.add(new Report(
                        org.getOrganizationId(),
                        org.getOrganizationName(),
                        enterpriseName,
                        subjectQ2)
                    );
                }
                break;
                
                

        default:
            System.out.println("Invalid subject.");
            break;
    }
}


    
}
