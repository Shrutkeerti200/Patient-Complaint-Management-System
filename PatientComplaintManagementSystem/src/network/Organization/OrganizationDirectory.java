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
public class OrganizationDirectory {

    private List<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<>();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void addOrganization(Organization organization) {
    
    organizationList.add(organization);
    //System.out.println("Organization added successfully: " + organization.getOrganizationName());
}
    
    
}
