/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Enterprise;

/**
 *
 * @author SS
 */
public class InsuranceEnterprise extends Enterprise {
    private int totalPolicies;
    private double totalClaimAmount;

    public InsuranceEnterprise(String enterpriseId, String name) {
        super(enterpriseId, name, "Insurance");
    }

    public int getTotalPolicies() {
        return totalPolicies;
    }

    public void setTotalPolicies(int totalPolicies) {
        this.totalPolicies = totalPolicies;
    }

    public double getTotalClaimAmount() {
        return totalClaimAmount;
    }

    public void setTotalClaimAmount(double totalClaimAmount) {
        this.totalClaimAmount = totalClaimAmount;
    }

//    public void processClaims() {
//        System.out.println("Processing insurance claims in " + getEnterpriseName());
//    }
//
//    public void auditClaims() {
//        System.out.println("Auditing claims in " + getEnterpriseName());
//    }
}