/*
 * David Smith
 * Section C
 */

import java.util.Scanner;

public class PartB {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Creates a 2 by 3 2D array named pointArray
		MyPoint [][] pointArray = new MyPoint [2][3];
		
		// Nested for loop to assign values to pointArray
		for (int i = 0; i < pointArray.length; i++){
			for (int j = 0; j < pointArray[i].length; j++){
				
				System.out.println("Enter an X cordinate for pt[" + i + "][" + j + "]");
				double x = input.nextDouble();
				
				System.out.println("Enter a Y cordinate for pt[" + i + "][" + j + "]");
				double y = input.nextDouble();
				
				pointArray[i][j] = new MyPoint(x, y);
				
			}
		}
		
		// Nested for loop that prints out all the values in the pointArray array
		for (int i = 0; i < pointArray.length; i++){
			for (int j = 0; j < pointArray[i].length; j++)
				
				System.out.println("pt[" + i + "][" + j + "] = (" + pointArray[i][j].getX() + ", " + pointArray[i][j].getY() + ")");
				
		}
	
	
	}
	
}

// Class for (x, y) coordinate points
class MyPoint {
	
	double x;
	double y;
	
	// Constructor
	MyPoint(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	
	// X coordinate getter
	double getX(){
		
		return x;
		
	}
	
	// Y coordinate getter
	double getY(){
		
		return y;
		
	}
	
}
