package assignment5;

public class StudentQuizDriver {
	public static void main(String[] args) {
		Student[] studentArray = new Student[40];
		int studentAmount = 0;
		studentArray = Util.readFile("/Users/sanjaychandrasekar/eclipse-workspace/Assignments/src/assignment5/StudentScores.txt", studentArray);
		studentAmount = Util.studentAmount;
		Statistics statistics = new Statistics();
		for (int i = 0; i < studentAmount; i++) {
			studentArray[i].printData();
		}
		statistics.printStats(studentArray, studentAmount);
	}
}