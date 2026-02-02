

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.*;
class Student{
	private String name;
	private char grade;
	Student(String name,char grade){
		this.name=name;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public char getGrade() {
		return grade;
	}
}
public class StudentRessultGrouping {
	public static void main(String[] args) {
		List<Student>students=Stream.of(
				new Student("Anurag",'A'),
				new Student ("Aditya",'O'),
				new Student ("Aakash",'B'),
				new Student ("Prashant",'C')
				).collect(Collectors.toList());
		
		Map<Character,List<String>>filtered=
				students.stream().collect(Collectors.groupingBy(Student::getGrade,Collectors.mapping(Student::getName, Collectors.toList())));
			System.out.println(filtered);	
	}
}
