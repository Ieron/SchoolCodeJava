
public class XOrGate {

	private boolean a, b, o;
	
	private AndGate ag0;
	private AndGate ag1;
	private OrGate og0;
	
	public void execute(boolean aIn, boolean bIn){
		
		ag0 = new AndGate();
		ag1 = new AndGate();
		og0 = new OrGate();
		
		a = aIn;
		b = bIn;
		
		ag0.setA(a);
		ag0.setB(b);
		ag0.execute();
		
		og0.setA(a);
		og0.setB(b);
		og0.execute();
		
		a = ag0.getOutput();
		b = og0.getOutput();
		
		ag1.setA(a);
		ag1.setB(b);
		ag1.execute();
		
		o = ag1.getOutput();		
	}
	
	public boolean getO(){
		
		return o;
	}
	
}
