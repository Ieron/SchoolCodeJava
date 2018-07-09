/*
 * Author: David Ieron Smith
 * Class Desc: The main class of a program that will solve a Mystic Square
 * in the least amount of moves.
 * 
 * Cited Sources:
 * https://www.cs.princeton.edu/courses/archive/fall12/cos226/assignments/8puzzle.html
 * https://codereview.stackexchange.com/questions/72047/8-puzzle-solver-a-search
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Board sBoard, gBoard; //adds start and goal boards		
		ArrayList <Block> sBlocks = new ArrayList<Block>(); //will hold blocks to create a new start board
		ArrayList <Block> gBlocks = new ArrayList<Block>(); //will hold blocks for goal
		String start;
		JFileChooser fileC = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		Scanner scan = new Scanner(System.in);
		/*for testing
		System.out.println("Select your txt file with start state");
		fileC.showOpenDialog(null);
		File temp = fileC.getSelectedFile();
		
		sBlocks = fileRead(temp.getAbsolutePath());*/
		System.out.println("Enter the file path to your .txt file with your unsolved puzzle: ");
		start = scan.next();
		sBlocks = fileRead(start);
		sBoard = new Board(sBlocks);
		/*for testing
		System.out.println("Select your txt file with goal state");
		fileC.showOpenDialog(null);
	    temp = fileC.getSelectedFile();
		
		blocks = fileRead(temp.getAbsolutePath());*/
		
		//builds the goal board
		
		for(int i = 0; i<=2; i++) {
			Block t = new Block(i, i, 0);
			gBlocks.add(t);
		}
		
		for(int i = 0; i<=2; i++) {
			Block t = new Block(i + 6, i, 1);
			gBlocks.add(t);
		}
		
		for(int i = 0; i<=2; i++) {
			Block t = new Block(i + 3, i, 2);
			gBlocks.add(t);
		}
		
		gBoard = new Board(gBlocks);
		
		AStarSearch aStar = new AStarSearch(sBoard, gBoard);
	
		System.exit(0);
	}
	
	public static ArrayList<Block> fileRead(String fileLoc) throws IOException{
		ArrayList <Block> blocks = new ArrayList<Block>();
		int[][] pArray = new int[3][3]; //used for in/output	
		int rowCnt = 0; //keeps track of blocks for in/output

		//uses a br and does not put text into an array
		String input = "";
		
		FileReader txt = new FileReader(fileLoc);
		BufferedReader br = new BufferedReader(txt);				
		String ln = br.readLine();
				
		while (ln != null){
			input += ln + "\n";
			ln = br.readLine();
		}
		
		System.out.println(input);
		
		Scanner scan = new Scanner(new File(fileLoc));
		
		//will scan the input file to create an array list of blocks, this will then be used to construct the start board
		while (rowCnt < 3){
			for (int i = 0; scan.hasNextInt() == true && i < 3; i++){
				pArray[i][rowCnt] = scan.nextInt();
				Block temp = new Block(pArray[i][rowCnt], i, rowCnt); //makes a new block to be stored in the array list blocks
				blocks.add(temp);
			}
			rowCnt++;
		}
		
		br.close();
		scan.close();
		
		return blocks;
	}
	
}
