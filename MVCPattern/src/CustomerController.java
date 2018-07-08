//class will connect both the data and visualization controlling data flow
public class CustomerController {
	
	private CustomerModel cModel;
	private CustomerView cView;
	
	public CustomerController (CustomerModel cModel, CustomerView cView){
		
		this.cModel = cModel;
		this.cView = cView;
	}

	public String getFName(){
		
		return cModel.getFName();
	}
	
	public String getlName(){
		
		return cModel.getlName();
	}
	
	public String getCusId(){
		
		return cModel.getCusId();
	}
	
	public void setNewCus(String cusId, String fName, String lName){
		
		cModel.setFName(fName);
		cModel.setLName(lName);
		cModel.setCusId(cusId);
	}
	
	public void getCusInfo(){
		
		cView.printInfo(cModel.getCusId(), cModel.getFName(), cModel.getlName());
	}

}
