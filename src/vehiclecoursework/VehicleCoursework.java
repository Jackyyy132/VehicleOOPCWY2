/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecoursework;
import java.util.*;

/**
 *
 * @author w1546167
 */
public class VehicleCoursework implements CarParkManager, Runnable{
static Vehicle[] CarPark = new Vehicle[2];
static Scanner input = new Scanner(System.in);
static boolean VanFull = true;
static Vehicle LastVehicleParked;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        VehicleCoursework a = new VehicleCoursework();
        Thread t = new Thread(a, "Thread");
        t.start();
        String Option = "";
        
        while (!Option.equals("T")){
            
            System.out.println("A - Add new vehicle");  
            System.out.println("B - Delete a vehicle");
            System.out.println("C - Show Car Park");
            System.out.println("D - Show Statistics");
            System.out.println("E - Search for a vehicle");
            System.out.println("F - Calculate fees");
            System.out.println("Please input one of the key characters to access one of the functions: ");
            Option = input.next().toUpperCase();
            
            if(Option.equals("A")){
                boolean Full = true;


                for (int x = 0; x < CarPark.length-1; x++){
                    if (CarPark[x] == null && CarPark[x+1] == null){
                        VanFull = false;

                    }
                    else{
                        VanFull = true;
                    }


                }           


                for(int x = 0; x < CarPark.length; x++){
                    if(CarPark[x] == null){
                        Full = false;
                        break;
                    }
                }

                if (Full == true){
                    System.out.println("Sorry! The car park is full! Delete a car from the car park before adding a new one");
                }
                else{
                    a.AddNewVehicle(); 
                }
            }
            
            
            if(Option.equals("B")){
                boolean Empty = true;
            for (int x = 0; x < CarPark.length; x++){
                if (CarPark[x] != null){
                    Empty = false;
                    break;
                }
            }
        if (Empty == true){
            System.out.println("Cannot delete, there are currently no vehicles in the car park");
        }
        else{
            a.DeleteVehicle();           
        }
        }
        if(Option.equals("C")){
            boolean Empty = true;
            for (int x = 0; x < CarPark.length; x++){
                if (CarPark[x] != null){
                    Empty = false;
                    break;
                }
            }
        if (Empty == true){
            System.out.println("There are currently no vehicles in the car park");
        }
        else{
            a.ShowCarPark();
        }
        }
        if(Option.equals("D")){
            boolean Empty = true;
            for (int x = 0; x < CarPark.length; x++){
                if (CarPark[x] != null){
                    Empty = false;
                    break;
                }
            }
        if (Empty == true){
            System.out.println("No statistics available, there are currently no vehicles in the car park");
        }
        else{
            a.Statistics();
        }
        }
        if(Option.equals("E")){
            boolean Empty = true;
            for (int x = 0; x < CarPark.length; x++){
                if (CarPark[x] != null){
                    Empty = false;
                    break;
                }
            }
        if (Empty == true){
            System.out.println("Cannot search an empty car park, there are currently no cars in the car park");
        }
        else{
            a.Search();
        }
        }
        
        
        
        
        if (Option.equals("F")){
            boolean Empty = true;
            for (int x = 0; x < CarPark.length; x++){
                if (CarPark[x] != null){
                    Empty = false;
                    break;
                }
            }
        if (Empty == true){
            System.out.println("There are no vehicles in the car park to calculate any fees");
        }
        else{
            fees();
        }
        }
        

        
            
       
    }    
        
            
        }
    
    
    
    
    
@Override
    public void run(){
        while(true){
        for (int i = 0; i < CarPark.length; i++){
            if (CarPark[i] == null){
                continue;
            }
            if (CarPark[i].getFees()/30 == 0){
                if(CarPark[i].getFees() < 9){
                    CarPark[i].setFees(CarPark[i].getFees()+3);  
                }
                else{
                    CarPark[i].setFees(CarPark[i].getFees()+1);
                }                
            }
            else{
                if (CarPark[i].getFees() - 30 < 9){
                    CarPark[i].setFees(CarPark[i].getFees()+3); 
                }
                else{
                    CarPark[i].setFees(CarPark[i].getFees()+1);
                }
            }          
        }
        try{
        Thread.sleep(3600000);
        //Every Hour
        
        }
        catch (InterruptedException e){            
        }
    }
    }
    
    
    
    public void ShowCarPark(){
        System.out.println("Car Park");
            for (int x = 0; x < CarPark.length; x++) {
                if (CarPark[x] == (null)){
                    continue;
                }
                else{
                System.out.println(CarPark[x]); 
        }
    }
    }
           
    public void AddNewVehicle(){
        String VehicleID;
        String VehicleType;

        String Colour = "";
        int Doors;
        int Cargo;
        int EngineSize;
        String Brand;
        Boolean Flag = false;
        
        
        int Day;
        int Month;
        int Year;
        int Hours;
        int Minutes;
        
        
        int Counter = 0;
                             
        System.out.println("What is your Vehicle ID?");
        VehicleID = input.next();
        for (int x = 0; x <CarPark.length; x++){
            if (CarPark[x] == (null)){
                continue;
            }
            if (CarPark[x].getVehicleID().equals(VehicleID)){
                System.out.println("Hey! There is already a vehicle present in the car park with this ID");
                return;
            }
        }
        System.out.println("What brand is your vehicle?");
        Brand = input.next();
        System.out.println("Enter the date/time the vehicle entered. ");
        System.out.println("Please enter the day: ");
        Day = input.nextInt();
        while (Day <= 0 || Day > 31){
            System.out.println("Hey! Please enter a day between 1-31");
            Day = input.nextInt();
        }
        System.out.println("Please enter the month: ");
        Month = input.nextInt();
        while (Month <= 0 || Month > 12){
            System.out.println("Hey! Please enter a month between 1-12");
            Month = input.nextInt();
        }
        System.out.println("Please enter the years: ");
        Year = input.nextInt();
        while (Year < 1950 || Year > 2016){
            System.out.println("Hey! Please enter a year between 2000-2016");
            Year = input.nextInt();
        }
        System.out.println("Please enter the hours that the vehicle entered: ");
        Hours = input.nextInt();
        while (Hours < 0 || Hours >= 24){
            System.out.println("Hey! Please enter from 1 - 23: ");
            Hours = input.nextInt();
        }
        System.out.println("Please enter the minutes the vehicle entered: ");
        Minutes = input.nextInt();
        while (Minutes < 0 || Minutes >= 60){
            System.out.println("Hey! Please enter the minutes from 0 - 59");
            Minutes = input.nextInt();
        }
        
        
        
        TimeDate EntryTime = new TimeDate(Day, Month, Year, Hours, Minutes);
        
        
        
        System.out.println("What type of Vehicle do you have? C - Car, V - Van, M - Motorcycle ");
        VehicleType = input.next().toUpperCase();
        while(Flag == false){
        switch (VehicleType){
            case "C":
                System.out.println("What colour is your car?");
                Colour = input.next();
                System.out.println("How many doors does your car have?");
                Doors = input.nextInt();
                Flag = true;
                Car c = new Car(VehicleID, VehicleType, EntryTime, Doors, Colour);
                for (int x = 0; x < CarPark.length; x++){
                    if(CarPark[x] == null){
                        CarPark[x] = c;
                        break;
                    }
                }
                LastVehicleParked = c;
                
                System.out.println(c);
                break;
                
            case "V":
                if (VanFull == true){
                    System.out.println("Hey! Theres no space for a van! Please delete a vehicle before you try to enter a van");
                    return;
                }
                System.out.println("What is the volume of cargo in your van?");
                Cargo = input.nextInt();
                Flag = true;
                Van v = new Van(VehicleID, VehicleType,EntryTime, Cargo);
                for (int x = 0; x < CarPark.length; x++){
                    if(CarPark[x] == null){
                        CarPark[x] = v;
                        CarPark[x+1] = v;
                        break;
                    }                                                                             
                }
                LastVehicleParked = v;           
                System.out.println(v); 
                break;             
            case "M":
                System.out.println("What is the size of your engine");
                EngineSize = input.nextInt();
                Flag = true;
                Motorcycle m = new Motorcycle(VehicleID, VehicleType,EntryTime, EngineSize);       
                for (int x = 0; x < CarPark.length; x++){
                    if(CarPark[x] == null){
                        CarPark[x] = m;
                        break;
                    }               
                }
                LastVehicleParked = m;
                System.out.println(m);
                break;
        
            default:
                System.out.println("HEY! Please enter either C for Car, V for Van or M for Motorcycle");
                VehicleType = input.next().toUpperCase();
        }
        }
        
        
        
        
        
        for (int x = 0; x < CarPark.length; x++){
            if (CarPark[x] == null){
                Counter++;
            }
        }
        if (Counter == 0){
            System.out.println("There are now no more spaces available in the car park");
        }
        else{
            System.out.println("There are " + Counter + " space(s) available in the car park");
        }

        BubbleSort();
        

        }
    
    
    
    
    
    
    
    
    public void DeleteVehicle(){
        String UserInput;
        System.out.println("Which vehicle would you like to delete? Please enter the VehicleID");
        UserInput = input.next();
        boolean Empty = false;
        for (int x = 0; x < CarPark.length; x++){
            if (CarPark[x] == null){
                Empty = true;
                continue; 
            }
                Empty = false;  
                break;
        }                    
        
            if (Empty == false){
                for(int x = 0; x < CarPark.length; x++){
                    if (CarPark[x] == null){
                        continue;
                    }
            if(CarPark[x].getVehicleID().equals(UserInput)){
                System.out.println("The vehicle with ID: " + UserInput + " has been located in the Car Park" );
                System.out.println(CarPark[x].getVehicleDetails());
                System.out.println("Date and Time In: " + CarPark[x].getEntryTime());
            if (CarPark[x].getVehicleType().equals("Van")){
                CarPark[x] = null;
                CarPark[x+1] = null;
                break;           
            }
            if (CarPark[x].getVehicleType().equals("Car") || CarPark[x].getVehicleType().equals("Motorcycle")){
                CarPark[x] = null;
                break;
            }
            else{
                System.out.println("I am sorry! We could not locate any vehicle with the ID " + UserInput);
                break;
            }
            }
                
            }
            if (Empty == true){
                System.out.println("HEY! You can't delete anything if no vehicle is present in the car park");
        }
    }
            BubbleSort();
    }
    
    
    
    
    public static void BubbleSort(){
        for (int i = 0; i < CarPark.length; i++){       
        for (int x = 0; x < CarPark.length-1; x++){
            if (CarPark[x] == null || CarPark[x+1] == null){
                continue;
            }
            if (CarPark[x].getEntryTime().getYear() < CarPark[x+1].getEntryTime().getYear()){
                Vehicle Temp = CarPark[x];
                CarPark[x] = CarPark[x+1];
                CarPark[x+1] = Temp;
            }            
        }
        for (int x = 0; x < CarPark.length-1; x++){
            if (CarPark[x] == null || CarPark[x+1] == null){
                continue;
            }
            if (CarPark[x].getEntryTime().getYear() == CarPark[x+1].getEntryTime().getYear()){
                if (CarPark[x].getEntryTime().getMonth() < CarPark[x+1].getEntryTime().getMonth()){
                    Vehicle Temp = CarPark[x];
                    CarPark[x] = CarPark[x+1];
                    CarPark[x+1] = Temp;
                }
            } 
        }
        for (int x = 0; x < CarPark.length-1; x++){
            if (CarPark[x] == null || CarPark[x+1] == null){
                continue;
            }
            if (CarPark[x].getEntryTime().getYear() == CarPark[x+1].getEntryTime().getYear()){
                if (CarPark[x].getEntryTime().getMonth() == CarPark[x+1].getEntryTime().getMonth()){ 
                    if (CarPark[x].getEntryTime().getDay() < CarPark[x+1].getEntryTime().getDay()){
                        Vehicle Temp = CarPark[x];
                        CarPark[x] = CarPark[x+1];
                        CarPark[x+1] = Temp;
                }
                    }
                
            }                        
        }
        for (int x = 0; x < CarPark.length-1; x++){
            if (CarPark[x] == null || CarPark[x+1] == null){
                continue;
            }
            if (CarPark[x].getEntryTime().getYear() == CarPark[x+1].getEntryTime().getYear()){
                if (CarPark[x].getEntryTime().getMonth() == CarPark[x+1].getEntryTime().getMonth()){ 
                    if (CarPark[x].getEntryTime().getDay() == CarPark[x+1].getEntryTime().getDay()){
                        if (CarPark[x].getEntryTime().getHours() < CarPark[x+1].getEntryTime().getHours()){
                            Vehicle Temp = CarPark[x];
                            CarPark[x] = CarPark[x+1];
                            CarPark[x+1] = Temp;
                }
                    }
                        }                
            } 
        }
        for (int x = 0; x < CarPark.length-1; x++){
            if (CarPark[x] == null || CarPark[x+1] == null){
                continue;
            }
            if (CarPark[x].getEntryTime().getYear() == CarPark[x+1].getEntryTime().getYear()){
                if (CarPark[x].getEntryTime().getMonth() == CarPark[x+1].getEntryTime().getMonth()){ 
                    if (CarPark[x].getEntryTime().getDay() == CarPark[x+1].getEntryTime().getDay()){
                        if (CarPark[x].getEntryTime().getHours() == CarPark[x+1].getEntryTime().getHours()){
                            if (CarPark[x].getEntryTime().getMinutes() < CarPark[x+1].getEntryTime().getMinutes()){
                                Vehicle Temp = CarPark[x];
                                CarPark[x] = CarPark[x+1];
                                CarPark[x+1] = Temp;
            }                            
                }
                    }
                        }                
            }
    }
    }
    }
    
    
    
    
    
    
    
    
    
    public void Statistics(){
        double CarCounter = 0;
        double VanCounter = 0;
        double MotorcycleCounter = 0;
        
        double CarPercentage = 0;
        double VanPercentage = 0;
        double MotorcyclePercentage = 0;
        int CarParkCounter = 0;
        
        
        
        System.out.println("Here are some cool statistics: ");
        
        
        
        for (int x = 0; x < CarPark.length; x++){

            if (CarPark[x] == (null)){
                
            continue;
            }
            
            CarParkCounter++;
            System.out.println("CarParkCounter " + CarParkCounter);
            
            
            if (CarPark[x].getVehicleType().equals("Car")){
                CarCounter++;
            }
            if (CarPark[x].getVehicleType().equals("Van")){
                VanCounter++;
            }
            if (CarPark[x].getVehicleType().equals("Motorcycle")){
                MotorcycleCounter++;
            }
        }
            CarPercentage = (CarCounter/CarParkCounter)*100;
            VanPercentage = (VanCounter/CarParkCounter)*100;
            MotorcyclePercentage = (MotorcycleCounter/CarParkCounter)*100;
        
        System.out.println("Percentage of Cars in the cark park: " + CarPercentage + "%");
        System.out.println("Percentage of Vans in the car park: " + VanPercentage + "%");
        System.out.println("Percentage of Motorbikes in the car park: " + MotorcyclePercentage + "%");
        
        for (int i = 0; i <CarPark.length; i++){
            if (CarPark[i] == null){
                System.out.println("Longest parked vehicle: " + CarPark[i-1]);
                break;
            }
            if (i == CarPark.length-1 && CarPark[i] != null){
                System.out.println("Longest parked vehicle: " + CarPark[i]);
            }
        }
  
        System.out.println("Last vehicle parked: " + LastVehicleParked);
            
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
@Override
    public void Search(){
        int UserDay;
        int UserMonth;
        int UserYear;
        boolean Found = false;
        
        
        System.out.println("Please enter the day you wish to search: ");
        UserDay = input.nextInt();
        while (UserDay <= 0 || UserDay > 31){
            System.out.println("Hey! Please enter a day between 1-31");
            UserDay = input.nextInt();
        }
        System.out.println("Please enter the month you wish to search: ");
        UserMonth = input.nextInt();
        while (UserMonth <= 0 || UserMonth > 12){
            System.out.println("Hey! Please enter a month between 1-12");
            UserMonth = input.nextInt();
        }
        System.out.println("Please enter the year you wish you to search: ");
        UserYear = input.nextInt();
        while (UserYear < 1950 || UserYear > 2016){
            System.out.println("Hey! Please enter a year between 2000-2016");
            UserYear = input.nextInt();
        }
        
        
        
        
        for (int x = 0; x < CarPark.length; x++){       
            if (CarPark[x] == null){
                continue;
            }
            if ((CarPark[x].getEntryTime().getDay()==(UserDay) && CarPark[x].getEntryTime().getMonth()==(UserMonth)) && CarPark[x].getEntryTime().getYear()==(UserYear)){               
                System.out.println(CarPark[x]);
                Found = true;
            }
        }
        if (Found == false){
            System.out.println("Sorry, we could not locate any vehicle that has entered in that date");
        }
    }
    
    
    
    
    
    
    public static void fees(){
        
        for (int i = 0; i < CarPark.length; i++){
            if (CarPark[i] == null){
                continue;
            }
            System.out.println("Vehicle ID:"+CarPark[i].getVehicleID() + " has been charged: £" + CarPark[i].getFees());
            //System.out.println(CarPark[i] + " has been charged: £" + CarPark[i].getFees());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
