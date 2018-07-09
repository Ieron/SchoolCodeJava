//David Smith
import java.util.Observer;

//subject class that extends a parent class
//uses DelegatedObservable to accomplish this
public class GasData extends GasStation{
	
	//private variables that hold data
	private double gasPrice;
	private double gasInTanks;
	private double valueOfInventory;
	//DelegatedObservable object
	private DelegatedObservable obs;
	
	//constructor
	public GasData(double gasPrice, double gasInTanks){
		this.gasPrice = gasPrice;
		this.gasInTanks = gasInTanks;
		this.valueOfInventory = gasInTanks * gasPrice;
		obs = new DelegatedObservable();
	}
	

	//wrapper implementation of methods to prevent remote tampering
	public void addObserver(Observer o){
		obs.addObserver(o);
	}
	
	public void deleteObserver(Observer o){
		obs.deleteObserver(o);
	}
	
	//sets data
	public void setData(double gasPrice, double gasInTanks){
		this.gasPrice = gasPrice;
		this.gasInTanks = gasInTanks;
		this.valueOfInventory = gasInTanks * gasPrice;
		changed();		
	}
	
	//notifies observers that data has been changed
	public void changed(){
		obs.setChanged();
		obs.notifyObservers(this);
	}
	
	//gets data from the class
	public double getGasPrice(){
		return gasPrice;
	}
	
	public double getGasInTanks(){
		return gasInTanks;
	}
	
	public double getValueOfInventory(){
		return valueOfInventory;
	}
	

}
