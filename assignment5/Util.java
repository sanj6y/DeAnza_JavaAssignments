package assignment5;

import java.io.*;
import java.util.StringTokenizer;

public class Util {
	protected static int studentAmount;
	public static Student[] readFile(String fileName, Student[] student) {
		int studentCount = 0;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			boolean eof = false;
			int lineNumber = -1;
			while (!eof) {
				String line = br.readLine();
				lineNumber++;
				if (line == null)
					eof = true;
				else {
					System.out.println(line);
					if (lineNumber > 0) {
						student[studentCount] = new Student();
						StringTokenizer st = new StringTokenizer(line);
						while (st.hasMoreTokens()) {
							student[studentCount].setSID(Integer.parseInt(st.nextToken()));
							int[] arr = new int[5];
							for (int j = 0; j < 5; j++) {
								arr[j] = Integer.parseInt(st.nextToken());
							}
							student[studentCount].setScores(arr);
						}
						studentCount++;
					}
				}
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		studentAmount = studentCount - 1;
		return student;
	}	
}
