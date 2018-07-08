//a concrete command
public class DisconnectToServer implements Command{

	private Connection c;
	
	public DisconnectToServer(Connection c){
		
		this.c = c;
	}
	
	@Override
	public void execute() {
		
		c.disconnect();
	}

}
