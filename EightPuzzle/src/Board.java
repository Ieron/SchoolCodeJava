import java.util.ArrayList;

/*
 * Author: David Ieron Smith
 * Class Desc: This class will act as an obj for each board instance.
 */
public class Board {
	
	//array list of blocks to make a board
	private ArrayList<Block> board;
	private int fValue;
	private Board parent = null;
	
	//constructor for a board
	public Board(ArrayList<Block> blockList){
		
		this.board = blockList;
		
	}
	
	public void setParent(Board parent) {
		this.parent = parent;
	}
	
	//getter for blocks on board
	public ArrayList<Block> getBoard(){
		return board;
	}
	
	public Block getBlock(int gPossition){
		
		for (Block block: board){
			if (block.getGPosition() == gPossition) return block;
		}
		
		System.out.println("Error: No block found.");
		
		return null;
		
	}
	
	//will return true if a board is actually solvable
	public boolean solvable(Board gBoard) {

		int inversions = 0;
		int p = 0;
		
		//sets the goal placement of each block
		for (Block block : gBoard.getBoard()) {
			block.setPlacement(p);
			p++;
		}
		

		
		//nested for loop that counts the number of inversions
		for(Block i : board) {
			Block temp = gBoard.getBlock(i.getGPosition());
			i.setPlacement(temp.getGPlacement());
			
			for (Block j: board) {
				temp = gBoard.getBlock(j.getGPosition());
				j.setPlacement(temp.getGPlacement());
				
				if (i.getGPosition() != 0 && j.getGPosition() !=0) {
					if (i.getGPlacement() < j.getGPlacement()) {
							inversions++;					
					}
				}				
			}
		}
		
		//since the 3 by 3 board has odd size, if the num of inversions is odd, it is unsolvable.
		if(inversions % 2 == 0) return true;
		
		else return false;
		
	}

	public ArrayList<Board> neighbours() {
		ArrayList<Board> tBoard = new ArrayList<>();
		Board temp = new Board(board);
		Block nullBlock;		
		Board rBoard = temp.cloneBoard(), lBoard = temp.cloneBoard(),
				uBoard = temp.cloneBoard(), dBoard = temp.cloneBoard();
		
		nullBlock = rBoard.getBlock(0);
		
	    int x , y;
	    int nullX = nullBlock.getXCord();
	    int nullY = nullBlock.getYCord();
	    
	    //right


	    x = nullX;
	    y = nullY;
	    
	    int rightNeighbourX = x + 1;
	    int rightNeighbourY = y;
	    
	    if ((rightNeighbourX < 3 && rightNeighbourX >= 0) && (rightNeighbourY < 3 && rightNeighbourY >= 0)) {
	    	rBoard.move(nullBlock, rightNeighbourX, rightNeighbourY);
	    	tBoard.add(rBoard);
	    }
	    
	    //left
	    nullBlock = lBoard.getBlock(0);
	    x = nullX;
	    y = nullY;	    

	    int leftNeighbourX = x - 1;
	    int leftNeighbourY = y;
	    
	    if ((leftNeighbourX < 3 && leftNeighbourX >= 0) && (leftNeighbourY < 3 && leftNeighbourY >= 0)) {
	    	lBoard.move(nullBlock, leftNeighbourX, leftNeighbourY);
	    	tBoard.add(lBoard);
	    }
	    
	    //up
	    nullBlock = uBoard.getBlock(0);
	    x = nullX;
	    y = nullY;
	    
	    int topNeighbourX = x;
	    int topNeighbourY = y - 1;
	    
	    if ((topNeighbourX < 3 && topNeighbourX >= 0) && (topNeighbourY < 3 && topNeighbourY >= 0)) {
	    	uBoard.move(nullBlock, topNeighbourX, topNeighbourY);
	    	tBoard.add(uBoard);
	    }
	    
	    //down
	    nullBlock = dBoard.getBlock(0);
	    x = nullX;
	    y = nullY;	    

	    int bottomNeighbourX = x;
	    int bottomNeighbourY = y + 1;
	    
	    if ((bottomNeighbourX < 3 && bottomNeighbourX >= 0) && (bottomNeighbourY < 3 && bottomNeighbourY >= 0)) {
	    	dBoard.move(nullBlock, bottomNeighbourX, bottomNeighbourY);
	    	tBoard.add(dBoard);
	    }

	    return tBoard;
	}

	public void move(Block block, int destX, int destY) {
		
		int x = block.getXCord(), y = block.getYCord();
		Block movedBlock = board.get(board.indexOf(block));
		Block swappedBlock;
		Block foundBlock = blockAt(destX, destY);
		
		if(foundBlock != null) swappedBlock = foundBlock;
		else{
			System.out.println("Error: no tile found at" + destX + " " + destY);
			return;
		}
		
		movedBlock.setCoordinates(destX, destY);
		swappedBlock.setCoordinates(x, y);
		
	}

	public Block blockAt(int destX, int destY) {
		
		for(Block block : board){
			if(block.getXCord() == destX && block.getYCord() == destY) return block;
		}
		
		return null;
	}
	
	public Board cloneBoard() {
		ArrayList<Block> tempArray = new ArrayList<Block>();
		Board clonedBoard;
		for(Block sBlock : board) {
			tempArray.add(sBlock.cloneBlock());
		}
		return clonedBoard = new Board (tempArray);
	}
	
	public void setFValue(int fValue){
		this.fValue = fValue;
	}
	
	public int getFValue(){ return fValue; }
	public Board getParent(){ return parent; }
	
}
