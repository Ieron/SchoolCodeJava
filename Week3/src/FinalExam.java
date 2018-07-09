//David Smith

public class FinalExam extends GradedActivity{

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int questions, int missed){
		super(10.0);
		double numericScore;
		
		numQuestions = questions;
		numMissed = missed;
		
		pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed * pointsEach);
		
		setScore(numericScore);
		
	}
	
	public double getPointsEach(){
		
		return pointsEach;
		
	}
	
	public int getNumMissed(){
		
		return numMissed;
		
	}
	
}
