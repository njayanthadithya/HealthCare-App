/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author jayanthadithya
 */
public class Medicine {

    //private final String cmpname1;
    private String medName;
    private String cmpname1; 
    private String cmpname2;
    private String route;
    private int k;
    private int l;

    public Medicine(String medname, String cmpname1, String cmpname2) {
        this.medName = medname;
        this.cmpname1 = cmpname1;
        this.cmpname2 = cmpname2;
    }
   
     public Medicine(int days, int times) {
        medicineadmin = new ArrayList<MedAdministration>();
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= times; j++) {
                MedAdministration medicineadmin = new MedAdministration(i, j);
                this.medicineadmin.add(medicineadmin);
            }
        }
        this.k = days;
          this.l = times;
    }

    
    private ArrayList<MedAdministration> medicineadmin;

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getCmpname1() {
        return cmpname1;
    }

    public void setCmpname1(String cmpname1) {
        this.cmpname1 = cmpname1;
    }

    public String getCmpname2() {
        return cmpname2;
    }

    public void setCmpname2(String cmpname2) {
        this.cmpname2 = cmpname2;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public ArrayList<MedAdministration> getMedicineadmin() {
        return medicineadmin;
    }

    public void setMedicineadmin(ArrayList<MedAdministration> medicineadmin) {
        this.medicineadmin = medicineadmin;
    }
    
    private boolean isdiscontiued;

    public boolean isIsdiscontiued() {
        return isdiscontiued;
    }

    public void setIsdiscontiued(boolean isdiscontiued) {
        this.isdiscontiued = isdiscontiued;
    }

    public boolean isdischarged;

    public boolean isIsdischarged() {
        return isdischarged;
    }

    public void setIsdischarged(boolean isdischarged) {
        this.isdischarged = isdischarged;
    }

    @Override
    public String toString() {
        return this.getMedName();
    }
    
}
