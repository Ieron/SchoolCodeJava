/*
 * David Smith
 * CSCI 1302-A
 * OCT. 26/2015
 */

public class Roster{

	private Player[] roster;
	
	//adds player/players to roster
	public void addPlayer(Player[] players){

		this.roster = players;
		
	}
	
	//finds the player with the most points
	public String mostPoints(){
		
		Player player;
		int playerScore;
		int x = 0;
		String playerName = null;
		
		for(int i = 0; i < roster.length; i++){
			
			player = roster[i];
			playerScore = player.getTotalPts();
			
			if (playerScore > x){
				
				x = playerScore;
				playerName = player.getName();
				
			}	
			
		}
		
		return "The player with the highest total score is " + playerName + " at " + x + "pts";
		
	}
	
	/*
	 * the following 3 methods are computed by
	 * -adding info (player name and desired data about the player) in the roster array to two temporary arrays
	 * -then sorting the arrays via nested for loops
	 * -they then return a string containing the desired info
	 */
	
	//finds the top 5 scoring players
	public String topScorers(){
		
		double minScore;
		int minIndex;
		String minName;
		
		String playerNames = "";
		
		double temp[] = new double [roster.length];
		String names[] = new String [roster.length];
		
		for(int i = 0; i < temp.length; i++){
			
			temp[i] = roster[i].averageScore();
			names[i] = roster[i].getName();
			
		}
		
		for(int i = 0; i < roster.length; i++){
			
			minScore = temp[i];
			minName = names[i];
			minIndex = i;
			
			for(int j = i + 1; j < roster.length; j++){
				
				if (minScore < temp[j]){
					
					minScore = temp[j];
					minName = names[j];
					minIndex = j;
					
				}
				
			}
			
			if (minIndex != i) {
				
				temp[minIndex] = temp[i];
				temp[i] = minScore;
				names[minIndex] = names[i];
				names[i] = minName;
				
			}
			
		}
		
		playerNames += "The top 5 scorers are as follows.\n";
		
		for(int i = 0; i <= 4; i++){
			
			playerNames += names[i] + " " + temp[i] + "\n";
			
		}
		
		return playerNames;
		
	}
	
	//finds the players with the top 5 num of assists per game
	public String topAssists(){
		
		double minScore;
		int minIndex;
		String minName;
		
		String playerNames = "";
		
		double temp[] = new double [roster.length];
		String names[] = new String [roster.length];
		
		for(int i = 0; i < temp.length; i++){
			
			temp[i] = roster[i].averageAssists();
			names[i] = roster[i].getName();
			
		}
		
		for(int i = 0; i < roster.length; i++){
			
			minScore = temp[i];
			minName = names[i];
			minIndex = i;
			
			for(int j = i + 1; j < roster.length; j++){
				
				if (minScore < temp[j]){
					
					minScore = temp[j];
					minName = names[j];
					minIndex = j;
					
				}
				
			}
			
			if (minIndex != i) {
				
				temp[minIndex] = temp[i];
				temp[i] = minScore;
				names[minIndex] = names[i];
				names[i] = minName;
				
			}
			
		}
		
		playerNames += "The players with the top 5 assists averages are as follows.\n";
		
		for(int i = 0; i <= 4; i++){
			
			playerNames += names[i] + " " + temp[i] + "\n";
			
		}
		
		return playerNames;
		
	}
	
	//finds the top 5 players with the least amount of personal fouls
	public String leastPF(){
		
		double minScore;
		int minIndex;
		String minName;
		
		String playerNames = "";
		
		double temp[] = new double [roster.length];
		String names[] = new String [roster.length];
		
		for(int i = 0; i < temp.length; i++){
			
			temp[i] = roster[i].getPf();
			names[i] = roster[i].getName();
			
		}
		
		for(int i = 0; i < roster.length; i++){
			
			minScore = temp[i];
			minName = names[i];
			minIndex = i;
			
			for(int j = i + 1; j < roster.length; j++){
				
				if (minScore > temp[j]){
					
					minScore = temp[j];
					minName = names[j];
					minIndex = j;
					
				}
				
			}
			
			if (minIndex != i) {
				
				temp[minIndex] = temp[i];
				temp[i] = minScore;
				names[minIndex] = names[i];
				names[i] = minName;
				
			}
			
		}
		
		playerNames += "The top 5 players with the least amount of personal fouls are as follows.\n";
		
		for(int i = 0; i <= 4; i++){
			
			playerNames += names[i] + " " + temp[i] + "\n";
			
		}
		
		return playerNames;
		
	}

}
