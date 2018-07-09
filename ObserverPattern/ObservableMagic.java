import java.util.Observable;
import java.util.Observer;

public class ObservableMagic extends Observable{
	
	private String race;
	private int numSpells;
	private DelegatedObservable obs;
	
	public ObservableMagic(String race, int numSpells){
		
		this.race = race;
		this.numSpells = numSpells;
		obs = new DelegatedObservable();
	}
	
	public int getNumSpells(){
		
		return numSpells;
	}
	
	public String getRace(){
		
		return race;
	}
	
	public void addObserver(Observer o) {
		
		obs.addObserver(o);
	}
	
	public void setRace(String race){
		
		this.race = race;
		setChanged();
		notifyObservers(race);
	}
	
	public void setNumSpells(int numSpells){
		
		this.numSpells = numSpells;
		setChanged();
		notifyObservers(numSpells);
	}

	public Object getObservable() {
		
		return obs;
	}
}
