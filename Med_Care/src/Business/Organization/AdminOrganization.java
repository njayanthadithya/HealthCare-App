/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.AdminRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 * @author Rutvi Patel
 */
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new AdminRole());
        return Role;
    }
     
}
