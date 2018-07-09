/* David Smith
 * CSCI 1302 A
 */

//Test class to show the relationship between the Employee super-class and its sub-classes
public class TestEmployee {

	public static void main(String[] args) {
		
		//Creates an array of employees and fills it with 6 ProductionWorker objects and 2 WeeklyWorker objects
		Employee[] employee = new Employee[8];
		employee[0] = new ProductionWorker("Bobba Fett", '1', '1', '1', 'A', "1/2/2013", 2, 8, 48);
		employee[1] = new ProductionWorker("Luke Skywalker", '2', '1', '1', 'B', "1/5/2014", 1, 7, 48);
		employee[2] = new ProductionWorker("Hon Solo", '1', '6', '1', 'D', "6/2/2013", 1, 7, 48);
		employee[3] = new ProductionWorker("Yoda", '1', '1', '8', 'C', "1/2/2013", 2, 20, 10);
		employee[4] = new ProductionWorker("Darth Vader", '3', '1', '1', 'A', "4/10/2009", 2, 8, 40);
		employee[5] = new ProductionWorker("Ron Swanson", '4', '1', '1', 'L', "4/24/1995", 2, 4, 89);
		employee[6] = new WeeklyWorker("R2D2", '1', '1', '1', 'E', "6/9/2010", 300, 48, 5);
		employee[7] = new WeeklyWorker("C3PO", '1', '1', '3', 'E', "9/2/2010", 300, 57, 5);
		
		//java.util.Arrays.sort(employee);
		
		System.out.println("This week's saleries for each employee are...\n");
		
		//for loop that prints out each employee's name, number, and their salary this week
		for(int i = 0; i < 8; i++){
			
			System.out.println(employee[i].getName() + " " + employee[i].getNum() + ": $" + employee[i].getPayRate());
			
		}

	}

}
