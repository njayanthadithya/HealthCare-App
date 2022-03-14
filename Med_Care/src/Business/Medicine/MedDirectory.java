/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import Business.AllergyType.Allergy;
import java.util.ArrayList;

/**
 * @author jayanthadithya
 */
public class MedDirectory {
    
    private ArrayList<Medicine> medAList;
    
    public MedDirectory(){
        medAList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedAList() {
        return medAList;
    }

    public void setMedAList(ArrayList<Medicine> medAList) {
        this.medAList = medAList;
    }
    
      public void addMed(Medicine premedicine, int i, int j) {

        Medicine medicine = new Medicine(i, j);
        medicine.setRoute(premedicine.getRoute());
        medicine.setMedName(premedicine.getMedName());
        medicine.setRoute(premedicine.getRoute());
        medicine.setCmpname1(premedicine.getCmpname1());
        medicine.setCmpname2(premedicine.getCmpname2());
        medAList.add(medicine);
    }
      
       public Medicine checkMedicineandaddAllergy(Allergy allergy) {

        for (Medicine medicine : medAList) {
            for (String s : allergy.getCmp()) {
                if (!medicine.isIsdiscontiued()) {
                    if (medicine.getCmpname1().equals(s) || medicine.getCmpname2().equals(s)) {
                        for (MedAdministration medAdmin : medicine.getMedicineadmin()) {
                            if (!medAdmin.getIsadmin()) {
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
