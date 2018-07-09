//the invoker will store and execute commands in an array
public class Invoker {
	
	Command cArray[];
	int i = 0;
	public void addC(Command c){
		
		cArray[i] = c;
		i++;
		c.execute();
	}
	
}
