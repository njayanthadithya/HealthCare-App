/*kdg
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class OrganizationDirectory {

    private ArrayList<Organization> orglist;

    public OrganizationDirectory() {
        orglist = new ArrayList();
    }

    public ArrayList<Organization> getOrglist() {
        return orglist;
    }

    public Organization createOrganization(Type type) {
        Organization org = null;

        if (type.getValue().equals(Type.Doctor.getValue())) {
            org = new Doctororganization();
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            org = new Laborganization();
        } else if (type.getValue().equals(Type.Nurse.getValue())) {
            org = new Nurseorganization();
        } else if (type.getValue().equals(Type.EmergencycareNurse.getValue())){
            org = new Emergencycareorganization();
        } else if (type.getValue().equals(Type.EmergencycareManager.getValue())) {
            org = new Emergencycaremanageroganization();           
        } else if (type.getValue().equals(Type.Driver.getValue())) {
            org = new Driverorganization();
        } else if((type.getValue().equals(Type.Manager.getValue()))) {
            org = new Managerorganization();
        } else if (type.getValue().equals(Type.Clinicians.getValue())) {
            org = new Clinicianorganization();
        }       
        orglist.add(org);
        return org;
    }
    public void removeorganization(Organization organiz)
    {
      orglist.remove(organiz);
    }
    
}
