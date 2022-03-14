/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyPatient;

/**
 *
 * @author Lokesh Balaji
 */
public class EmergencyPatient {
    
     private String Patientname;
    
    private String contactNumber;
    
    private String Source;
    
    private String destination;

    public EmergencyPatient(String Patientname, String contactNumber, String Source, String destination) {
        this.Patientname = Patientname;
        this.contactNumber = contactNumber;
        this.Source = Source;
        this.destination = destination;
    }

    

   

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

 

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }
    
    
    
    
}
