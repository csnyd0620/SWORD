package senior_project;

import java.io.IOException;


public class sword_main {
	public static void main(String[] args) throws IOException {	
		gui gui = new gui();
		calculations calc = new calculations();
		gui.displayWindow();
		
		calc.testMeth();
		calc.testAdd();
		
		Hodgraph_output hodo = new Hodgraph_output();
		hodo.outputWin();


	}
}
