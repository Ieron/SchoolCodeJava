import java.util.List;
import java.util.ArrayList;

//uses the component to create a composite node that will have children
public class Artist implements ArtList{
	   
	   private String full_name;
	   private String medium;
	   private int age;
	   private List<ArtList> artists;

	   //constructor that will fill all data fields
	   public Artist(String full_name,String medium, int age) {
	      
		  this.full_name = full_name;
	      this.medium = medium;
	      this.age = age;
	      artists = new ArrayList<ArtList>();
	   }

	   //methods that allow the class to manipulate its children
	   public void add(ArtList a) {
		   
		   System.out.println("item added\n");
		   artists.add(a);
	   }

	   public void remove(ArtList a) {
		   
		   System.out.println("item removed\n");
		   artists.remove(a);
	   }

	   public List<ArtList> getArt(){
	    
		   return artists;
	   }
	   
	   //getters to retrieve specific data fields
	   @Override
	   public String getName() {
		
		   return full_name;
	  }

	   @Override
	   public String getMedium() {
		
		   return medium;
	   }

	   @Override
	   public int getAge() {
	
		   return age;
	   }

	   @Override
	   public ArtList getChild(int c) {
		
		   return artists.get(c);
	   }
	   //prints out the parent and its children
	   //note: prints nothing if the parent has no children
	   public void print(){   
			   
		   for (ArtList artlist : artists) {
	            
			   	artlist.print();
	            String s = "Artist| NAME: " + full_name + "\n        MEDIUM: " + medium + "\n        AGE: " + age;
	            System.out.println(s);		   
		   }
	   }
}
