//a concrete command
public class DeleteAPost implements Command{
	
	private Post p;
	
	public DeleteAPost (Post p){
		
		this.p = p;
	}
	
	@Override
	public void execute() {
		
		p.deletePost();
	}
}
