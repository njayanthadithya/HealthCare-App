/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AllergyType;

import java.util.ArrayList;

/**
 *
 * @author jayanthadithya
 */
public class Allergy {
 
       private String Allergy;
       
       
       private ArrayList<String> cmp;

    public Allergy(String Allergy, ArrayList<String> cmps) {
        this.Allergy = Allergy;
        cmp = cmps;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String Allergy) {
        this.Allergy = Allergy;
    }

    public ArrayList<String> getCmp() {
        return cmp;
    }

    public void setCmp(ArrayList<String> cmp) {
        this.cmp = cmp;
    }

   
    
    @Override
    public String toString(){
        return this.getAllergy();
    }
  
}
