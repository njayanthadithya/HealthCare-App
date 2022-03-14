
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.CCarePhysicianRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class CCarePhysicianOrganization extends Organization{

    public CCarePhysicianOrganization() {
        super(Organization.Type.CCarePhysicians.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new CCarePhysicianRole());
        return Role;
    }
     
   
    
    
}
