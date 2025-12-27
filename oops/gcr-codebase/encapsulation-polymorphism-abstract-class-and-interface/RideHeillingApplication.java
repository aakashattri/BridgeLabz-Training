
interface GPS{
    String getCurrentLocation();
    void updateLocation(String l);
}
abstract class Vehicles{
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    Vehicles(int id,String d,double r){
        vehicleId=id;
        driverName=d;
        ratePerKm=r;
    }
    public double getRatePerKm(){return ratePerKm;}
    abstract double calculateFare(double distance);
}
class Cars extends Vehicles{
    Cars(int i,String d,double r){
        super(i,d,r);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm();
    }
}
class Bikes extends Vehicles{
    Bikes(int i,String d,double r){
        super(i,d,r);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm()*0.8;
    }
}
class Auto extends Vehicles{
    Auto(int i,String d,double r){
        super(i,d,r);
    }
    double calculateFare(double distance){
        return distance*getRatePerKm()*0.9;
    }
}
public class RideHeillingApplication{
    public static void main(String[] args){
        Vehicles v=new Cars(1,"Amit",15);
        System.out.println(v.calculateFare(10));
    }
}