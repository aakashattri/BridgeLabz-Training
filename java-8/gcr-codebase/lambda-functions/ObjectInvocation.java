package java8.lambda_functions;

import java.util.*;
import java.util.stream.Collectors;
class Invoice{
	int tras;
	
	Invoice(int tras){
		this.tras=tras;
	}
	
	public String toString() {
		return "Transaction Id "+tras;
	}
}
public class ObjectInvocation {
	public static void main(String[] args) {
		List<Integer>transactionIds=Arrays.asList(5001,5002,5003);
		List<Invoice>invoices=transactionIds.stream().map(Invoice::new).collect(Collectors.toList());
		System.out.println(invoices);
	}
}
