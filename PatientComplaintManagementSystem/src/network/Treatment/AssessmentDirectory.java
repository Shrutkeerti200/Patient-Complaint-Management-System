/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Treatment;

import java.util.ArrayList;

/**
 *
 * @author Abhishek Patil
 */
public class AssessmentDirectory {
    
    ArrayList<Assessment> assisments;

    public AssessmentDirectory(){
    
        assisments=new ArrayList();
        
    }

    public ArrayList<Assessment> getAssisments() {
        return assisments;
    }

    public void setAssisments(ArrayList<Assessment> assisments) {
        this.assisments = assisments;
    }
    
    public Assessment getAssessmentByComplaintId(String complaintId) {
    // Loop through all assessments in the directory
    for (Assessment assessment : assisments) {
        // Check if the assessment's complaintId matches the given complaintId
        if (assessment.getComplaintId().equals(complaintId)) {
            return assessment; // Return the matching assessment
        }
    }
    return null; // Return null if no assessment matches the given complaintId
}

    
}
