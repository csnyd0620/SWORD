package senior_project;

import java.io.IOException;


public class sword_main {
	public static void main(String[] args) throws IOException {	
		gui gui = new gui();
		calculations calc = new calculations();
		//gui.displayWindow();
		
		calc.testMeth();
		System.out.println("\n");	
		calc.testAdd();
		
		Hodgraph_output hodo = new Hodgraph_output();
		//hodo.outputWin();
		
		System.out.println("\n");
		//importAndOrganize impTest = new importAndOrganize();
		importV2 impTest = new importV2();
		impTest.readFile(); //error here when it read. 


	}
}

