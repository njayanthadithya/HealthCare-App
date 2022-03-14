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
 * @author monishmm
 */
public class Managerorganization extends Organization {

public Managerorganization() {
        super(Organization.Type.Manager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new ManagerRole());
        return role;
    }    

  
}
