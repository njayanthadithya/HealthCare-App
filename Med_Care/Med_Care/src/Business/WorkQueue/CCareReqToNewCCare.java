/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.CovidCare.CovidCareList;
import Business.CovidCare.CovidCareRequirementType;

/**
 * @author ksahi
 */
public class CCareReqToNewCCare extends WorkRequest{
    
    private CovidCareRequirementType RequirementType;
    
    public static String RequestPENDING = "Pending";
    public static String RequestREJECT = "Declined";
    public static String RequestINPROGRESS = "In Progress";
    public static String RequestACCEPT = "Accepted and Completed";


    private String ReqFacilityName;
    private String RequestedUnits;


    public String getCCaretype() {
        return ReqFacilityName;
    }

    public void setCCaretype(String CCareType) {
        this.ReqFacilityName = CCareType;
    }

    public String getRequestedUnits() {
        return RequestedUnits;
    }

    public void setRequestedUnits(String RequestedUnits) {
        this.RequestedUnits = RequestedUnits;
    }

   

    public CCareReqToNewCCare(CovidCareRequirementType CCareType) {
       this.RequirementType = CCareType;
        this.RequestedUnits = RequestedUnits;
        this.ReqFacilityName =CCareType.getRequirementType();
    }

   @Override
    public String toString(){
        return this.getCCaretype();
    }
    
    
    
}
