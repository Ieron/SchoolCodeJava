import java.util.Random;
import java.util.Scanner;
/**
 *  Recursive Example
 * :
 * Copyright:     Based on the TicTacToe game of Mark Allen Weiss
 *                from the book "Algorithms and Data Structures in Java"
 *                Copyright (c) 2003
 * Organisation:
 * @author        Mark Allen Weiss
 *                
 * @version 1.0
 */

public class TicTacToe1 {

  public static final int EMPTY    = ' ';
  public static final int HUMAN1    = 0;
  public static final int HUMAN2 = 1;

  public static final int HUMAN1_WIN    = 4;
  public static final int HUMAN2_WIN = 7;
  public static final int DRAW         = 5;
  public static final int CONTINUE     = 6;


  public static final int SIZE = 3;
  private char[][] board = new char[SIZE][SIZE];
  private static long count = 0;

  public TicTacToe1() {
    clearBoard();
  }

  public void clearBoard(){
   for (int i=0; i<SIZE; i++)
        for (int j=0; j<SIZE; j++)
            board[i][j] = EMPTY;
  }

  public void printBoard() {
    System.out.println("-------");
    for (int i=0; i<SIZE; i++) {
         System.out.print("|");
         for (int j=0; j<SIZE; j++)
              System.out.print (board[i][j] + "|");
         System.out.println();
         System.out.println("-------");
    }

  }

  public boolean boardIsFull(){
   for (int i=0; i<SIZE; i++)
        for (int j=0; j<SIZE; j++)
            if (board[i][j] == EMPTY) return false;

   return true;
  }

  private int evaluatePosition (int player){
	  if(isAWin(player)) {
		  System.out.println("Player "+player+1+" wins! \n GAME OVER");
		  return player;
	  }
	  else if(boardIsFull()) {
		  System.out.println("Game tied\n GAME OVER");
		  return DRAW;
	  }
	  else return CONTINUE;
  }

  private boolean isAWin (int side){
	char piece;
	if(side == 0) piece ='X';
	else piece = 'O';

	boolean winner = false;
    // across top
    if ((board[0][0] == piece)&&(board[0][1]==piece)&&(board[0][2]==piece))
        winner = true;
    // diagonal left to right
    if ((board[0][0] == piece)&&(board[1][1]==piece)&&(board[2][2]==piece))
        winner = true;
    // down left side
    if ((board[0][0] == piece)&&(board[1][0]==piece)&&(board[2][0]==piece))
        winner = true;
    // diagonal right to left
    if ((board[0][2] == piece)&&(board[1][1]==piece)&&(board[2][0]==piece))
        winner = true;
    // across middle
    if ((board[1][0] == piece)&&(board[1][1]==piece)&&(board[1][2]==piece))
        winner = true;
    // down middle
    if ((board[0][1] == piece)&&(board[1][1]==piece)&&(board[2][1]==piece))
        winner = true;
    // across bottom
    if ((board[2][0] == piece)&&(board[2][1]==piece)&&(board[2][2]==piece))
        winner = true;
    // down right side
    if ((board[0][2] == piece)&&(board[1][2]==piece)&&(board[2][2]==piece))
        winner = true;
    return winner;
  }


private void place (int row, int col, int player){
	char piece;
	if(player == 0) piece ='X';
	else piece = 'O';
     board [row][col] = piece;
  }

  private boolean squareIsEmpty (int row, int col) {
     return board [row][col] == EMPTY;
  }

 
public static void main (String [] args){
  Scanner scan = new Scanner(System.in);
  TicTacToe1 ttt = new TicTacToe1();
  int player = 0;
  while (ttt.evaluatePosition(player)!=DRAW){
        
        System.out.println("Player "+(player+1)+"'s turn. Type int for row followed by space then int for col to place piece.");
        int row = scan.nextInt();
        int col = scan.nextInt();
        
        if(ttt.squareIsEmpty(row, col)){
        	ttt.place (row, col, player);
        	ttt.printBoard();
        	if(ttt.evaluatePosition(player)!=CONTINUE) System.exit(0);
        	player = ((player+1)%2);
        }
  }
 }
}

