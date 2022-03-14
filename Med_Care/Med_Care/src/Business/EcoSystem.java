
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
 * @author Rutvi Patel
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> NetworkAList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createNetwork(){
        Network Network=new Network();
        NetworkAList.add(Network);
        return Network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> RoleAlist=new ArrayList<Role>();
        RoleAlist.add(new SystemAdminRole());
        return RoleAlist;
    }
    private EcoSystem(){
        super(null);
        NetworkAList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return NetworkAList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.NetworkAList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUseraccountdirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:NetworkAList){
            
        }
        return true;
    }
    
    public void removeNetwork(Network network)
    {
        NetworkAList.remove(network);
    }
   
}
