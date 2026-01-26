
import java.util.regex.*;
import java.util.* ; 
public class Contact {
	
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zipcode;
	private String phoneNumber;
	private String email;
	Contact(String firstName,String lastName,String city,String state,String zipcode,String phoneNumber,String email){
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
		this.state=state;
		
		String emailRegex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String phoneRegex="\\+91[6-9][0-9]{9}$";
		String zipcodeRegex="^[1-9][0-9]{5}$";
		//email
		Pattern emailPattern=Pattern.compile(emailRegex);
		Matcher emailMatcher=emailPattern.matcher(email);
		//phoneNumber
		Pattern phonePattern=Pattern.compile(phoneRegex);
		Matcher phoneMatcher=phonePattern.matcher(phoneNumber);
		//Zipcode
		Pattern zipcodePattern=Pattern.compile(zipcodeRegex);
		Matcher zipcodeMatcher=zipcodePattern.matcher(zipcode);
		
		if(emailMatcher.matches()) {
			this.email=email;
		}else {
			System.out.println("Invalid email!");
		}
		if(phoneMatcher.matches()) {
			this.phoneNumber=phoneNumber;
		}else {
			System.out.println("Invalid Number!");
		}
		if(zipcodeMatcher.matches()) {
			this.zipcode=zipcode;
		}else {
			System.out.println("Invalid Zipcode!");
		}
	}
	@Override
	 public String toString() {
		return "Name:"+firstName+" "+lastName
				+" | Contact: "+phoneNumber+", "+email
				+" | Address: "+city+", "+state+", "+zipcode;
	}
	public List<String> toList(){
		
		List<String> list = new ArrayList<>() ; 
		list.add(firstName) ; 
		
		list.add(lastName);list.add(city) ; list.add(state) ; list.add(zipcode) ; list.add(phoneNumber) ; list.add(email) ; 
		
		return list ; 
	}
	Contact(){
		
	}
	
	
}
