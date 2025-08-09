/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SS
 */
public class SpecialistDirectory {
    
    private List<Specialist> specialistList;

    public SpecialistDirectory() {
        this.specialistList = new ArrayList<>();
    }

    public List<Specialist> getSpecialistList() {
        return specialistList;
    }

    public void addSpecialist(Specialist specialist) {
        specialistList.add(specialist);
    }
}
