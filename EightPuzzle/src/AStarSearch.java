import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Author: David Ieron Smith
 * Class Desc: Search algo that will find the best solution to a Mystic Square
 */

public class AStarSearch {

	private Board sBoard, gBoard;
	
	//constructor for heuristic class
	private	Heuristics heuristic = new Heuristics();
	
	//keeps track of number of moves made
	private int moves = 0;
	
	StateComparator comp = new StateComparator();
	//priority queue that holds states that need to be visited (open)
	private PriorityQueue<Board> pQ = new PriorityQueue<Board>(100, comp);

	//holds states already visited (closed)
	private ArrayList<Board> visitedBoards = new ArrayList<Board>();
	
	public AStarSearch(Board sBoard, Board gBoard){
		
		//pQ.add(sBoard);
		
		this.sBoard = sBoard;
		this.gBoard = gBoard;
		
		search();
		
	}
	
	public void search(){		
		
		Iterator<Board> iterator = pQ.iterator();
		ArrayList<Board> neighboringBlocks;
		ArrayList<Board> minFArray = new ArrayList<Board>();
		
		Board cBoard = sBoard;
		int minF = -1;
		
		//search begins here
		while(!compare(cBoard, gBoard)) {
			//print(cBoard); //for testing
			if(cBoard.solvable(gBoard) == false) {
				System.out.println("no solution");
				return;
			}
						
			if(isVisited(cBoard)) {
				continue;
			}
			//adds current state to closed list
			visitedBoards.add(cBoard);
			
			//gets neighbors
			neighboringBlocks = cBoard.neighbours();
			
			for(Board temp : neighboringBlocks) {
				//if not in closed list it will find the neighbor's f and add it to the queue
				if(!isVisited(temp)) {
					temp.setFValue(findF(temp, false));					
					temp.setParent(cBoard);
					if (temp.getFValue() < minF || minF == -1) {
						minF = temp.getFValue();
					}
					pQ.add(temp);
				}
			}
			
			//!this is where I might be having problems!
			//the next loop sees if any open states have the same f value
			//if they do it will assign new f values based off of their manhat distance as well
			//it will compare and add them back into the queue
			//if one has a lower f, then it's f value is set to 0 so that it is visited next
			Board minB = pQ.poll();	
			iterator = pQ.iterator();
			
				while(iterator.hasNext()) {
					Board next = iterator.next();
					if (next.getFValue() == minB.getFValue()) {				
						next.setFValue(findF(next, true));
						minB.setFValue(findF(minB, true));
						if (next.getFValue() < minB.getFValue())
							minB = next;
						next.setFValue(findF(next, false));
						minB.setFValue(0);
					}				
			}
			
			pQ.add(minB);

			minFArray.clear();			
			cBoard = pQ.poll();
			moves++;
			minF = -1;
			//print(cBoard); //for testing
			iterator = pQ.iterator();
		}
		//prints out all moves to get to the goal
		moves = 0;
		System.out.println("Moves to goal: " + moves);
		print(cBoard);
		while(cBoard.getParent() != null) {
			moves++;
			System.out.println("Moves to goal: " + moves);
			print(cBoard.getParent());
			cBoard = cBoard.getParent();
		}
		
	}
	
	//checks if board is in queue
	private boolean isVisited(Board cBoard) {
			
		for (Board board : visitedBoards) {
			if(compare(board, cBoard)) return true;
		}
			
		return false;			
	}		
	
	//method that looks at a block state. used to find its f value
	public int findF(Board board, boolean useManHat){
		
		int hamming = heuristic.hamming(board, gBoard);
		
		if(useManHat == true){
			int manhat = heuristic.manhattanDistanceTotal(board, gBoard);
			return moves + manhat + hamming;
		}
		else return moves + hamming;
	}
	
	//compare to see if boards are equal
	private Boolean compare(Board b1, Board b2) {
		
		Boolean same = true;
		
		for(Block block1 : b1.getBoard()) {
			for (Block block2: b2.getBoard()) {
				if((block1.getGPosition() == block2.getGPosition()) &&
						(block1.getXCord() != block2.getXCord() || block1.getYCord() != block2.getYCord()))
					return same = false;					
			}
		}
		
		return same;
		
	}
	
	//prints out board
	private void print(Board board){
		
		System.out.println();
		
		int lnCounter = 0;
		for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				Block temp = board.blockAt(j, i);
				System.out.print(temp.getGPosition() + " ");
				lnCounter++;
			
				if (lnCounter >= 3){
					System.out.println();
					lnCounter = 0;
				}			
			}
		}
		System.out.println();
	}
	
}
