/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Allergy;

import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class Allergylist {
    
        private ArrayList<Allergy> allergylist;
        
        public Allergylist(){
            allergylist = new ArrayList<>();
        } 

    public ArrayList<Allergy> getAllergylist() {
        return allergylist;
    }

    public void setAllergylist(ArrayList<Allergy> allergylist) {
        this.allergylist = allergylist;
    }

    
     
    
    public boolean checkexist(Allergy selectedAllergy) {
        for (Allergy alg : allergylist) {
            if (selectedAllergy.getAllergy().equals(alg.getAllergy())) {
                return false;
            }
        }
        return true;
    }   
    
    
    public void addAllergy(Allergy selectedAllergy) {
        Allergy allergy = new Allergy(selectedAllergy.getAllergy(), selectedAllergy.getCmp());
        allergylist.add(allergy);
    }
        
        
        
    
    
}
