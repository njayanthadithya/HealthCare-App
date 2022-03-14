
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author monishmm
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networklist;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networklist.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolelist=new ArrayList<Role>();
        rolelist.add(new SystemAdminRole());
        return rolelist;
    }
    private EcoSystem(){
        super(null);
        networklist=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networklist;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networklist = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUseraccountdirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networklist){
            
        }
        return true;
    }
    
    public void removeNetwork(Network network)
    {
        networklist.remove(network);
    }
   
}
