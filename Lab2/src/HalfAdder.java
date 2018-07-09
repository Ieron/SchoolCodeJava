
public class HalfAdder {
	
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean s;
	
	private AndGate andGate1;
	private AndGate andGate2;
	private OrGate orGate;
	private NotGate notGate;
		
	public void setValues(boolean aIn, boolean bIn){
		
		andGate1 = new AndGate();
		andGate2 = new AndGate();
		orGate = new OrGate();
		notGate = new NotGate();
		
		a = aIn;
		b= bIn;	
	}
	
	public void execute(){
		
		orGate.setA(a);
		orGate.setB(b);
		orGate.execute();
		//System.out.println(orGate.getOutput());
		
		andGate1.setA(a);
		andGate1.setB(b);
		andGate1.execute();
		//System.out.println(andGate1.getOutput());
		
		a = orGate.getOutput();
		c = andGate1.getOutput();
				
		notGate.setA(c);
		notGate.execute();
		b = notGate.getOutput();
		//System.out.println(notGate.getOutput());
		
		andGate2.setA(a);
		andGate2.setB(b);
		andGate2.execute();
		s = andGate2.getOutput();
		//System.out.println(andGate2.getOutput());
	}
	
	public boolean getS(){
		
		return s;
	}
	
	public boolean getC(){
		
		return c;
	}
	
}
