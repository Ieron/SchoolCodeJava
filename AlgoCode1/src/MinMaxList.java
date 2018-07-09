/* David Smith
Completed with Michael Henning and Christopher Pool*/

public class MinMaxList {

	int list[] = new int[100];  //array that will hold unordered list
	int min, max;
	
	//fills array with random int's
	public MinMaxList(){
		
		for (int i = 0; i < 100; i++){
			list[i] = (int) Math.round (Math.random() * 1000000);
		}	
	}
	
	//will find min and max elements
	public void findMinMax(){
		splitFindMinMax(0, list.length - 1);
		
	}
	
	public void splitFindMinMax(int low, int high){
		
		int tMin, tMid, tMax; //will hold temp min, max, and mid elements
		
		if (low == high){ //for the case that your min and max are equal
			max = list[low];
			min = list[low];
		}
		
		else {
			tMid = (low + high)/2; //finds the mid point
			splitFindMinMax(low, tMid); //splits and runs code recursively for the bottom half
			
			tMax = max;
			tMin = min;
			splitFindMinMax(tMid + 1, high); //Recursively runs code for the top half
			
			if (max < tMax) max = tMax; //if statements that will find min and max elements
			
			if (min > tMin) min = tMin;
				
		}
	}
	
	//getters for the min and max elements
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}
	
}
