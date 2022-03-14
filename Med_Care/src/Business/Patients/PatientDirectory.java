/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import java.util.ArrayList;

/*
 * @author jayanthadithya
 */
public class PatientDirectory {

    private ArrayList<Patient> patientAList;

    public PatientDirectory() {
        patientAList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientAList() {
        return patientAList;
    }

    public void setPatientAList(ArrayList<Patient> patientAList) {
        this.patientAList = patientAList;
    }

    public Patient addPatient() {
        Patient patient = new Patient();
        patientAList.add(patient);
        return patient;
    }
}
