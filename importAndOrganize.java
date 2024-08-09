//Defunct class - going to have user copy and paste the raw numbers to make it easier. Sheesh. 

package senior_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class importAndOrganize {
	public static void readFile() throws IOException { 
		FileInputStream fileInputStreamVar = new FileInputStream("src/sondeExample.txt");
		Scanner scan = new Scanner(fileInputStreamVar);
		String startValue = "%RAW%";
		String endValue = "%END%";
		
		ArrayList<Float> values = new ArrayList();
		
		//Print the data from startValue to End value, and add it to a string array 	
			while (scan.hasNextLine() == true) {
				String readOut = scan.nextLine();  
				if (readOut.equals(startValue)) {
					System.out.println("Test 1: ");
					System.out.println(readOut);
					while (scan.hasNextLine() == true) {
						readOut = scan.nextLine();
						//This to the next is an attempt at getting the the characters to floats. 
						readOut.replace(",", "");
						readOut = readOut.strip();
						System.out.println(readOut);
						Float.parseFloat(readOut);
						//end of new attempt
						System.out.println(readOut);
						//readOut.toCharArray();
						values.add(Float.parseFloat(readOut));
						//Adds values to the array by delimiter - need to fix.
						if (readOut.equals(endValue)) {
								break;
						}
					}
				}		
			}
			
			//This currently does nothing useful, but might be later. 
			//Float subVals;
			//for (int i = 0; i < values.size()-1; i++) {
				//subVals = values.get(i);
				//subVals.split("\\s+");
				//Integer.parseInt(subVals);
				//System.out.println(subVals);
				//System.out.println(subVals.
			//}

			
		//	System.out.print(subVals.charAt(3));
			System.out.println();
			System.out.println(values.get(6));
			
		scan.close();
	}

}
