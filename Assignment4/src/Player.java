/*
 * David Smith
 * CSCI 1302-A
 * OCT. 26/2015
 */

public class Player{
	
	private int playerNum;
	private String playerName;
	private int gp;
	private int gs;
	private int totalMin;
	private int totalFG;
	private int totalFGA;
	private int threeFG;
	private int threeFGA;
	private int ft;
	private int fta;
	private int offReb;
	private int defReb;
	private int pf;
	private int a;
	private int to;
	private int stl;
	private int blk;
	private int totalPts;
	
	//constructor method for player objects
	public Player(int playerNum, String playerName, int gp, int gs, int totalMin, int totalFG, int totalFGA, int threeFG, int threeFGA, int ft,
			int fta, int offReb, int defReb, int pf, int a, int to, int stl, int blk, int totalPts){
		
		this.playerNum = playerNum;
		this.playerName = playerName;
		this.gp = gp;
		this.gs = gs;
		this.totalMin = totalMin;
		this.totalFG = totalFG;
		this.totalFGA = totalFGA;
		this.threeFG = threeFG;
		this.threeFGA = threeFGA;
		this.ft = ft;
		this.fta = fta;
		this.offReb = offReb;
		this.defReb = defReb;
		this.pf = pf;
		this.a = a;
		this.to = to;
		this.stl = stl;
		this.blk = blk;
		this.totalPts = totalPts;
		
	}
	
	//methods that calculate info about a player
	public double averageAssists(){
		
		if (gp == 0){
			
			return 0;
			
		}
		
		return Math.floor(((double)a/(double)gp)*100)/100;
		
	}
	
	public double averageScore(){
		
		if (gp == 0){
			
			return 0;
			
		}
		
		return Math.floor(((double)totalPts/(double)gp)*100)/100;
		
	}
	
	public double averageMinPlayed(){
		
		if (gp == 0){
			
			return 0;
			
		}
		
		double average = Math.floor(((double)totalMin/(double)gp)*100)/100;
		
		return average;
		
	}
	
	public double fieldGoalPercent(){
		
		if (totalFG == 0){
			
			return 0;
			
		}
		
		return Math.floor(((double)totalFG/(double)totalFGA)*100)/100;
		
	}
	
	public double threePtFgPercent(){
		
		if (threeFG == 0){
			
			return 0;
			
		}
		
		return Math.floor(((double)threeFG/(double)threeFGA)*100)/100;
		
	}
	
	public double ftPercent(){
		
		if (ft == 0){
			
			return 0;
			
		}
		
		return Math.floor(((double)ft/(double)fta)*100)/100;
		
	}
	
	public double averageReb(){
		
		return (Math.floor(((double)offReb + (double)defReb)*100)/100)/2;
		
	}
	
	//getters for each piece of given info about a player 
	public int getPlayerNum(){
		
		return playerNum;
		
	}
	
	public String getName(){
		
		return playerName;
		
	}
	
	public int getGp(){
		
		return gp;
		
	}
	
	public int GetGs(){
		
		return gs;
		
	}
	
	public int getTotalMin(){
		
		return totalMin;
		
	}

	public int getTotalFG(){
	
	return totalFG;
	
	}

	public int getTotalFGA(){
		
		return totalFGA;
		
	}
	
	public int getThreeFG(){
		
	return threeFG;
	
	}
	
	public int getThreeFGA(){
		
	return threeFGA;
	
	}
	
	public int getFt(){
		
	return ft;
	
	}
	
	public int getFta(){
		
	return fta;
	
	}
	
	public int getOffReb(){
		
	return offReb;
	
	}
	
	public int getDefReb(){
		
	return defReb;
	
	}
	
	public int getPf(){
		
	return pf;
	
	}
	
	public int getA(){
		
	return a;
	
	}
	
	public int getTo(){
		
	return to;
	
	}
	
	public int getStl(){
		
	return stl;
	
	}
	
	public int getBlk(){
		
	return blk;
	
	}
	
	public int getTotalPts(){
		
		return totalPts;
		
	}
	
	//returns each statppp of a player
	public String print(){
		
		String info = playerNum + " " + playerName + " " + gp + " " + gs + " " + totalMin + " " + totalFG + " " + totalFGA + " " + 
		threeFG + " " + threeFGA + " " + ft + " " + fta + " " + offReb + " " + defReb + " " + pf + " " + a + " " + to + " " + stl + " " + blk + " " + totalPts;
		
		return info;
		
	}
	
}
