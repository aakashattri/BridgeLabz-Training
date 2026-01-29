interface Switch{
	 void turnOn();
	 void turnOff();
}
class Lights implements Switch{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Light switched on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Light switched off");
	}
	
}
class TV implements Switch{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV switched on");
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV switched off");
	}
	
}
class Fan implements Switch{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan switched on");
		
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan switched off");
	}
	
}
public class SmartDeviceControlInterface {
	public static void main(String[] args) {
		Lights light=new Lights();
		light.turnOff();
		light.turnOn();
		
		Fan fan=new Fan();
		fan.turnOff();
		fan.turnOn();
		
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
	}
}
