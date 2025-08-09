/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SS
 */
public class RegulatoryEnterprise extends Enterprise {
    private int totalAuditsConducted;
    private List<String> complianceStandards;

    public RegulatoryEnterprise(String enterpriseId, String name) {
        super(enterpriseId, name, "Regulatory");
        this.complianceStandards = new ArrayList<>();
    }

    public int getTotalAuditsConducted() {
        return totalAuditsConducted;
    }

    public void setTotalAuditsConducted(int totalAuditsConducted) {
        this.totalAuditsConducted = totalAuditsConducted;
    }

    public List<String> getComplianceStandards() {
        return complianceStandards;
    }

    public void addComplianceStandard(String standard) {
        complianceStandards.add(standard);
    }

//    public void conductAudits() {
//        System.out.println("Conducting audits in " + getEnterpriseName());
//    }
//
//    public void enforceRegulations() {
//        System.out.println("Enforcing compliance standards in " + getEnterpriseName());
//    }
}