//a concrete command
public class MakeAndSign implements Command{

	private Post p;
	
	public MakeAndSign(Post p){
			
		this.p = p;
	}
		
	@Override
	public void execute() {
			
		p.makePost();
		p.addSignature();
	}
}
