/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import Business.AllergyType.AllergyList;
import Business.Employee.Employee;
import Business.Location.Location;
import Business.Medicine.MedDirectory;
import Business.UserAccount.UserAccount;

/**
 * @author jayanthadithya
 */
public class Patient {

    public Patient() {
        this.medList = new MedDirectory();
        this.allergies = new AllergyList();
    }

    private String pName;

    private String patientHRN;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPatientHRN() {
        return patientHRN;
    }

    public void setPatientHRN(String patientHRN) {
        this.patientHRN = patientHRN;
    }

    public Employee getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(Employee DoctorName) {
        this.DoctorName = DoctorName;
    }

    public MedDirectory getMedList() {
        return medList;
    }

    public void setMedList(MedDirectory medList) {
        this.medList = medList;
    }

    public AllergyList getAllergies() {
        return allergies;
    }

    public void setAllergies(AllergyList allergies) {
        this.allergies = allergies;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Employee DoctorName;

    private MedDirectory medList;

    private AllergyList allergies;

    private Location location;

    private String BloodGroup;
//    
//    private String CCareType;
//
//    public String getCCareType() {
//        return CCareType;
//    }
//
//    public void setCCareType(String CCareType) {
//        this.CCareType = CCareType;
//    }
    
    private boolean isDischarged;

    public boolean isIsDischarged() {
        return isDischarged;
    }

    public void setIsDischarged(boolean isDischarged) {
        this.isDischarged = isDischarged;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    @Override
    public String toString() {
        return this.getpName();
    }
}
