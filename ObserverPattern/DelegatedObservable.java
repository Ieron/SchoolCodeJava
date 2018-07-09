import java.util.Observable;

//a subclass that allows for delegation
public class DelegatedObservable extends Observable{

	public void clearChanged() {
		
		super.clearChanged();
	}
	
	public void setChanged() {
		
		super.setChanged();
	}
}
