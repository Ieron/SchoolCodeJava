/* David Smith
 * CSCI 1302 A
 */

//Sub-class that extends the Employee super-class
public class WeeklyWorker extends Employee{
	
	//variables to hold information about a weekly worker
	double weeklySal;
	int hrWorked;
	double overTimePerDiem;
	
	//constructor for a WeeklyWorker object
	public WeeklyWorker(String eName, char eNum1, char eNum2, char eNum3, char eLet, String hDate, double weeklySal, int hrWorked, double overTimePerDiem){
		setName(eName);
		setNum(eNum1, eNum2, eNum3, eLet);
		setHireDate(hDate);
		this.weeklySal = weeklySal;
		this.hrWorked = hrWorked;
		this.overTimePerDiem = overTimePerDiem;
		
	}
	
	//getters to receive information on a weekly worker
	public double getWeeklySal(){
		
		return weeklySal;
		
	}
	
	public int getHrWorked(){
		
		return hrWorked;
		
	}
	
	public double getOverTimePerDiem(){
		
		return overTimePerDiem;
		
	}
	
	//method required by the super-class Employee
	public double getPayRate(){
		
		int hrs = hrWorked - 40;
		
			if(hrWorked > 40){
				
				return weeklySal + ((hrs/8) * overTimePerDiem);

			}
			
			else
				return weeklySal;
		
	}

}
