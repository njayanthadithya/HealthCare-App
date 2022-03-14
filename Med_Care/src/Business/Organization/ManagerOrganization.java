/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.ManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Rutvi Patel
 */
public class ManagerOrganization extends Organization {

public ManagerOrganization() {
        super(Organization.Type.Manager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> Role = new ArrayList();
        Role.add(new ManagerRole());
        return Role;
    }    

  
}
