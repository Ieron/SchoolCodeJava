/* David Smith
 * CSCI 1302 A
 */

//Super abstract class for all employees
public abstract class Employee {
	
	//Strings that hold employee information
	private String eName;
	private String eNum;
	private String hDate;
	
	//Setters to give info on employees
	public void setName(String name){
		
		eName = name;
		
	}
	
	public String setNum(char num1, char num2, char num3, char let){
		
		if (Character.isDigit(num1) & Character.isDigit(num2) & Character.isDigit(num3) & Character.isLetter(let)){
			eNum = num1 + num2 + num2 + "-" + let;
			return "A valid account number was entered";
		}
		
		else
			return "An invalid account number was entered";
						
	}
	
	public void setHireDate(String date){
		
		date = hDate;
		
	}
	
	public String getName(){
		
		return eName;
		
	}
	
	//getters to retrieve employee information
	public String getNum(){
		
		return eNum;
		
	}

	public String getHireDate(){
	
		return hDate;
	
	}
	
	/*public int compareTo(Employee e){
		
		if(this.eName.charAt(0) == e.eName.charAt(0))
			return 0;
		else if (this.eName.charAt(0) > e.eName.charAt(0))
			return 1;
		else
			return -1;
		
	}*/
	
	//abstract method for sub classes
	public abstract double getPayRate();
	
}
