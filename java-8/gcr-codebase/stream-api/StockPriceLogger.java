
import java.util.stream.Stream;

public class StockPriceLogger {
	public static void main(String[] args) {
		Stream<Integer>stockPrices=Stream.of(100,34,334,5,6,2322,5,6,4,444,32,2,6);
		stockPrices.forEach(System.out::println);
	}
}
