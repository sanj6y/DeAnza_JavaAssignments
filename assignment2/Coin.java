package assignment2;

import java.util.Random;

public class Coin {
	static final String HEADS = "heads";
	static final String TAILS = "tails";
	
	String sideUp;

	public Coin() {
		toss();
	}
	
	public void toss() {
		
		Random rnd = new Random();
		int sideup = rnd.nextInt(2);
		if (sideup == 0) {
			sideUp = HEADS;
		} else {
			sideUp = TAILS;		
		}
	}
	
	public void tossTwentyTimes() {
		int headcount = 0;
		int tailcount = 0;
		for (int i = 0; i < 20; i++) {
			toss();
			System.out.println(sideUp);
			if (sideUp.equals(HEADS)) {
				headcount++;
			} else {
				tailcount++;
			}
		}
		System.out.println("There are a total of " + headcount + " heads. There are a total of " + tailcount + " tails.");
	}
	
	public String getSideUp() {
		return sideUp;
	}
}
