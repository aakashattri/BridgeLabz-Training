
import java.util.*;
class Doctor{
	private String name;
	private String speciality;
	private boolean isAvailableOnWeekends;
	
	Doctor(String name,String speciality,boolean isAvailableOnWeekends){
		this.name=name;
		this.speciality=speciality;
		this.isAvailableOnWeekends=isAvailableOnWeekends;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public boolean isAvailableOnWeekends() {
		return isAvailableOnWeekends;
	}

	public void setAvailableOnWeekends(boolean isAvailableOnWeekends) {
		this.isAvailableOnWeekends = isAvailableOnWeekends;
	}
	
	@Override
	public String toString() {
		return getName()+" | "+getSpeciality()+" | "+isAvailableOnWeekends();
	}
	
}
public class HospitalDoctorAvailability {
	public static void main(String[] args) {
		List<Doctor>doctors=Arrays.asList(
				new Doctor("Dr.behra","throat Specialist",false),
				new Doctor("Dr.sinha","Ear Specialist",true),
				new Doctor("Dr.raj","Dermatologist",true),
				new Doctor("Dr.Pal","gynocologist",false),
				new Doctor("Dr.Anurag","veteran",true)
			);
		
		doctors.stream().filter(doctor -> doctor.isAvailableOnWeekends()).sorted(Comparator.comparing(Doctor::getSpeciality)).forEach(System.out::println);
	};
}
