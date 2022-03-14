/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;



import Business.BloodGroup.BloodGroup;
import Business.BloodGroup.Bloodgrouplist;

/**
 *
 * @author ksahi
 */
public class LabTestRequest extends WorkRequest{
    
    private String Results;
    private BloodGroup bloodgroup;
    private String bType;
    private String BloodBagUnits;
    private String impureUnits;
    
    public static String RequestPENDING = "Pending";
    public static String RequestINPROGRESS = "In Progress";
    public static String RequestACCEPT = "Completed";

    public BloodGroup getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(BloodGroup bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType;
    }

    public String getBloodBagUnits() {
        return BloodBagUnits;
    }

    public void setBloodBagUnits(String BloodBagUnits) {
        this.BloodBagUnits = BloodBagUnits;
    }

    public String getImpureUnits() {
        return impureUnits;
    }

    public void setImpureUnits(String impureUnits) {
        this.impureUnits = impureUnits;
    }
   

    public String getResults() {
        return Results;
    }

    public void setResults(String Results) {
        this.Results = Results;
    }
    
    public LabTestRequest(BloodGroup bloodgroup) {
       this.bloodgroup = bloodgroup;
        this.BloodBagUnits = BloodBagUnits;
        this.bType = bloodgroup.getBloodGroup();
    }

   @Override
    public String toString(){
        return this.getbType();
    }
    
}
