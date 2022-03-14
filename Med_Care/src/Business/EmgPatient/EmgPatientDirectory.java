/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmgPatient;

import java.util.ArrayList;

/*
 * @author ksahi
 */
public class EmgPatientDirectory {
    
    private ArrayList<EmgPatient> EmergencyPatientlist;
    
    public EmgPatientDirectory(){
     
        EmergencyPatientlist = new ArrayList<EmgPatient>();
    }

    public ArrayList<EmgPatient> getEmergencyPatientlist() {
        return EmergencyPatientlist;
    }

    public void setEmergencyPatientlist(ArrayList<EmgPatient> EmergencyPatientlist) {
        this.EmergencyPatientlist = EmergencyPatientlist;
    }
    
        public EmgPatient addEMSPatient(EmgPatient EmergencyPatient){
    EmergencyPatientlist.add(EmergencyPatient);
    return EmergencyPatient;
        }
    
}
