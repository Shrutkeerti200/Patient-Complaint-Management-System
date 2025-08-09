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
public class ClaimProcessOrganization extends Organization {

    private List<String> pendingClaims;
    private List<String> approvedClaims;
    private List<String> registeredInsuranceAgent;

    public ClaimProcessOrganization() {
        super("Claim Process Organization");
        this.pendingClaims = new ArrayList<>();
        this.approvedClaims = new ArrayList<>();
        this.registeredInsuranceAgent = new ArrayList<>();
    }

    public List<String> getPendingClaims() {
        return pendingClaims;
    }

    public List<String> getApprovedClaims() {
        return approvedClaims;
    }

//    public void addPendingClaim(String claimId) {
//        pendingClaims.add(claimId);
//    }

    public void approveClaim(String claimId) {
        if (pendingClaims.remove(claimId)) {
            approvedClaims.add(claimId);
            System.out.println("Claim " + claimId + " approved.");
        } else {
            System.out.println("Claim " + claimId + " not found in pending claims.");
        }
    }

    public void rejectClaim(String claimId) {
        pendingClaims.remove(claimId);
        System.out.println("Claim " + claimId + " rejected.");
    }

    public List<String> getRegisteredInsuranceAgent() {
        return registeredInsuranceAgent;
    }
    
    public void registerResearcher(String agentId) {
        registeredInsuranceAgent.add(agentId);
        System.out.println("Patient " + agentId + " registered.");
    }
}
