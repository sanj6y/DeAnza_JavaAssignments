package assignment5;

public class Statistics {
	int[] lowScores = new int[5];
	int[] highScores = new int[5];
	float[] avgScores = new float[5];
	
	void findLow(Student[] students, int studentAmount) {
		for (int i = 0; i < 5; i++) {
			int temp = students[0].getOneQuizScore(i);
			int min = temp;
			for (int j = 1; j < studentAmount; j++) {
				int temp2 = students[j].getOneQuizScore(i);
				if (min > temp2) {
					min = temp2;
				}
			}
			lowScores[i] = min;
		}
	}
	
	void findHigh(Student[] students, int studentAmount) {
		for (int i = 0; i < 5; i++) {
			int[] temp = students[0].getScores();
			int max = temp[i];
			for (int j = 0; j < studentAmount; j++) {
				int[] temp2 = students[j].getScores();
				if (max < temp2[i]) {
					max = temp2[i];
				}
			}
			highScores[i] = max;
		}
	}
	
	void findAvg(Student[] students, int studentAmount) {
		for (int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < studentAmount; j++) {
				int[] temp = students[j].getScores();
				sum = sum + temp[i];
			}
			avgScores[i] = sum/studentAmount;
		}
	}
	
	public void printStats(Student[] students, int studentAmount) {
		findLow(students, studentAmount);
		findHigh(students, studentAmount);
		findAvg(students, studentAmount);
		System.out.println("Lowest scores: " + lowScores[0] + ", "+ lowScores[1] + ", " + 
				lowScores[2] + ", " + lowScores[3] + ", "+ lowScores[4]);
		System.out.println("Highest scores: " + highScores[0] + ", " + highScores[1] + ", " + 
				highScores[2] + ", " + highScores[3] + ", " + highScores[4]);
		System.out.println("Average scores: " + avgScores[0] + ", " + avgScores[1] + ", " + 
				avgScores[2] + ", " + avgScores[3] + ", " + avgScores[4]);
	}
}
