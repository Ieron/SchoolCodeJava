//class that uses the iterator and container interfaces
//this class with store and return music in a music library
public class MusicLibrary implements Container{
	
	//array that will store songs 
	private String songA[] = {"VCR", "Blackstar", "Mr. Sandman", "Reflektor", "We Will Rock You", "The Sound"};
	
	//will return the iterator object made from the nested class MusicIterator
	@Override
	public Iterator getIterator() {
		
		MusicIterator mi = new MusicIterator();
		return mi;
	}
	
	//a nested class used to display the contents of the songA array
	private class MusicIterator implements Iterator{

		private int i;
		
		//used by the next() method
		@Override
		public boolean hasNext() {
			
			if (i < songA.length)
				return true;
			else
				return false;
		}
		
		//will return the next item in the songA array
		@Override
		public Object next() {
			
			if (this.hasNext())
				return songA[i++];
			else			
				return null;
		}		
	}	
}
