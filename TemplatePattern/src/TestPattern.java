//tests the template pattern
public class TestPattern {

	public static void main(String[] args) {
		
		MakeSandwitch sandwitch = new MakeSandwitch();
		MakeSoup soup = new MakeSoup();
		
		sandwitch.cook();
		soup.cook();
		
	}

}
