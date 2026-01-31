
import java.util.stream.Stream;

public class EventAttendeeWelcomeMessage {
	public static void main(String[] args) {
		Stream<String>attendes=Stream.of("Anurag","Rohit","Aditya","Prashant","Aakash","Raghav","Pappu");
		
		attendes.forEach(attende->System.out.println("Welcome to the Event "+attende));
	}
}
