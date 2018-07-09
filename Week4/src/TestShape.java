
public class TestShape {

	public static void main(String[] args) {
		
		Shape s = new Square (10);
		Shape c = new Circle (3);
		//Shape t = new Triangle(6);
		
		System.out.println("Area: " + s.getArea() + "\nPerameter: " + s.getPerameter() + "\n" + s.toString());

	}

}
