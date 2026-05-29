package senior_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
	
public class importV2 {
	public static void readFile() throws IOException { 
		FileInputStream fileInputStreamVar = new FileInputStream("src/sondeExample.txt");
		Scanner scan = new Scanner(fileInputStreamVar);
		String startValue = "%RAW%";
		String endValue = "%END%";
		
		List<Double> vars = new ArrayList<Double>();
		
		while (scan.hasNextLine() == true) {
			String startOrEnd;
			startOrEnd = scan.nextLine();
			System.out.println("Test 1 success");
			//System.out.println(scan.nextLine());
			if (startOrEnd.equals(startValue)) {
				while (scan.hasNextLine() == true) {
					System.out.print("Test 1.5 success");
					System.out.println(scan.nextLine());
					double varVal = Double.parseDouble(scan.nextLine());
					vars.add(varVal);
					System.out.println(vars);
				}
				if (startOrEnd.equals(endValue)) {
				break;
				}
			}
			//startOrEnd = scan.nextLine();
			
			System.out.print("Test 2 success");
			//System.out.print(vars);
		}
		
	}
}


