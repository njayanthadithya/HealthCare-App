/*kdg
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 * @author Rutvi Patel
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationAList;

    public OrganizationDirectory() {
        organizationAList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationAList() {
        return organizationAList;
    }

    public Organization createOrganization(Type type) {
        Organization Organization = null;

        if (type.getValue().equals(Type.Doctor.getValue())) {
            Organization = new DoctorOrganization();
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            Organization = new LabOrganization();
        } else if (type.getValue().equals(Type.Nurse.getValue())) {
            Organization = new NurseOrganization();
        } else if (type.getValue().equals(Type.EmgCareNurse.getValue())){
            Organization = new ECareOrganization();
        } else if (type.getValue().equals(Type.EmgCareManager.getValue())) {
            Organization = new ECareManagerOganization();           
        } else if (type.getValue().equals(Type.Driver.getValue())) {
            Organization = new DriverOrganization();
        } else if((type.getValue().equals(Type.Manager.getValue()))) {
            Organization = new ManagerOrganization();
        } else if (type.getValue().equals(Type.Physicians.getValue())) {
            Organization = new PhysicianOrganization();
        } else if (type.getValue().equals(Type.CCareManager.getValue())) {
            Organization = new CCareManagerOrganization();
        }
         else if (type.getValue().equals(Type.CCarePhysicians.getValue())) {
            Organization = new CCarePhysicianOrganization();
        }
               
        organizationAList.add(Organization);
        return Organization;
    }
    public void removeOrganization(Organization Organization)
    {
      organizationAList.remove(Organization);
    }
    
}
