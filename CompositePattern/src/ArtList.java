//this interface is a component used to create parent's a leafs for the composite pattern
public interface ArtList {

	public void add(ArtList a);
	public void remove(ArtList a);
	public String getName();
	public String getMedium();
	public int getAge();
	public ArtList getChild(int c);
	public void print();
	
}
