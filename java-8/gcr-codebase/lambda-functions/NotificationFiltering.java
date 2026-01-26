package java8.lambda_functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Notification{
	String type;
	Notification(String type){
		this.type=type;
	}
	
	@Override
	public String toString() {
		return type;
	}
}
public class NotificationFiltering {
	public static void main(String[] args) {
		List<Notification>alerts=Arrays.asList(
				new Notification("Emergency"),
				new Notification("Appointment"),
				new Notification("Billling")
				);
		Predicate<Notification>emergencyOnly=ll -> ll.type.equals("Emergency");	
		 alerts.stream()
         .filter(emergencyOnly)
         .forEach(System.out::println);
	}
}
