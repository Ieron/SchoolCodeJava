/* David Smith
Completed with Michael Henning and Christopher Pool*/

public class mainTest {

	public static void main(String[] args) {
		
		MinMaxList minMax = new MinMaxList();
		
		minMax.findMinMax();
		
		System.out.println("Min = " + minMax.getMin());
		System.out.println("Max = " + minMax.getMax());

	}

}
