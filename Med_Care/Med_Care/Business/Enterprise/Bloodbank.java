/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Lokesh Balaji
 */
public class Bloodbank extends Enterprise{
    
    public Bloodbank(String name, String mailID){
        super(name,EnterpriseType.BloodBank,mailID);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }   
}
