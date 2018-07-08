
import java.util.Iterator;

public interface BinTreeADT<T> {

	public T getRootElement();
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean contains(T targetElement);
	
	public T find (T targetElement);
	
	public String toString();
	
	public Iterator<T> interator();
	
	public Iterator<T> interatorInOrder();
	
	public Iterator<T> interatorPreOrder();
	
	public Iterator<T> interatorPostOrder();
	
	public Iterator<T> interatorLevelOrder();
		
}
