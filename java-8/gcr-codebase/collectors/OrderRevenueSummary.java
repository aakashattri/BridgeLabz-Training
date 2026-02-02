

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{
	private String name;
	private double amount;
	
	Customer(String name,double amount){
		this.name=name;
		this.amount=amount;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
public class OrderRevenueSummary {
	public static void main(String[] args) {
		List<Customer>customers=Stream.of(
				new Customer("Anurag",1500),
				new Customer("Aditya",200),
				new Customer("Anurag",8965),
				new Customer("Prashant",1000)
				).collect(Collectors.toList());
		
		Map<String,Double>revenue=customers.stream().collect(Collectors.groupingBy(Customer::getName,Collectors.summingDouble(Customer::getAmount)));
		System.out.println(revenue);
	}
}
