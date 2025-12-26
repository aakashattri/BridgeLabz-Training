package oops.this_static_and_final;

class Patient {
	static String hospitalName="Umang Hospital";
	private static int totalPatient=0;
	private String name;
	private int age;
	private String ailment;
	private final int patientID;
	Patient(String name,int age,String ailment,int patientID){
		this.name=name;
		this.age=age;
		this.ailment=ailment;
		this.patientID=patientID;
		totalPatient++;
	}
	public static int getTotalPatient() {
		return totalPatient;
	}
	public void display() {
		if(this instanceof Patient) {
			System.out.println("        "+name+"'s details     ");
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			System.out.println("Ailment: "+ailment);
			System.out.println("ID: "+patientID);
			System.out.println("---------------------------------");
		}
	}
	
	public static void main(String[] args) {
		Patient p1=new Patient("Aakash",23,"PCOD",5648);
		Patient p2=new Patient("Sachin",12,"PCOD",4562);
		
		p1.display();
		p2.display();
		
	}
}
