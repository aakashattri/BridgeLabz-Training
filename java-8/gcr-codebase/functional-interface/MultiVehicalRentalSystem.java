

interface RentalVehicle {
    void rent();
    void returnVehicle();
}

class Car implements RentalVehicle {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bike implements RentalVehicle {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}

class Bus implements RentalVehicle {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}
public class MultiVehicalRentalSystem{
	public static void main(String[] args) {
		Car car=new Car();
		
		car.rent();
		car.returnVehicle();
		Bike bike=new Bike();

		bike.rent();
		bike.returnVehicle();
		Bus bus=new Bus();
		bus.rent();
		bus.returnVehicle();
		
	}
}
