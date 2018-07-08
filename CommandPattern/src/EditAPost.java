//a concrete command
public class EditAPost implements Command{

	private Post p;
	
	public EditAPost(Post p){
		
		this.p = p;
	}
	
	@Override
	public void execute() {
		
		p.editPost();
	}

}
