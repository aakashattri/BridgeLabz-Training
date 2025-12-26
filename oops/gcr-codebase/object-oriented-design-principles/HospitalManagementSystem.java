package oops.object_modelling;

import java.util.ArrayList;
import java.util.List;
class Doctor {
   private String name;
   private List<Patient> patients=new ArrayList<>();

   public Doctor( String name ){
       this.name = name;
   }

   public void consult( Patient patient ){
       if( !patients.contains(patient) ){
           patients.add( patient );
           patient.addDoctor(this);
       }
       System.out.println("Dr. "+name+" is consulting "+patient.getName());
   }

   public String getName(){
       return name;
   }

   public List<Patient> getPatients( ){
       return patients;
   }
}
class Patient {
   private String name;
   private List<Doctor> doctors=new ArrayList<>();
   public Patient(String name){
       this.name=name;
   }
   public void addDoctor( Doctor doctor ){
       if(!doctors.contains(doctor)){
           doctors.add( doctor );
       }
   }
   public String getName( ){
       return name;
   }

   public List<Doctor> getDoctors(){
       return doctors;
   }
}
class Hospital {
   private String name;
   private List<Doctor> doctors=new ArrayList<>();
   private List<Patient> patients =new ArrayList<>();

   public Hospital( String name ){
       this.name=name;
   }
   public void addDoctor(Doctor doctor){
       doctors.add(doctor);
   }
   public void addPatient( Patient patient ){
       patients.add(patient);
   }
   public void showDetails(){
       System.out.println("Hospital: "+name);
       System.out.println("Doctors:");
       for( Doctor doctor : doctors ){
           System.out.println(" - Dr. "+doctor.getName()+" (Patients: "+doctor.getPatients().size()+")");
       }
       System.out.println("Patients:");
       for(Patient patient:patients){
           System.out.println(" - "+patient.getName()+" (Doctors: "+patient.getDoctors().size()+")");
       }
   }
}
public class HospitalManagementSystem {
   public static void main(String[] args){
       Hospital hospital = new Hospital("DR.Dev Techincal");
       Doctor drAditya=new Doctor("Aditya");
       Doctor drSingh= new Doctor("Singh");
       Patient patient1=new Patient("Yash");
       Patient patient2 =new Patient("Laksh");
       hospital.addDoctor( drAditya );
       hospital.addDoctor(drSingh);
       hospital.addPatient(patient1);
       hospital.addPatient( patient2 );

       
       drAditya.consult(patient1);
       drSingh.consult( patient1 );
       drAditya.consult(patient2);

       hospital.showDetails();
   }
}

