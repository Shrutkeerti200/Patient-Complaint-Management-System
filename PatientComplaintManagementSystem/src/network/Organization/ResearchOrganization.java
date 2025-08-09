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
public class ResearchOrganization extends Organization {

    private List<String> researchProjects;
    private List<String> registeredResearchers;

    public ResearchOrganization() {
        super("Research Organization");
        this.researchProjects = new ArrayList<>();
        this.registeredResearchers = new ArrayList<>();
    }

    public List<String> getResearchProjects() {
        return researchProjects;
    }

    public void addResearchProject(String projectName) {
        researchProjects.add(projectName);
        System.out.println("Research project '" + projectName + "' added.");
    }

    public void completeResearchProject(String projectName) {
        if (researchProjects.remove(projectName)) {
            System.out.println("Research project '" + projectName + "' completed.");
        } else {
            System.out.println("Research project '" + projectName + "' not found.");
        }
    }

    public List<String> getRegisteredResearchers() {
        return registeredResearchers;
    }
    
    
    
    public void registerResearcher(String scientistId) {
        registeredResearchers.add(scientistId);
        System.out.println("Patient " + scientistId + " registered.");
    }
}
