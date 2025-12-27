
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle{
    private String vehicleNumber;
    private double rentalRate;
    Vehicle(String vehicleNumber,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.rentalRate=rentalRate;
    }
    public double getRentalRate(){return rentalRate;}
    abstract double calculateRentalCost(int days);
}
class Car extends Vehicle implements Insurable{
    Car(String num,double rate){
        super(num,rate);
    }
    double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
    public double calculateInsurance(){
        return 500;
    }
    public String getInsuranceDetails(){
        return "Car Insurance";
    }
}
class Bike extends Vehicle{
    Bike(String num,double rate){
        super(num,rate);
    }
    double calculateRentalCost(int days){
        return getRentalRate()*days;
    }
}
class Truck extends Vehicle{
    Truck(String num,double rate){
        super(num,rate);
    }
    double calculateRentalCost(int days){
        return getRentalRate()*days*1.5;
    }
}
public class VehicleRental{
    public static void main(String[] args){
        Vehicle v=new Car("UP32",1000);
        System.out.println(v.calculateRentalCost(3));
    }
}
