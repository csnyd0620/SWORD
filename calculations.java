package senior_project;

public class calculations {
	String[] nameList = {"Level", "Height", "Tempurature", "WindDir", "WindSpeed"};
	double[] newArray;
			
	public void testMeth() {
		gui guiAccess = new gui();
		for (int i = 0; i < nameList.length; i++) {	
			System.out.print(nameList[i] + " ");
		}
		System.out.println();
		for (int j = 0; j < guiAccess.hardcodeTest.length; j++) {	
			System.out.print(guiAccess.hardcodeTest[j] + " ");
				if (j%5 == 0 && j>=5) {
				System.out.print("\n");
				
			}
			
		}
		System.out.println();		
	}
	
	public void testAdd() {
		//Sucessfully gets the specified data!!! Just gotta hardcode the rest I think. 
		gui getGui = new gui();
		double addition = getGui.hardcodeTest[2] + getGui.hardcodeTest[3];
		System.out.print(addition);
	
		
	}
}





