/*
 * Author: David Ieron Smith
 * Class Desc: This class will act as an obj for each block. These will be used to make a board.
 */
public class Block {
	
	//int that will hold the block's gPossition(the num on the block and its coordinates on the board.
	private int gPosition, xCord, yCord, gPlacement;
	
	//initializer for the Block class
	public Block(int gPosition, int xCord, int yCord){
		
		this.gPosition = gPosition;
		
		this.xCord = xCord;
		this.yCord = yCord;
		
	}
	
	//setter for coordinates
	public void setCoordinates (int xCord, int yCord){
		
		this.xCord = xCord;
		this.yCord = yCord;
		
	}
	
	public void setPlacement (int gPlacement){
		this.gPlacement = gPlacement;
	}
	
	public Block cloneBlock() {
		Block clone = new Block(gPosition, xCord, yCord);
		return clone;		
	}
	
	//getters for x/y coordinates, and goal position
	public int getXCord(){ return xCord; }
	
	public int getYCord(){ return yCord; }	
	
	public int getGPosition(){ return gPosition; }
	
	public int getGPlacement(){ return gPlacement; }
		
}
