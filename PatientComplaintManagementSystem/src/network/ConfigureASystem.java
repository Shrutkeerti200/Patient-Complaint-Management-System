/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network;

import java.util.ArrayList;
import java.util.List;
import network.Complaint.Complaint;
import network.Complaint.ComplaintDirectory;
import network.Complaint.VitalSigns;
import network.Drug.Drug;
import network.Drug.DrugCatalog;
import network.Enterprise.Enterprise;
import network.Enterprise.EnterpriseDirectory;
import network.Medication.Medication;
import network.Medication.MedicationOrder;
import network.Model.Admin;
import network.Model.Auditor;
import network.Model.HealthCareProfessional;
import network.Model.InsuranceAgent;
import network.Model.Patient;
import network.Model.Pharmacist;
import network.Model.ResearchScientist;
import network.Model.Specialist;
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
import network.Reports.ReportDirectory;

/**
 *
 * @author SS
 */
public class ConfigureASystem {

    UserDirectory userDirectory;
    EnterpriseDirectory enterpriseDirectory;

    OrganizationDirectory organizationDirectory;
    public ReportDirectory reportDirectory;

    ComplaintDirectory complaintDirectory;

    DrugCatalog drugCatalog;

    // Method to configure the system with enterprises, organizations, and demo users
    public Business configureSystem() {
        Business business = new Business("PatientComplaintManagement");

        userDirectory = business.getUserDirectory();
        enterpriseDirectory = business.getEnterpriseDirectory();

        organizationDirectory = business.getOrganizationDirectory();
        reportDirectory = business.getReportDirectory();
        drugCatalog = business.getDrugCatalog();
        //reportDirectory.

        createDemoReportForOrganization();

        complaintDirectory = business.getComplaintDirectory();

        createEnterprisesAndOrganizations();
        createDemoUsers();
        assignUsersToOrganizations();
        createDemoComplaints();
        createDemoDrugCatalog();

        return business;

    }

    public void createDemoReportForOrganization() {
        ArrayList<Organization> organizationlist = (ArrayList<Organization>) organizationDirectory.getOrganizationList();
        reportDirectory.generateDemoDataForOrganizationList(organizationlist, enterpriseDirectory, "OrganizationList"); //(organizationlist, enterpriseDirectory);
    }

    // Create enterprises and organizations
    public void createEnterprisesAndOrganizations() {
        // Healthcare Enterprise
        Enterprise healthcare = new Enterprise("E001", "Healthcare", "HealthCare");
        PatientServiceOrganization patientServiceOrg = new PatientServiceOrganization();
        EmergencyServiceOrganization emergencyServiceOrg = new EmergencyServiceOrganization();

        healthcare.getOrganizationList().add(patientServiceOrg);
        healthcare.getOrganizationList().add(emergencyServiceOrg);

        // Add organizations to the global organization directory
        organizationDirectory.addOrganization(patientServiceOrg);
        organizationDirectory.addOrganization(emergencyServiceOrg);

        enterpriseDirectory.getEnterpriseList().add(healthcare);

        // Pharma Enterprise
        Enterprise pharma = new Enterprise("E002", "Pharma", "Pharma");
        DrugSupplyOrganization drugSupplyOrg = new DrugSupplyOrganization();
        ResearchOrganization researchOrg = new ResearchOrganization();

        pharma.getOrganizationList().add(drugSupplyOrg);
        pharma.getOrganizationList().add(researchOrg);

        // Add organizations to the global organization directory
        organizationDirectory.addOrganization(drugSupplyOrg);
        organizationDirectory.addOrganization(researchOrg);

        enterpriseDirectory.getEnterpriseList().add(pharma);

        // Insurance Enterprise
        Enterprise insurance = new Enterprise("E003", "Insurance", "Insurance");
        ClaimProcessOrganization claimProcessOrg = new ClaimProcessOrganization();

        insurance.getOrganizationList().add(claimProcessOrg);

        // Add organizations to the global organization directory
        organizationDirectory.addOrganization(claimProcessOrg);

        enterpriseDirectory.getEnterpriseList().add(insurance);

        // Regulatory Body Enterprise
        Enterprise regulatoryBody = new Enterprise("E004", "Regulatory Body", "RegulatoryBody");
        ComplianceAuditingOrganization complianceAuditingOrg = new ComplianceAuditingOrganization();

        regulatoryBody.getOrganizationList().add(complianceAuditingOrg);

        // Add organizations to the global organization directory
        organizationDirectory.addOrganization(complianceAuditingOrg);

        enterpriseDirectory.getEnterpriseList().add(regulatoryBody);
    }

    // Create demo users and add them to the UserDirectory
    public void createDemoUsers() {
        // Patients
//        userDirectory.addUser(new Patient("U001", "patient1", "password1", "History of Asthma", "P001", "John Doe", "Male", "35", "Asthma", "555-1234", "john.doe@email.com"));
//        userDirectory.addUser(new Patient("U002", "patient2", "password2", "History of Hypertension", "P002", "Jane Smith", "Female", "28", "Hypertension", "555-5678", "jane.smith@email.com"));

        VitalSigns vitalSigns1 = new VitalSigns(120, 80, 37.5, 18, 98, 120, 1.75, 70, 22.9, 5, 5.5, "Normal");
        VitalSigns vitalSigns2 = new VitalSigns(130, 90, 36.8, 16, 95, 115, 1.80, 65, 20.1, 3, 5.2, "Irregular heartbeat");

        Patient patient1 = new Patient("U001", "patient1", "password1", "History of Asthma", "P001", "John Doe", "Male", "35", "Asthma", "555-1234", "john.doe@email.com");
        patient1.setVitalSigns(vitalSigns1); // Assign VitalSigns to patient1

        Patient patient2 = new Patient("U002", "patient2", "password2", "History of Hypertension", "P002", "Jane Smith", "Female", "28", "Hypertension", "555-5678", "jane.smith@email.com");
        patient2.setVitalSigns(vitalSigns2); // Assign VitalSigns to patient2

        userDirectory.addUser(patient1);
        userDirectory.addUser(patient2);

        // Admin
        userDirectory.addUser(new Admin("U003", "admin", "admin123", "A001", "Sarah King", "admin@email.com"));

        // Healthcare Professionals
        userDirectory.addUser(new HealthCareProfessional("U004", "hcp1", "password1", "General Practitioner", "HCP001", "Dr. Alice Walker", "alice.walker@email.com"));

        userDirectory.addUser(new Auditor("U005", "aud1", "password1", "AU001", "Alex Jhonson", "alex@email.com"));

        // Specialist
<<<<<<< HEAD
        userDirectory.addUser(new Specialist("U006", "hcp-s1", "password1", "HCP-S001", "Dr. Alison Watt", "Heart Specialist", "alison.watt@gmail.com"));


=======


        userDirectory.addUser(new Specialist("U006", "hcp-s1", "password1", "HCP-S001", "Dr. Alison Watt", "Heart Specialist", "alison.watt@gmail.com"));


        userDirectory.addUser(new Specialist("U006", "hcp-s1", "password1", "Heart Specialist", "HCP-S001", "Dr. Alison Watt", "alison.watt@gmail.com"));

>>>>>>> origin/main
        // Create Pharmacist
        Pharmacist pharmacist = new Pharmacist("U006", "pharmacist1", "password1", "PH001", "Michael Brown", "michael.brown@pharmacy.com");

        createDemoMedicationOrders(pharmacist);

        userDirectory.addUser(pharmacist);

        // Add more users as needed...
        System.out.println("Users in UserDirectory:");
        for (User user : userDirectory.getUserList()) {
            System.out.println(user.getUserName() + ", " + user.getPassword() + ", " + user.getRole());
        }

    }

    public void createDemoMedicationOrders(Pharmacist pharmacist) {
        MedicationOrder order1 = new MedicationOrder("O001", "P001", "D001");
        order1.getMedicationsList().add(new Medication(1, "Paracetamol", "2", "Twice a day"));
        order1.getMedicationsList().add(new Medication(2, "Ibuprofen", "1", "Once a day"));

        MedicationOrder order2 = new MedicationOrder("O002", "P002", "D002");
        order2.getMedicationsList().add(new Medication(3, "Amoxicillin", "1", "Twice a day"));
        order2.getMedicationsList().add(new Medication(4, "Metformin", "1", "Twice a day"));

        MedicationOrder order3 = new MedicationOrder("O003", "P003", "D003");
        order3.getMedicationsList().add(new Medication(5, "Cough Syrup", "1", "Once a day"));

        // Assign Orders to Pharmacist
        pharmacist.getPendingOrders().add(order1);
        pharmacist.getPendingOrders().add(order2);
        pharmacist.getPendingOrders().add(order3);

<<<<<<< HEAD
=======

>>>>>>> origin/main
        System.out.println("Demo Medication Orders Created:");

        for (MedicationOrder order : pharmacist.getPendingOrders()) {
            System.out.println("Order ID: " + order.getOrderId() + ", Patient ID: " + order.getPatientId() + ", Status: " + order.getStatus());
            for (Medication medication : order.getMedicationsList()) {
                System.out.println("    Drug ID: " + medication.getDrugId() + ", Drug Name: " + medication.getDrugName() + ", Dosage: " + medication.getDosage() + ", Frequency: " + medication.getFrequency());
            }
        }
<<<<<<< HEAD
=======


>>>>>>> origin/main

        // Add more users as needed...
        //System.out.println("Users in UserDirectory:");
        //for (User user : userDirectory.getUserList()) {
        //    System.out.println(user.getUserName() + ", " + user.getPassword() + ", " + user.getRole());
        //}
<<<<<<< HEAD
=======


>>>>>>> origin/main
    }

    // Create demo complaints for the patients
    public void createDemoComplaints() {
        // Fetch patients from the UserDirectory
        Patient patient1 = (Patient) userDirectory.getUserList().stream()
                .filter(user -> user instanceof Patient && ((Patient) user).getPatientId().equals("P001"))
                .findFirst().orElse(null);

        Patient patient2 = (Patient) userDirectory.getUserList().stream()
                .filter(user -> user instanceof Patient && ((Patient) user).getPatientId().equals("P002"))
                .findFirst().orElse(null);

        if (patient1 != null) {
            // Add complaints for Patient 1
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "Severe headache and dizziness", "Critical", "Medical Emergency", patient1));
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "Cough and cold symptoms", "Medium", "Follow-up", patient1));
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "Mild back pain", "Low", "General Query", patient1));
        }

        if (patient2 != null) {
            // Add complaints for Patient 2
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "High blood pressure reading", "High", "Medical Emergency", patient2));
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "Chest pain and shortness of breath", "Critical", "Medical Emergency", patient2));
            complaintDirectory.addComplaint(new Complaint(complaintDirectory.generateComplaintId(), "Routine check-up request", "Low", "Follow-up", patient2));
        }

        // Print all complaints for verification
        System.out.println("Demo complaints created:");
        complaintDirectory.displayAllComplaints();
    }

    // Method to create a demo drug catalog
    public void createDemoDrugCatalog() {

        drugCatalog.addDrug(new Drug("D001", "Paracetamol", 0.50, 100));
        drugCatalog.addDrug(new Drug("D002", "Ibuprofen", 1.00, 50));
        drugCatalog.addDrug(new Drug("D003", "Amoxicillin", 2.50, 30));
        drugCatalog.addDrug(new Drug("D004", "Metformin", 3.00, 80));
        drugCatalog.addDrug(new Drug("D005", "Cough Syrup", 5.00, 20));

        System.out.println("Demo Drug Catalog Created:");
        for (Drug drug : drugCatalog.getDrugList()) {
            System.out.println("Drug ID: " + drug.getDrugId() + ", Name: " + drug.getDrugName()
                    + ", Price: $" + drug.getPrice() + ", Availability: " + drug.getAvailablility());
        }

        //return drugCatalog;
    }

    // Assign users to organizations
    public void assignUsersToOrganizations() {

        // Iterate through enterprises
        for (Enterprise enterprise : enterpriseDirectory.getEnterpriseList()) {
            // Iterate through organizations within each enterprise
            for (Organization organization : enterprise.getOrganizationList()) {
                for (User user : userDirectory.getUserList()) {
                    if (organization instanceof PatientServiceOrganization) {
                        // Assign patients
                        if (user instanceof Patient) {
                            ((PatientServiceOrganization) organization).registerPatient(((Patient) user).getPatientId());
                        }
                    } else if (organization instanceof ComplianceAuditingOrganization) {
                        // Assign auditors
                        if (user instanceof Auditor) {
                            ((ComplianceAuditingOrganization) organization).registerAuditor(((Auditor) user).getAuditorId());
                        }
                    } else if (organization instanceof EmergencyServiceOrganization) {
                        // Assign specialists
                        if (user instanceof Specialist) {
                            ((EmergencyServiceOrganization) organization).registerSpecialist(((Specialist) user).getSpecialistId());
                        }
                    } else if (organization instanceof DrugSupplyOrganization) {
                        // Assign pharmacists
                        if (user instanceof Pharmacist) {
                            ((DrugSupplyOrganization) organization).registerPharmacist(((Pharmacist) user).getPharmacistId());
                        }
                    } else if (organization instanceof ResearchOrganization) {
                        // Assign researchers
                        if (user instanceof ResearchScientist) {
                            ((ResearchOrganization) organization).registerResearcher(((ResearchScientist) user).getScientistId());
                        }
                    } else if (organization instanceof ClaimProcessOrganization) {
                        // Assign insurance agents
                        if (user instanceof InsuranceAgent) {
                            ((ClaimProcessOrganization) organization).registerResearcher(((InsuranceAgent) user).getAgentId());

                        }
                    }
                }
            }
        }
    }

    public User authenticateUser(String userName, String password, String role) {

        // Iterate through all the users in the UserDirectory
        for (User user : userDirectory.getUserList()) {

            // Compare username, password, and role
            if (user.getUserName().equals(userName)
                    && user.getPassword().equals(password)
                    && user.getRole().equals(role)) {
                // If valid credentials, set login status and return the user
                user.setLoggedInStatus(true);
                System.out.println("Login successful for user: " + user.getUserName());
                return user; // Return the authenticated user
            }
        }

        // If no user is found or credentials do not match
        System.out.println("Login failed. Invalid credentials.");
        return null; // Return null if authentication fails

    }

}
