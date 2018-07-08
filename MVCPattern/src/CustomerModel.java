//model class that will hold customer data
public class CustomerModel {
	
	//Strings that will hold customer info
	String fName;
	private String lName;
	private String cusId;
	
	//getters and setters that will handle data
	public void setFName(String fName){
		
		this.fName = fName;
	}
	
	public void setLName(String lName){
		
		this.lName = lName;
	}

	public void setCusId(String cusId){
		
		this.cusId = cusId;
	}

	public String getFName(){
		
		return fName;
	}
	
	public String getlName(){
		
		return lName;
	}
	
	public String getCusId(){
		
		return cusId;
	}
	
}
