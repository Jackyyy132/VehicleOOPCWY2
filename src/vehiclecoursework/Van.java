/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecoursework;

/**
 *
 * @author w1546167
 */
public class Van extends Vehicle {
    private int Cargo;
    
    
    public Van(String v, String b, TimeDate e, int c){
    super(v,b,e);
    Cargo = c;
    
    }
    public void setCargo(int c){
        Cargo = c;
    }
    
    
    
    
    public String getVehicleType(){
        return "Van";
    }
    
    
    
    
    
    
    public String toString(){
        return "This VAN has Vehicle ID: " + this.getVehicleID() + ". " + " Entered at " + this.getEntryTime() + ". It has Cargo volume of " + Cargo;
    }
    public String getVehicleDetails(){
        return "The Van with ID " + this.getVehicleID() + " and Cargo volume " + Cargo  + " has now been removed";
    }

    
}
