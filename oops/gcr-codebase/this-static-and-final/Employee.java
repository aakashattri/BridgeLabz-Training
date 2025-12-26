package oops.this_static_and_final;
class Employee{
	static String companyName="BridgeLabz";
	private String name;
	private final String id;
	private String designation;
	private static int totalEmployee=0;
	Employee(String name,String id,String designation){
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployee++;
	}

	public static int displayTotalEmployee(){
		return totalEmployee;
	}

	public void display(){
		if(this instanceof Employee){
			System.out.println("Employee Name: "+name);
			System.out.println("Employee ID: "+id);
			System.out.println("Employee Designation: "+designation);
		}
		else{
			System.out.println("Not an instnce ");
		}
	}

	public static void main(String args[]){
		Employee emp1=new Employee("Anurag","EMP123", "SDE");
		Employee emp2 =new Employee("Prashant","EMP456","SDE");

		System.out.println("Company Name: "+companyName);
		emp1.display();
		System.out.println();
		emp2.display();

		System.out.println("\nTotal Employees: "+totalEmployee);

	}
}