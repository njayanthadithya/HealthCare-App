/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DoctorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new DoctorRole());
        return Role;
    }
     
}