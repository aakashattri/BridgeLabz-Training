
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    String department;
    int salary;
    Employee(int id,String name,String department,int salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return "Employee [id="+id+
                ", name="+name +
                ", department="+department+
                ", Salary="+salary+"]";

    }
}
public class Serialization {
    public static void main(String[] args) {
        ArrayList<Employee>employees=new ArrayList<>();
        employees.add(new Employee(101,"Anurag","Developer",50000));
        employees.add(new Employee(101,"Aakash","HR",70000));
        employees.add(new Employee(101,"Aditya","SDE",45000));
        String filename = "Employee.dat";
        try {
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(filename));
            os.writeObject(employees);
            System.out.println("Serialization Successfull");
        }catch(IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filename))) {

            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : empList) {
                System.out.println(emp);
            }

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}