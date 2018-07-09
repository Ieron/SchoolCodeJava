//a concrete command
public class AddASignature implements Command{

	private Post p;
	
	public AddASignature(Post p){
		
		this.p = p;
	}
	
	@Override
	public void execute() {
		
		p.addSignature();
	}

}
