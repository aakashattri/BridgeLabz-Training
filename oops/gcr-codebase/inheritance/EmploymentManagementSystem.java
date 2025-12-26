
class Employee{
    String name;
    int id;
    int salary;
    String role;
    Employee(String name,int id, int salary,String role){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.role=role;
    }
    public void displayDetails() {
        System.out.println("-------"+role+"-------------");
        System.out.println("Emplpoyee name: "+name);
        System.out.println("Emplpoyee id: "+id);
        System.out.println("Emplpoyee salary: "+salary);
        System.out.println("---------------------------");
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name, int id, int salary,String role,int teamSize) {
        super(name, id, salary,role);
        // TODO Auto-generated constructor stub
        this.teamSize=teamSize;
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name, int id, int salary,String role,String programmingLanguage) {
        super(name, id, salary,role);
        // TODO Auto-generated constructor stub
        this.programmingLanguage=programmingLanguage;
    }
}
class Intern extends Employee{
    Intern(String name,int id, int salary,String role){
        super(name,id,salary,role);
    }
}
public class EmploymentManagementSystem {
    public static void main(String[] args) {
        Employee manager=new Manager("Anurag",102,54000, "Manager" ,5);
        Employee developer=new Developer("Aakash",201,40000,"Developer", "Java");
        Employee intern=new Intern("Prashant",301,18000,"Intern");

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}