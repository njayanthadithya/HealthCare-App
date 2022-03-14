/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CovidCare;

/**
 * @author Rutvi Patel
 */
public class CovidCareRequirementType {
    
    private String requirementType;
    private String availUnits;
    private String Validation;

    public  CovidCareRequirementType(String CCareType, String availUnits){
        this.requirementType = CCareType;
        this.availUnits = availUnits;
    }
    
    public CovidCareRequirementType(String CCareType){
        this.requirementType = CCareType;
    }
    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
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
    
         @Override
    public String toString(){
        return this.requirementType;
    }
    
}
