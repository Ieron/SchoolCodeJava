
public class Circle extends Shape {
	
	double pi = Math.PI;
	private double radius;
	
	public Circle(int rad){
		
		this.radius = rad;
		
	}
	
	public int getArea(){
		
		return (int) (pi * Math.sqrt(radius));
		
	}
	
	public int getPerameter(){
		
		return (int) (2 * pi * radius);
		
	}

}
