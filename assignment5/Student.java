package assignment5;

public class Student {
	private int SID;
	private int[] scores = new int[5];
	
	public int getSID() {
		return SID;
	}
	
	public void setSID(int SID) {
		this.SID = SID;
	}
	
	public int[] getScores() {
		return this.scores;
	}
	
	public int getOneQuizScore(int quizNumber) {
		try {
			return this.scores[quizNumber];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid quiz number. Returning score for first quiz.");
			return this.scores[0];
		}
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public String toString() {
		return ("SID: " + SID + "\tTest 1: " + scores[0] + "\tTest 2: " + scores[1]+ "\tTest 3: "
				+ scores[2]+ "\tTest 4: " + scores[3]+ "\tTest 5: " + scores[4]+ "\n");
	}
	
	public void printData() {
		System.out.println(this.toString());
	}
}
