/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BloodGroup.BloodGroup;
import Business.BloodGroup.Bloodgrouplist;

/**
 * @author ksahi
 */

public class BloodReqToNewBloodBank extends WorkRequest{
    
    private BloodGroup bloodgroup;
    
    public static String RequestPENDING = "Pending";
    public static String RequestREJECT = "Declined";
    public static String RequestINPROGRESS = "In Progress";
    public static String RequestACCEPT = "Accepted";


public void setBloodgroup(BloodGroup bloodgroup) {
     this.bloodgroup = bloodgroup;
    }
    
 public BloodGroup getBloodGroup() {
        return bloodgroup;
    }

    private String bType;
    private String RequestedUnits;

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getRequestedUnits() {
        return RequestedUnits;
    }

    public void setRequestedUnits(String RequestedUnits) {
        this.RequestedUnits = RequestedUnits;
    }

    public BloodReqToNewBloodBank(BloodGroup bloodgroup) {
       this.bloodgroup = bloodgroup;
        this.RequestedUnits = RequestedUnits;
        this.bType = bloodgroup.getBloodGroup();
    }

   @Override
    public String toString(){
        return this.getbType();
    }
    
    
    
}
