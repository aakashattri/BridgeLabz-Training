interface Vehicle {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}

public class SmartVehicalDashBoard {
	public static void main(String[] args) {
		ElectricCar tesla=new ElectricCar();
		tesla.displayBattery();
		tesla.displaySpeed();
	}
}
