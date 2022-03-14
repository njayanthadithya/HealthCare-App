/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

/**
 *
 * @author Lokesh Balaji
 */
public class Bloodgroup {
    
    private String bloodgrp;
    private String availableunits;
    private String authentication;

    public String getAvailableunits() {
        return availableunits;
    }

    public void setAvailableunits(String availableunits) {
        this.availableunits = availableunits;
    }

    public Bloodgroup(String bloodgrp, String availableunits) {
        this.bloodgrp = bloodgrp;
        this.availableunits = availableunits;
    }
    
    

    public String getBloodgrp() { 
        return bloodgrp;
    }

    public void setBloodgrp(String bloodgrp) {
        this.bloodgrp = bloodgrp;
    }
    
     @Override
    public String toString(){
        return this.bloodgrp;
    }
}
