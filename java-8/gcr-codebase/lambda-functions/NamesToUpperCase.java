package java8.lambda_functions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesToUpperCase {
	public static void main(String[] args) {
		List<String>names= Arrays.asList("anurag", "rahul", "priya");
		List<String>upperCaseNames=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseNames);
	}
}
