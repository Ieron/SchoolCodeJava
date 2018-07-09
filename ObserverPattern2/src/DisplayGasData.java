import java.util.Observable;
import java.util.Observer;

//class that displays data when it has been updated
public class DisplayGasData implements Observer {
	Observable o;
	private GasData gd;
	private double gasPrice;
	private double gasInTanks;
	private double valueOfInventory;
	
	//constructor
	public DisplayGasData(GasData o){
		this.gd = o;
		o.addObserver(this);
	}
	
	//updates and displays data
	@Override
	public void update(Observable o, Object arg) {
				this.gasPrice = gd.getGasPrice();
				this.gasInTanks = gd.getGasInTanks();
				this.valueOfInventory = gd.getValueOfInventory();
				display();
	}
	
	//method that is executed when data has been changed
	private void display() {
		System.out.println("_____________\nGas Price: $" + gasPrice + " per gal.\nGas in Tanks: " + gasInTanks + " gal." + "\nValue of Inventory: " + valueOfInventory + "$");
	}
}
