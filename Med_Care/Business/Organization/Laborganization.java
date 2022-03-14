/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.LabAssistantRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class Laborganization extends Organization{

    public Laborganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new LabAssistantRole());
        return role;
    }
     
   
    
    
}
