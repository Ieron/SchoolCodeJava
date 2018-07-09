//David Smith

public class Course {

	private String courseName;
	private Instructor Instructor;
	private TextBook TextBook;
	
	public Course (String courseName, Instructor Instructor, TextBook TextBook){
		
		this.courseName = courseName;
		this.Instructor = Instructor;
		this.TextBook = TextBook;
		
	}
	
	public String getName(){
		
		return courseName;	
		
	}
	
	public Instructor getInstructor(){
		
		return Instructor;
		
	}
	
	public TextBook getTextBook(){
		
		return TextBook;
		
	}
	
	public String toString(){
		
		return this.courseName + this.Instructor + this.TextBook;
		
	}
	
	public static void main (String[] args){
		
		Instructor one = new Instructor("Allen", "Andrew", "2301");
		TextBook two = new TextBook("JavaPrograming", "Author", "Penguin");
		Course three = new Course("Programing", one, two);
		
		System.out.println(three);
		
	}
	
}
