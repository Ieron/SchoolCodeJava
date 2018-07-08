//creates a GasData object and updates its data
public class ShowGasData {

	public static void main(String[] args) {
		GasData gasData = new GasData(3.55, 200);
		DisplayGasData displayGasData = new DisplayGasData(gasData);
		
		//creates an observer
		gasData.addObserver(displayGasData);
		
		gasData.setData(3.84, 300);
		gasData.setData(3.96, 254.40);

	}

}
