package assignment3;
import java.io.*;
import java.util.*;

public class FileIO {
	private String fname = null;
	private boolean DEBUG = true;

	public FileIO(String fname) {
		this.fname = fname;
	}

	public Franchise readData() {
		Franchise a1 = null;
		int counter = 0;
		try {
			FileReader file = new FileReader(fname);
			BufferedReader buff = new BufferedReader(file);
			String temp;
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				if (line == null)
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line);
					if (counter == 1) {
						temp = line;
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					if (counter == 2)
						;
					if (counter > 2) {
						  	int x = buildStore(a1, (counter-3), line);
							if (DEBUG)
								System.out.println("Reading Store # "+(counter-2)+" Number of weeks read =  " +  x);
							if (DEBUG)
							{	
								System.out.println("Data read:");
								a1.getStores(counter-3).printData();
							}
					}
				}
			}
			buff.close();
		} catch (Exception e) {
			System.out.println("Error -- " + e.toString());
		}
		return a1;
	}

	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp);
	    while (st.hasMoreTokens()) {
	         for(day=0;day<7;day++)
	         {
		    	 s1 = st.nextToken();
		         sale = Float.parseFloat(s1);
	        	 tstore.setSaleForWeekDayIntersection(week, day, sale);
	         }
	         week++;
	    }
		a1.setStores(tstore, counter);
	    return week; 
	}
}
