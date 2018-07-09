
public class OrGate implements Gate{
	
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
		
		if(a || b == true) output = true;
		else output = false;
	}
	
	@Override
	public void print() {
		
		
	}
	

}
