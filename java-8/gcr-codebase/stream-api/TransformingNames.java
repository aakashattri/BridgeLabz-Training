import java.util.stream.Stream;

public class TransformingNames {
	public static void main(String[] args) {
		Stream<String>customerNames=Stream.of("Anurag","Rohit","Aditya","Prashant","Aakash","Raghav","Pappu");
		customerNames.map(String::toUpperCase).sorted().forEach(System.out::println);
		
	}
}
