
interface MedicalRecord{
    void addRecord(String r);
    void viewRecords();
}
abstract class Patient{
    private int patientId;
    private String name;
    private int age;
    Patient(int id,String n,int a){
        patientId=id;
        name=n;
        age=a;
    }
    abstract double calculateBill();

    void getPatientDetails(){
        System.out.println(patientId+" "+name);
    }
}
class InPatient extends Patient{
    InPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 5000;
    }
}
class OutPatient extends Patient{
    OutPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 500;
    }
}
public class PaitentManagement{
    public static void main(String[] args){
        Patient p=new InPatient(1,"Rohit",30);
        System.out.println(p.calculateBill());
    }
}
