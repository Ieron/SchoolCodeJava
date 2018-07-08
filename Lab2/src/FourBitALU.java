
public class FourBitALU {

	private boolean a0;
	private boolean a1;
	private boolean a2;
	private boolean a3;
	
	private boolean b0;
	private boolean b1;
	private boolean b2;
	private boolean b3;
	
	private boolean op, temp;

	private boolean c = false;
	boolean out[] = new boolean[4];
	
	private FullAdder fa0;
	
	private XOrGate xg0;

	public boolean[] getOut(){
		
		return out;		
	}
	
	public boolean getC(){
		
		return c;
	}
	
	public void setValues(boolean aIn0, boolean aIn1, boolean aIn2, boolean aIn3, boolean bIn0, boolean bIn1, boolean bIn2, boolean bIn3, boolean opIn){
		
		fa0 = new FullAdder();
		xg0 = new XOrGate();
		
		a0 = aIn0;
		a1 = aIn1;
		a2 = aIn2;
		a3 = aIn3;
		
		b0 = bIn0;
		b1 = bIn1;
		b2 = bIn2;
		b3 = bIn3;
		
		op = opIn;
	}
	
	public void execute(){
		
		xg0.execute(b0, op);
		temp = xg0.getO();
		fa0.execute(c, a0, temp);
		out[0] = fa0.getS();
		c = fa0.getT();
		
		xg0.execute(b1, op);
		temp = xg0.getO();
		fa0.execute(c, a1, temp);
		out[1] = fa0.getS();
		c = fa0.getT();
		
		xg0.execute(b2, op);
		temp = xg0.getO();
		fa0.execute(c, a2, temp);
		out[2] = fa0.getS();
		c = fa0.getT();
		
		xg0.execute(b3, op);
		temp = xg0.getO();
		fa0.execute(c, a3, temp);
		out[3] = fa0.getS();
		c = fa0.getT();
	}
	
}
