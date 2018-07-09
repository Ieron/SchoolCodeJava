// David Smith

public class Square extends Shape {

	private int length;
	
	public Square (int len){
		
		this.length = len;
		
	}
	
	public int getArea(){
		
		return length * length;
		
	}
	
	public int getPerameter(){
		
		return length * 4;
		
	}
	
	public String toString(){
		
		return super.toString() + " and it is a square";
		
	}
	
}
