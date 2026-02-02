

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private String department;
	private double salary;
	
	Employee(String name ,String department,double salary){
		this.department=department;
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class EmployeeSalaryCategorization {
	public static void main(String[] args) {
		List<Employee>employees=Arrays.asList(
				new Employee("Anurag","IT",50000),
				new Employee("Aditya","Management",40000),
				new Employee("Prashant","HR",70000),
				new Employee("aakash","Intern",30000),
				new Employee("sachin","IT",20000)
				);
		Map<String,Double>filtered=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(filtered);
	}
}
