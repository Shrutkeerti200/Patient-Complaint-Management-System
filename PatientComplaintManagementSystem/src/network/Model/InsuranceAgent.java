/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;
import network.Claim.Claim;

/**
 *
 * @author SS
 */
public class InsuranceAgent extends User{
    
    private String agentId;
    private String name;
    private String email;
    private List<Claim> claims;
    
    public InsuranceAgent(String userId, String username, String password, String agentId, String name, String email) {
        super(userId, username, password, "Insurance Agent");
        this.claims = new ArrayList<>();
        this.agentId = agentId;
        this.name = name;
        this.email = email;
    }

    public String getAgentId() {
        return agentId;
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

    public List<Claim> getClaims() {
        return claims;
    }

    public void processClaim(Claim claim) {
        claim.setStatus("Processed");
        System.out.println("Processing claim: " + claim.getClaimId());
    }

    public void validateCoverage(Claim claim) {
        System.out.println("Validating coverage for claim: " + claim.getClaimId());
    }
}
