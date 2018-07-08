import java.util.ArrayList;

/*
 * Author: David Ieron Smith
 * Class Desc: This class will hold methods to make heuristics for boards.
 */
public class Heuristics {

	//finds the total sum for the manhattan distances of all tiles
	public int manhattanDistanceTotal(Board board, Board gBoard){
		
		int distanceTotal = 0, xDist, yDist;
		Block goal;		
		ArrayList<Block> boardState = board.getBoard();
		
		for(Block currentBlock : boardState){
			if (currentBlock.getGPosition() != 0){
				goal = gBoard.getBlock(currentBlock.getGPosition());
			
				xDist = goal.getXCord() - currentBlock.getXCord();
				yDist = goal.getYCord() - currentBlock.getYCord();
				
				distanceTotal += Math.abs(xDist) + Math.abs(yDist);
			}
		}
		//System.out.println("distance: " + distanceTotal); //for testing
		return distanceTotal;
	}
	
	//finds the number of tiles not in their goal state
	public int hamming(Board board, Board gBoard) {
		
		int hammingSize = 0;
		Block goal;
		ArrayList<Block> boardState = board.getBoard();
		
		for(Block block: boardState){
			if (block.getGPosition() != 0){
				goal = gBoard.getBlock(block.getGPosition());
				if((block.getXCord() != goal.getXCord()) || (block.getYCord() != goal.getYCord()))
					hammingSize++;
			}
		}
		
		return hammingSize;
	}
	
}
