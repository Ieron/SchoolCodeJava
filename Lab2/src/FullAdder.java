
public class FullAdder {
	
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean s;
	private boolean t;
	
	private HalfAdder ha1;
	private HalfAdder ha2;
	private OrGate orGate;
	
	public void execute(boolean aIn, boolean bIn, boolean cIn){
		
		ha1 = new HalfAdder();
		ha2 = new HalfAdder();
		orGate = new OrGate();
		
		a = aIn;
		b = bIn;
		c = cIn;
		
		ha1.setValues(b, c);
		ha1.execute();
		b = ha1.getS();
		c = ha1.getC();
		
		ha2.setValues(a, b);
		ha2.execute();
		s = ha2.getS();
		t = ha2.getC();
		
		orGate.setA(c);
		orGate.setB(t);
		orGate.execute();
		t = orGate.getOutput();
		
	}
	
	public boolean getS(){
		
		return s;		
	}
	
	public boolean getT(){
		
		return t;
	}

}
