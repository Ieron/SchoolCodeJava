//David Smith

public class Instructor {

	private String lastName;
	private String firstName;
	private String officeNumber;
	
	public Instructor(String lastName, String firstName, String officeNumber){
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeNumber = officeNumber;
		
	}
	
	public void setInstructor(String lastName, String firstName, String officeNumber){
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeNumber = officeNumber;
		
	}
	
	public String toString(){
		
		return "Instructor's last name is: " + this.lastName + "\nInstructor's first name is: " + this.firstName +
				"\nInstructor's office number is: " + this.officeNumber;
		
	}
	
}
