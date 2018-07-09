/*
 * David Smith
 * Section C 
 */
public class PartA {

	public static void main(String[] args) {
		
		int array [][] = new int [3][4];
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++)
				array[i][j] = j + 1;
		}
	
		int sum = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++)
				sum += array[i][j];
		}
	
	System.out.println(sum);
	
	}
}
