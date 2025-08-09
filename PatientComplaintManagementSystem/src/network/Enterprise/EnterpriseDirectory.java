/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Enterprise;

import java.util.ArrayList;
import java.util.List;
import network.Organization.Organization;

/**
 *
 * @author SS
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public String getEnterpriseNameByOrganization(Organization organization) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getOrganizationList().contains(organization)) {
                return enterprise.getEnterpriseName();
            }
        }
        return "Unknown Enterprise"; // If organization is not found
    }
    
}
