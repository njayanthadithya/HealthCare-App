/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BloodGroup.Bloodgrouplist;
import Business.EmgPatient.EmgPatientDirectory;
import Business.Location.LocationDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Patients.PatientDirectory;
import Business.Ambulance.Ambulancedirectory;
import Business.CovidCare.CovidCareList;

/**
 *
 * @author Rutvi Patel
 */

    
    
    public abstract class Enterprise extends Organization{
    
        
    private EnterpriseType enterprisetype;
    private PatientDirectory Patientdirectory;
    private EmgPatientDirectory EmergencyPatientdirectory;
    private OrganizationDirectory Organizationdirectory;
    private LocationDirectory locationlist;
    private Ambulancedirectory ambulancelist;
    private Bloodgrouplist bloodgrouplist;
    private CovidCareList CCareList;
    private String emailid;

    public CovidCareList getCCareList() {
        return CCareList;
    }

    public void setCCareList(CovidCareList CCareList) {
        this.CCareList = CCareList;
    }

    public EnterpriseType getEnterprisetype() {
        return enterprisetype;
    }

    public void setEnterprisetype(EnterpriseType enterprisetype) {
        this.enterprisetype = enterprisetype;
    }

    public PatientDirectory getPatientdirectory() {
        return Patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory Patientdirectory) {
        this.Patientdirectory = Patientdirectory;
    }

    public EmgPatientDirectory getEmergencyPatientdirectory() {
        return EmergencyPatientdirectory;
    }

    public void setEmergencyPatientdirectory(EmgPatientDirectory EmergencyPatientdirectory) {
        this.EmergencyPatientdirectory = EmergencyPatientdirectory;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public LocationDirectory getLocationlist() {
        return locationlist;
    }

    public void setLocationlist(LocationDirectory locationlist) {
        this.locationlist = locationlist;
    }

    public Ambulancedirectory getAmbulancelist() {
        return ambulancelist;
    }

    public void setAmbulancelist(Ambulancedirectory ambulancelist) {
        this.ambulancelist = ambulancelist;
    }

    public Bloodgrouplist getBloodgrouplist() {
        return bloodgrouplist;
    }

    public void setBloodgrouplist(Bloodgrouplist bloodgrouplist) {
        this.bloodgrouplist = bloodgrouplist;
    }

    public OrganizationDirectory getOrganizationdirectory() {
        return Organizationdirectory;
    }
    
    
    public enum EnterpriseType {
        Hospital("Hospital"), EmergencyCare("EmergencyCare"), BloodBank("BloodBank"), CovidCare("CovidCare");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
        
    }
    
    public Enterprise(String name, EnterpriseType type, String mailID) {
        super(name);
        this.enterprisetype = type;

        if (enterprisetype == EnterpriseType.BloodBank) {
            bloodgrouplist = new Bloodgrouplist();
        } else if (enterprisetype == EnterpriseType.Hospital) {
            Patientdirectory = new PatientDirectory();
            locationlist = new LocationDirectory();
        } else if (enterprisetype == EnterpriseType.EmergencyCare) {
            ambulancelist = new Ambulancedirectory();
            EmergencyPatientdirectory = new EmgPatientDirectory();
        } else if(enterprisetype == EnterpriseType.CovidCare){
            CCareList = new CovidCareList();  
        }

        Organizationdirectory = new OrganizationDirectory();
        this.emailid = mailID;
    }
     
    @Override
    public String toString(){
        return this.getOrganzationName();
    }

    
    }
    

