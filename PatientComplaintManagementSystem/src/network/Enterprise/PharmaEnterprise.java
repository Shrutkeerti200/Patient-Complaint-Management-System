/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Enterprise;

/**
 *
 * @author SS
 */
public class PharmaEnterprise extends Enterprise {
    private int totalDrugsAvailable;
    private String researchFocusArea;

    public PharmaEnterprise(String enterpriseId, String name) {
        super(enterpriseId, name, "Pharma");
    }

    public int getTotalDrugsAvailable() {
        return totalDrugsAvailable;
    }

    public void setTotalDrugsAvailable(int totalDrugsAvailable) {
        this.totalDrugsAvailable = totalDrugsAvailable;
    }

    public String getResearchFocusArea() {
        return researchFocusArea;
    }

    public void setResearchFocusArea(String researchFocusArea) {
        this.researchFocusArea = researchFocusArea;
    }

//    public void conductResearch() {
//        System.out.println("Conducting research in " + researchFocusArea + " at " + getEnterpriseName());
//    }
//
//    public void manageDrugInventory() {
//        System.out.println("Managing drug inventory in " + getEnterpriseName());
//    }
}