//class will create an object for each input class
//this class acts as a facade for input classes
public class MakeInputs {
	
	private KeyBoard keyB;
	private Mouse mouse;
	private HeadPhones hPhones;
	private GameControler gameC;
	
	//Constructor insures all objects are made
	public MakeInputs(){
		
		keyB = new KeyBoard();
		mouse = new Mouse();
		hPhones = new HeadPhones();
		gameC = new GameControler();	
	}

	//method's that call each method of the facade class's objects
	public void inputKeyBoard(){
		
		keyB.inputType();	
	}
	
	public void inputMouse(){
		
		mouse.inputType();
	}
	
	public void inputHeadPhones(){
		
		hPhones.inputType();
	}
	
	public void inputGameControler(){
		
		gameC.inputType();
	}
}
