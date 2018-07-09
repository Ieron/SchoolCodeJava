//a concrete command
public class ConnectToServer implements Command{

	private Connection c;
	
	public ConnectToServer(Connection c){
		
		this.c = c;
	}
	
	@Override
	public void execute() {
		
		c.connect();
	}

}
