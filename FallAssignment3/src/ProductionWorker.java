/* David Smith
 * CSCI 1302 A
 */

//Sub-class that extends the Employee super-class
public class ProductionWorker extends Employee{
	
	//variables to hold information on a production worker
	private int shift;
	private double hrPayRate;
	private int hrWorked;
	
	//constructor for a ProductionWorker object
	public ProductionWorker(String eName, char eNum1, char eNum2, char eNum3, char eLet, String hDate, int shift, double hrPayRate, int hrWorked){
		setName(eName);
		setNum(eNum1, eNum2, eNum3, eLet);
		setHireDate(hDate);
		this.shift = shift;
		this.hrPayRate = hrPayRate;
		this.hrWorked = hrWorked;
		
	}
	
	//getters for info about a production worker
	public int getShift(){
		
		return shift;
		
	}
	
	public double getHrPayRate(){
		
		return hrPayRate;
	}
	
	public int getHrWorked(){
		
		return hrWorked;
		
	}
	
	//method required by the super-class Employee
	public double getPayRate(){
		
		if (shift == 2){
			hrPayRate =  hrPayRate * 1.25;
			return hrPayRate * hrWorked;
		}
		
		else
			return hrPayRate * hrWorked;
		
	}
		
}