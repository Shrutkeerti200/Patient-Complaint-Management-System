/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Claim;

import java.util.Date;

/**
 *
 * @author SS
 */
public class Claim {
    
    private String claimId;
    private String patientId;
    private String assessmentId;
    private String coverageDetails;
    private String status; // Pending, Approved, Rejected

    public Claim(String claimId, String patientId, String assessmentId, String coverageDetails) {
        this.claimId = claimId;
        this.patientId = patientId;
        this.assessmentId = assessmentId;
        this.coverageDetails = coverageDetails;
        this.status = "Pending";  // Default status
    }
    
    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getCoverageDetails() {
        return coverageDetails;
    }

    public void setCoverageDetails(String coverageDetails) {
        this.coverageDetails = coverageDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void approveClaim() {
        this.status = "Approved";
        System.out.println("Claim " + claimId + " has been approved.");
    }

    public void rejectClaim(String reason) {
        this.status = "Rejected";
        System.out.println("Claim " + claimId + " has been rejected. Reason: " + reason);
    }
}
