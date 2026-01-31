
import java.util.stream.Stream;

public class IotSensorReading {
	public static void main(String[] args) {
		Stream<Integer>readings=Stream.of(34,54,23,65,7,65,78,4,6,5,67,89,100);
		int threshold=14;
		readings.forEach(item ->{
			if(item>threshold) {
				System.out.println(item);
			}
		});
	}
}
