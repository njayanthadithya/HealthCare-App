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
 * @author monishmm
 */
public class Doctororganization extends Organization{

    public Doctororganization() {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new DoctorRole());
        return role;
    }
     
}