package oops.this_static_and_final;

public class Student {
	static String universityName="GLA University";
	private static int totalStudent=0;
	private String name;
	private final int rollNumber;
	private String grade;
	public Student(String name, int rollNumber, String grade) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		totalStudent++;
	}
	public static int displayTotalStudent(){
		return totalStudent;
	}
	public void display(){
		if(this instanceof Student){
			System.out.println("    Student Details   ");
			System.out.println("Student Name: "+name);
			System.out.println("Student Roll Nuber: " +rollNumber);
			System.out.println("Student Grade: "+ grade);
			System.out.println("--------------------------");
		}
		else{
			System.out.println("Not An Instance");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1= new Student("Muskan",2115000641, "A");
			Student s2 =new Student("Priya", 2115000767,"A");
			Student s3=new Student("Rashmi",2115000832,"A");
			System.out.println("University Name: " +universityName);
			s1.display();
			System.out.println();
			s1.display();
	        System.out.println();
			s1.display();
	        System.out.println();
			System.out.println("Total Student: "+totalStudent);
	}

}
