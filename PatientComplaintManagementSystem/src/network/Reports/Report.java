/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Reports;

import java.util.Date;

/**
 *
 * @author Abhishek Patil
 */
public class Report {
    private static int reportCounter = 1; // Static field shared by all instances
    private String reportID;
    
    
    private String subjectID;
    private String subjectName;
    private String subjectQ1;
    private String subjectQ2;
     

    public Report(String subjectID, String subjectName, String subjectQ1, String subjectQ2) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectQ1 = subjectQ1;
        this.subjectQ2 = subjectQ2;
        this.reportID = "R" + reportCounter++;
    }

    public String getReportID() {
        return reportID;
    }

    //public void setReportID(int reportID) {
     //   this.reportID = reportID;
    //}
    
    
    
    //public String generateReportID() {
     //   return "R" + String.valueOf(reportID++);
    //}

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectQ1() {
        return subjectQ1;
    }

    public void setSubjectQ1(String subjectQ1) {
        this.subjectQ1 = subjectQ1;
    }

    public String getSubjectQ2() {
        return subjectQ2;
    }

    public void setSubjectQ2(String subjectQ2) {
        this.subjectQ2 = subjectQ2;
    }
    
    
    
}
