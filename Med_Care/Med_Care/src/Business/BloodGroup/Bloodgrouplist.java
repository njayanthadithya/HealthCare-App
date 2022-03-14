/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodGroup;

import java.util.ArrayList;

/**
 * @author Rutvi Patel
 */
public class Bloodgrouplist {
    
    private ArrayList<BloodGroup> BloodGroupAList;
    
    public Bloodgrouplist(){
        BloodGroupAList = new ArrayList<BloodGroup>();
    }

    public ArrayList<BloodGroup> getBloodGroupAList() {
        return BloodGroupAList;
    }

    public void setBloodGroupAList(ArrayList<BloodGroup> BloodGroupAList) {
        this.BloodGroupAList = BloodGroupAList;
    }
    
    public BloodGroup addBloodGroup(BloodGroup bloodGroup)
    {
        BloodGroupAList.add(bloodGroup);
        return bloodGroup;
    }
    
    public void deleteBloodGroup(BloodGroup bloodGroup){
        BloodGroupAList.remove(bloodGroup);
    }  
    
}
