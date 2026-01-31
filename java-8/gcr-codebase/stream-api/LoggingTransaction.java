
import java.time.LocalDateTime;
import java.util.stream.Stream;

public class LoggingTransaction {
	public static void main(String[] args) {
		Stream<Number>transactionIds=Stream.of(100,101l,124,24,788,132);
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}
}
