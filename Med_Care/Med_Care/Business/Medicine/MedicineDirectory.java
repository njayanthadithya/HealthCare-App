/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.Allergy.Allergy;
import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class MedicineDirectory {
    
    private ArrayList<Medicine> medicationlist;
    
    public MedicineDirectory(){
        medicationlist = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicationlist() {
        return medicationlist;
    }

    public void setMedicationlist(ArrayList<Medicine> medicationlist) {
        this.medicationlist = medicationlist;
    }
    
      public void addMedicine(Medicine premedicine, int i, int j) {

        Medicine medicine = new Medicine(i, j);
        medicine.setRoute(premedicine.getRoute());
        medicine.setMedicinename(premedicine.getMedicinename());
        medicine.setCmpname1(premedicine.getCmpname1());
        medicine.setCmpname2(premedicine.getCmpname2());
        medicine.setRoute(premedicine.getRoute());
        medicationlist.add(medicine);
    }
      
       public Medicine checkMedicineandaddAllergy(Allergy allergy) {

        for (Medicine medicine : medicationlist) {
            for (String s : allergy.getCmp()) {
                if (!medicine.isIsdiscontiued()) {
                    if (medicine.getCmpname1().equals(s) || medicine.getCmpname2().equals(s)) {
                        for (MedicineAdministration medAdmin : medicine.getMedicineadmin()) {
                            if (!medAdmin.getIsadminis()) {
                                return medicine;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
}
