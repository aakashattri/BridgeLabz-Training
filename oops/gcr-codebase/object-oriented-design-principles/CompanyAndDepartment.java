package oops.object_modelling;

import java.util.List;
import java.util.ArrayList;

class Employee {
    private String empName;
    private final int empID;
    private String empPosition;

    Employee( String empName , String empPosition , int empID ){
        this.empName = empName;
        this.empID=empID;
        this.empPosition = empPosition;
    }

    public String toString(){
        return "\nEmployee Name : "+empName+
               "\nEmployee ID : "+empID+
               "\nEmployee Position : "+empPosition;
    }
}
class Department {
    private String depName;
    private List<Employee> employees;
    Department( String depName ){
        this.depName=depName;
        employees=new ArrayList<>();
    }

    public void addEmployee( Employee employee ){
        employees.add(employee);
    }

    public String toString(){
        String result="Department Name : "+depName+"\nEmployees :";
        for( Employee emp:employees ){
            result+=emp+"\n";
        }
        return result;
    }
}

class Company {
    private String comName;
    private List<Department> departments;
    Company(String comName){
        this.comName= comName;
        departments =new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add( department );
    }
    public String toString(){
        String result="Company Name : "+comName+"\nDepartments:\n";
        for(Department dept: departments){
            result+=dept + "\n";
        }
        return result;
    }
}

public class CompanyAndDepartment {
    public static void main(String args[]){
        Company company1 =new Company("TCS");
        Company company2=new Company("CapGemini");

        Department hrDept = new Department("HR");
        Department engDept=new Department("Engineering");
        Department techDept= new Department("Technical");
        Department sdDept=new Department("SDE");

        company1.addDepartment(hrDept);
        company1.addDepartment( techDept );
        company2.addDepartment(engDept);
        company2.addDepartment( sdDept );

        Employee emp1 =new Employee("Anurag1","HR",123);
        Employee emp2=new Employee("Anurag2","HR",456);
        Employee emp3 = new Employee("Anurag3","Engineering",345);
        Employee emp4=new Employee("Anruag4","Engineering",654);
        Employee emp5=new Employee("Anurag5","Technical",385);
        Employee emp6=new Employee("Anruag6","Technical",953);
        Employee emp7 = new Employee("Anurag7","SDE",970);
        Employee emp8=new Employee("Anurag8","SDE",346);

        hrDept.addEmployee(emp1);
        hrDept.addEmployee( emp2 );
        engDept.addEmployee(emp3);
        engDept.addEmployee( emp4 );
        techDept.addEmployee(emp5);
        techDept.addEmployee( emp6 );
        sdDept.addEmployee(emp7);
        sdDept.addEmployee( emp8 );

        System.out.println( company1 );
        System.out.println(company2);
    }
}
