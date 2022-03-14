/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DoctorRole;
import Business.Roles.NurseRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class NurseOrganization extends Organization {

    public NurseOrganization() {
        super(Organization.Type.Nurse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new NurseRole());
        return Role;
    }

}
