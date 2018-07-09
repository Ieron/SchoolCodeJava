/*
 * David Smith
 * CSCI 1302-A
 * OCT. 26/2015
 */

import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;

public class TeamStats {
	
	public static void main(String[] args) {
		
		// Takes in a file to use via a dialog box
		JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			
			//creates file/buffered reader variables
			FileReader fr;
			BufferedReader br;
			//keeps track of how may players there are
			int playerCount = 0;
			
			//runs through each line in the file to determine how many players there are
			try {
				
				fr = new FileReader(fc.getSelectedFile());
				br = new BufferedReader(fr);
				
				String text = br.readLine();
				text = br.readLine();
				
				Scanner scan = new Scanner(text);
				do{
					
					playerCount++;
					text = br.readLine();
					scan = new Scanner (text);
					
				} while(scan.hasNext());
				
			}
			
			//exception handlers
			catch (FileNotFoundException e0){
				
				System.out.println("File not found, check file name.");
				System.exit(1);
				
			}
			
			catch (IOException e1){
				
				System.out.println("error processing your file");
				System.exit(1);
				
			}
				
				//creates player objects (one for each line in the file) and puts them in an array
				try {
				
				Player[] players = new Player [playerCount];
				Roster roster = new Roster();
				
				fr = new FileReader(fc.getSelectedFile());
				br = new BufferedReader(fr);
				
				String text = br.readLine();
				text = br.readLine();
				
				int x = 0;
				
				Scanner scan = new Scanner(text);
				
				do{
					
					int playerNum = scan.nextInt();
					String playerName = "";
					while (!scan.hasNextInt()){
						playerName += scan.next() + " ";
						}
					int gp = Integer.parseInt(scan.next());
					int gs = Integer.parseInt(scan.next());
					int totalMin = Integer.parseInt(scan.next());
					int totalFG = Integer.parseInt(scan.next());
					int totalFGA = Integer.parseInt(scan.next());
					int threeFG = Integer.parseInt(scan.next());
					int threeFGA = Integer.parseInt(scan.next());
					int ft = Integer.parseInt(scan.next());
					int fta = Integer.parseInt(scan.next());
					int offReb = Integer.parseInt(scan.next());
					int defReb = Integer.parseInt(scan.next());
					int pf = Integer.parseInt(scan.next());
					int a = Integer.parseInt(scan.next());
					int to = Integer.parseInt(scan.next());
					int stl = Integer.parseInt(scan.next());
					int blk = Integer.parseInt(scan.next());
					int totalPts = Integer.parseInt(scan.next());
					
					Player player = new Player(playerNum, playerName, gp, gs, totalMin, totalFG, totalFGA, threeFG, threeFGA, ft,
							fta, offReb, defReb, pf, a, to, stl, blk, totalPts);
					
					players[x] = player;
										
					text = br.readLine();
					x++;
					scan = new Scanner (text);
					
				} while (scan.hasNext());
				
				fr.close();
				
				//adds players array to the roster object
				roster.addPlayer(players);
				
				//prints out stats for each player
				for(int i = 0; i < players.length; i++){
					
					System.out.println("\nIndividual stats for " + players[i].getName() + "\nAverage Min Played: " + players[i].averageMinPlayed() + 
							" | Feild Goal %: " + players[i].fieldGoalPercent() + " | 3Pt FG %: " + players[i].threePtFgPercent() + " | FT %: " + players[i].ftPercent() + 
							" | Average Rebounds: " + players[i].averageReb());
					
				}
				
				//prints out stats about the team as a whole
				System.out.println("\n" + roster.mostPoints());
				System.out.println("\n" + roster.topScorers());
				System.out.println("\n" + roster.topAssists());
				System.out.println("\n" + roster.leastPF());
				
			}
			
			//exception handlers
			catch (FileNotFoundException e0){
				
				System.out.println("File not found, check file name.");
				System.exit(1);
				
			}
			
			catch (IOException e1){
				
				System.out.println("Error processing your file.");
				System.exit(1);
				
			}
		}
		
			else {
				
				System.out.println("Invalid selection.");
				System.exit(1);
						
			}

	}

}
