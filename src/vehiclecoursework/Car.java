
package vehiclecoursework;

public class Car extends Vehicle{
    private int NumberOfDoors;
    private String Colours;
    
    public Car(String v, String b, TimeDate e, int n, String c){
        super(v, b, e);
        NumberOfDoors = n;
        Colours = c;
    }
    public void setNumberOfDoors(int n){
        NumberOfDoors = n;
    }
    public int getNumberOfDoors(){
        return NumberOfDoors;
    }
    
    
    public void setColour(String c){
        Colours = c;
    }
    public String getColour(){
        return Colours;
    }
    
    
    
    public String getVehicleType(){
        return "Car";
    }
    
    
    
    
    
    public String toString(){
        return "This CAR has Vehicle ID: " + this.getVehicleID() + ". " + " Entered at " + this.getEntryTime() + ". It has " + NumberOfDoors + " doors and the car colour is " + Colours;
    }
    public String getVehicleDetails(){
        return "The " + Colours + " Car with ID " + this.getVehicleID() + " and " + NumberOfDoors  + " doors will now be removed";
    }
    
    

}
