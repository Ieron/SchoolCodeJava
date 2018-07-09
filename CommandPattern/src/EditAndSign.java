//a concrete command
public class EditAndSign implements Command{

	private Post p;
	
	public EditAndSign(Post p){
		
		this.p = p;
	}
	
	@Override
	public void execute() {
		
		p.editPost();
		p.addSignature();
	}

}
