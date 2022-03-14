/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodGroup;

/**
 *
 * @author Rutvi Patel
 */
public class BloodGroup {
    
    private String bloodGroup;
    private String availUnits;
    private String Validation;


    public BloodGroup(String bloodGroup, String availUnits) {
        this.bloodGroup = bloodGroup;
        this.availUnits = availUnits;
    }

    public String getAvailUnits() {
        return availUnits;
    }

    public void setAvailUnits(String availUnits) {
        this.availUnits = availUnits;
    }

    public String getValidation() {
        return Validation;
    }

    public void setValidation(String Validation) {
        this.Validation = Validation;
    }
    
    public String getBloodGroup() { 
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
     @Override
    public String toString(){
        return this.bloodGroup;
    }
}
