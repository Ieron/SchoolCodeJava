//tests the pattern by adding and removing composites and leaves
public class TestPattern {

	public static void main(String[] args) {
		
		ArtList a1 = new Artist("Pablo Picasso", "Oil Paint", 91);
		ArtList a2 = new Artist("Edgar Degas", "Oil Paint", 83);
		ArtList w1 = new Work("Guernica", "Oil Paint", 79);
		ArtList w2 = new Work("The Old Guitarist", "Oil Paint", 113);
		ArtList w3 = new Work("L'Absinthe", "Oil Paint", 140);
		
		a1.add(w1);
		a2.add(w3);
		
		a1.print();
		
		a1.remove(w1);
		
		a1.print();
		
		a1.add(w2);
		a1.add(w1);
		
		a1.print();
		a2.print();
	}

}
