/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmgPatient;

/*
 * @author ksahi
 */
public class EmgPatient {
    
     private String pName;
    
    private String contactNo;
    
    private String pickUpLocation;
    
    private String dropOffLocation;

    public EmgPatient(String pName, String contactNo, String pickUpLocation, String dropOffLocation) {
        this.pName = pName;
        this.contactNo = contactNo;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
    }

    

   

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

 

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }
    
    
    
    
}
