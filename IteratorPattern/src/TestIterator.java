//class that will test the MusicLibrary class
public class TestIterator {

	public static void main(String[] args) {
		
		MusicLibrary ml = new MusicLibrary();
		Iterator iterator = ml.getIterator();
		
		while (iterator.hasNext()){
			
			System.out.println("Song: " + iterator.next());
		}

	}

}
