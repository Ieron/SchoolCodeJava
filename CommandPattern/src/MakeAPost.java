//a concrete command
public class MakeAPost implements Command{

	private Post p;
	
	public MakeAPost(Post p){
		
		this.p = p;
	}
	
	@Override
	public void execute() {
		
		p.makePost();
	}

}
