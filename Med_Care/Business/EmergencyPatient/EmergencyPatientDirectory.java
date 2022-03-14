/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyPatient;

import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class EmergencyPatientDirectory {
    
    private ArrayList<EmergencyPatient> EmergencyPatientlist;
    
    public EmergencyPatientDirectory(){
     
        EmergencyPatientlist = new ArrayList<EmergencyPatient>();
    }

    public ArrayList<EmergencyPatient> getEmergencyPatientlist() {
        return EmergencyPatientlist;
    }

    public void setEmergencyPatientlist(ArrayList<EmergencyPatient> EmergencyPatientlist) {
        this.EmergencyPatientlist = EmergencyPatientlist;
    }
    
        public EmergencyPatient addEMSPatient(EmergencyPatient EmergencyPatient){
    EmergencyPatientlist.add(EmergencyPatient);
    return EmergencyPatient;
        }
    
}
