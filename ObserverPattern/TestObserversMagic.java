import java.util.Observable;
import java.util.Observer;

public class TestObserversMagic implements Observer{
	
	private ObservableMagic updateMagic;
	
	public static void main(String[] args) {
		
		ObservableMagic o = new ObservableMagic("Elf", 0);
		TestObserversMagic observer = new TestObserversMagic();
		
		//o.addObserver(observer);
		o.getObservable().addObserver(observer);
		o.setNumSpells(3);
		o.setRace("Argonian");
		o.setNumSpells(10);
	}

	@Override
	public void update(Observable observable, Object obj) {
		
		updateMagic = (ObservableMagic) observable;
		System.out.println("The number of spells is " + updateMagic.getNumSpells());
	}

}
