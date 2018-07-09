
//uses a component to create a leaf that will have a parent or composite
public class Work implements ArtList {

	   private String full_name;
	   private String medium;
	   private int age;
	   
	 //constructor that will fill all data fields
	   public Work(String full_name,String medium, int age){
		   
		   this.full_name = full_name;
		   this.medium = medium;
		   this.age = age;
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
	
		public String toString(){
	     
			return ("Work| NAME: " + full_name + "\n      MEDIUM: " + medium + "\n      AGE: " + age);
		}
	
		//following methods are left empty as this class is a leaf
		@Override
		public void add(ArtList a) {
			
		}

		@Override
		public void remove(ArtList a) {
			
		}

		@Override
		public ArtList getChild(int c) {
		
			return null;
		}
		
		//prints class's data
		@Override
		public void print() {
			
			String s = "Work| NAME: " + full_name + "\n      MEDIUM: " + medium + "\n      AGE: " + age;
			System.out.println(s);
		}
}
