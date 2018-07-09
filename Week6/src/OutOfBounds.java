//WWWWWOOOOOoooowowoowowowowowoowowowowowoowowowoowowowowoowowowowoowowowowowowowowoowowo

public class OutOfBounds {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,4,8,16};
		
		for (int i = 0; i < 5; i++){
		System.out.println(intArray.ValueOfElement(i));
		}
		
	}
	
	public int ValueOfElement(int index){
		int result;
		try{
			result = array[index];
		}
		catch(OutOfBounds Exception oe){
			
		}
		
	}

}
