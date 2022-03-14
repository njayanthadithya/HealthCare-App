/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CovidCare;

import java.util.ArrayList;

/**
 * @author Rutvi Patel
 */
public class CovidCareList {
    
    private ArrayList<CovidCareRequirementType> CCareTypeAList;
    
    public CovidCareList(){
        CCareTypeAList = new ArrayList<CovidCareRequirementType>();
    }

    public ArrayList<CovidCareRequirementType> getCCareTypeAList() {
        return CCareTypeAList;
    }

    public void setCCareTypeAList(ArrayList<CovidCareRequirementType> CCareTypeAList) {
        this.CCareTypeAList = CCareTypeAList;
    }
    
     public void deleteRequirement(CovidCareRequirementType CRequirement)
    {
        CCareTypeAList.remove(CRequirement);
    }
    
    
    public CovidCareRequirementType addRequirement(CovidCareRequirementType CRequirement){
        CCareTypeAList.add(CRequirement);
        return CRequirement;
    }
    
   
}
