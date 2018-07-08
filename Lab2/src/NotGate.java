
public class NotGate implements Gate{
	
	private boolean a;
	private boolean output;
	
	@Override
	public void setA(boolean a) {
		
		this.a = a;
	}
	
	@Override
	public boolean getA() {
		
		return a;
	}
	
	@Override
	public boolean getOutput() {
		
		return output;
	}
	
	@Override
	public void execute() {
		
		if(a == true) output = false;
		else output = true;
	}
	
	@Override
	public void print() {
		
		
	}

}
