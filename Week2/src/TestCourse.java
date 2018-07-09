//David Smith

public class TestCourse {

	public static void main(String[] args) {
		
		Instructor one = new Instructor("Allen", "Andrew", "2301");
		TextBook two = new TextBook("JavaPrograming", "Author", "Penguin");
		Course three = new Course("Programing", one, two);
		
		System.out.println(three);
		
	}

}
