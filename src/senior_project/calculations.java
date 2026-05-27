package senior_project;

public class calculations {
	String[] nameList = {"Level", "Height", "Tempurature", "Dewpoint", "WindDir", "WindSpeed"};
	double[] newArray;
	
	double[] testArray2; //use to get the data from the imported file as an array maybe?
			
	public void testMeth() {
		gui guiAccess = new gui();
		for (int i = 0; i < nameList.length; i++) {	
			System.out.print(nameList[i] + " | ");
		}
		System.out.print("\n-----------------------------------");
		for (int j = 0; j < guiAccess.hardcodeTest.length; j++) {	
			if (j%6==0) {
				System.out.println();
			}
		System.out.print(guiAccess.hardcodeTest[j] + " | ");
		}		
	}
	
	public void testAdd() {
		//Sucessfully gets the specified data!!! Just gotta hardcode the rest I think. 
		//litereally just adds the two values, yay! 
		gui getGui = new gui();
		double addition = getGui.hardcodeTest[2] + getGui.hardcodeTest[3];
		System.out.print(addition);
	
		
	}
}











