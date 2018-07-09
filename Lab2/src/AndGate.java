
public class AndGate implements Gate{
	private boolean a;
	private boolean b;
	private boolean output;
	
	@Override
	public void setA(boolean a) {
		
		this.a = a;
	}
	
	public void setB(boolean b) {
		
		this.b = b;
	}
	
	@Override
	public boolean getA() {
		
		return a;
	}
	
	public boolean getB() {
		
		return b;
	}
	
	@Override
	public boolean getOutput() {
		
		return output;
	}
	
	@Override
	public void execute() {
	
		if (a == false) output = false;
		else if (b == false) output = false;
		else output = true;
	}
	
	@Override
	public void print() {
		
		
	}

}
