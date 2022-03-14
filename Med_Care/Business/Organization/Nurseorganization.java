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
 * @author monishmm
 */
public class Nurseorganization extends Organization {

    public Nurseorganization() {
        super(Organization.Type.Nurse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new NurseRole());
        return role;
    }

}
