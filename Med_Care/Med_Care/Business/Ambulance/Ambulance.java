/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;


import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author krish
 */
public class Ambulance {
    private boolean availability;
    private String ambulancenumber;
    //private String manufactured_year;
    private String serial_number;
    //private String model;
    private String availability_locality;
    //private Date createdOn;
    private String yes = "Yes";
    private String no = "No";

    public Ambulance(boolean availability, String ambulancenumber, String serial_number, String availability_locality) {
        this.availability = availability;
        this.ambulancenumber = ambulancenumber;
        this.serial_number = serial_number;
        this.availability_locality = availability_locality;
    }
    
  


    
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public String availability(){
    if (isAvailability()==true){
        return yes;
    }
    else{
    return no;
    }
    }

    public String getAmbulancenumber() {
        return ambulancenumber;
    }

    public void setAmbulancenumber(String ambulancenumber) {
        this.ambulancenumber = ambulancenumber;
    }




    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

  

    public String getAvailability_locality() {
        return availability_locality;
    }

    public void setAvailability_locality(String availability_locality) {
        this.availability_locality = availability_locality;
    }


    

    @Override
    public String toString(){
       return this.ambulancenumber;
    }    
}
