/*David Smith
 * CSCI 1302 A
 */
public class LinearEquation {
	
	//Creates -double variables
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//Constructor for LinearEquation object
	public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
		
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
		
	}
	
	//Accessor methods for each variable
	public double getA(){
		
		return a;
		
	}
	public double getB(){
		
		return b;
		
	}
	public double getC(){
	
		return c;
	
	}
	public double getD(){
	
		return d;
	
	}
	public double getE(){
	
		return e;
	
	}
	public double getF(){
	
		return f;
	
	}
	
	//Method that checks to see if equation is solvable
	public boolean isSolvable(){
		
		if ((a*d) - (b*c) == 0)
			return false;
		
		else
			return true;
		
	}
	
	//Accessor methods for the equation's solutions
	public double getX(){
		
		double x = (((e*d) - (b*f)) / ((a*d) - (b*c)));
		
		return x;
		
	}
	
	public double getY(){
		
		double y = (((a*f) - (e*c)) / ((a*d) - (b*c)));
		
		return y;
		
	}
	
}
