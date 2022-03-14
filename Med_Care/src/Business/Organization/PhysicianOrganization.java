/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.PhysicianRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class PhysicianOrganization extends Organization{

   public PhysicianOrganization() {
        super(Organization.Type.Physicians.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new PhysicianRole());
        return Role;
    }

    
    
}
