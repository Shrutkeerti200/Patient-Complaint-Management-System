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
public class Enterprise {
    private String enterpriseId;
    private String enterpriseName;
    private String enterpriseType;
    private List<Organization> organizationList;

    public Enterprise(String enterpriseId, String enterpriseName, String enterpriseType) {
        this.enterpriseId = enterpriseId;
        this.enterpriseName = enterpriseName;
        this.enterpriseType = enterpriseType;
        this.organizationList = new ArrayList<>();
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
}