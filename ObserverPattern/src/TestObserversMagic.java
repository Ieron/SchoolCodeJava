/*import java.util.Observable;
import java.util.Observer;*/

public class TestObserversMagic {
	//private ObservableMagic updateMagic;
	
	public static void main(String[] args) {
		
		ObservableMagic o = new ObservableMagic("Elf", 0);
		//TestObserversMagic observer = new TestObserversMagic();
		RaceObserver raceObs = new RaceObserver();
		SpellObserver spellObs = new SpellObserver();
		
		o.addObserver(raceObs);
		o.addObserver(spellObs);
		//o.addObserver(observer);
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
