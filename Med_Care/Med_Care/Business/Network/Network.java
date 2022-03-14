/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
<<<<<<< HEAD
 * @author monishmm
=======
 * @author krish
>>>>>>> dfa836d11c45a6976dd8afe5c98e39c347635e80
 */
public class Network {

    private String country;
    private String state;
    private String city;
    private String name;
    private EnterpriseDirectory enterprisedirectory;
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   
  
    
    public Network(){
        enterprisedirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterprisedirectory() {
        return enterprisedirectory;
    }
    
    
    public void setEnterprisedirectory(EnterpriseDirectory enterprisedirectory) {
        this.enterprisedirectory = enterprisedirectory;
    }

    
    @Override
    public String toString(){
        return name;
    }
    
}
