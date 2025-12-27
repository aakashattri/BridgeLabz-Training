
interface Department{
    void assignDepartment(String dept);
    String getDepartmentDetails();
}
abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    abstract double calculateSalary();
    public void displayDetails(){
        System.out.println(employeeId+" "+name+" "+calculateSalary());
    }
}
class FullTimeEmployee extends Employee implements Department{
    String dept;
    FullTimeEmployee(int id,String name,double salary){
        super(id,name,salary);
    }
    double calculateSalary(){
        return getBaseSalary();
    }
    public void assignDepartment(String dept){
        this.dept=dept;
    }
    public String getDepartmentDetails(){
        return dept;
    }
}
class PartTimeEmployee extends Employee implements Department{
    int hours;
    double rate;
    String dept;
    PartTimeEmployee(int id,String name,int hours,double rate){
        super(id,name,0);
        this.hours=hours;
        this.rate=rate;
    }
    double calculateSalary(){
        return hours*rate;
    }
    public void assignDepartment(String dept){
        this.dept=dept;
    }
    public String getDepartmentDetails(){
        return dept;
    }
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee(1,"Anurag",50000);
        Employee e2=new PartTimeEmployee(2,"aakash",40,300);
        e1.displayDetails();
        e2.displayDetails();
    }
}
