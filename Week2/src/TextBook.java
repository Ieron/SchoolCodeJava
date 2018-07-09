//David Smith

public class TextBook {

	private String title;
	private String author;
	private String publisher;
	
	public TextBook (String title, String author, String publisher){
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
	}
	
	public void setBook (String title, String author, String publisher){
		
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
	}
	
	public String toString(){
		
		return "\ntitle: " + this.title + "\nauthor: " + this.author + "\npublisher: " + this.publisher + "\nHash memory: " + this.hashCode();
		
	}
	
}
