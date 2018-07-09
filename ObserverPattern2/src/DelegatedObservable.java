import java.util.Observable;

//subclass that allows for delegation
//extends to modify methods in the Observable class
public class DelegatedObservable extends Observable{

	public void clearChanged() {
		
		super.clearChanged();
	}
	
	public void setChanged() {
		
		super.setChanged();
	}
}
