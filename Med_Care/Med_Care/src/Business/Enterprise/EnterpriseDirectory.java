/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriselist;

    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public void setEnterpriselist(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
     
    public EnterpriseDirectory() {
        enterpriselist = new ArrayList<Enterprise>();
    }
    
     public Enterprise CreateEnterprise(String name, Enterprise.EnterpriseType type, String mailID) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name, mailID);
        } else if (type == Enterprise.EnterpriseType.EmergencyCare) {
            enterprise = new EmergencyCareEnterprise(name, mailID);
        } else if (type == Enterprise.EnterpriseType.BloodBank) {
            enterprise = new Bloodbank(name, mailID);
        } else if(type == Enterprise.EnterpriseType.CovidCare){
            enterprise = new CovidCareRequirement(name,mailID);
            
        }
        enterpriselist.add(enterprise);
        return enterprise;
    }
    public void deleteenterprise(Enterprise enterprise) {

        enterpriselist.remove(enterprise);

    }
    
}
