package senior_project;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hodgraph_output {
	public void outputWin() throws IOException {
		JFrame frame = new JFrame("Hodograph and other redesigns");
		frame.setVisible(true);
		frame.setSize(1000,750);
		calculations calc = new calculations();

		//left side of the GUI	   
		JPanel skewT = new JPanel(); //panel for the wind speed, temp, skew t etc 
		JPanel hodoGraph = new JPanel(); //pannel for the hodo
		JPanel nums = new JPanel(); //Panel for the raw data/numbers
		JPanel severeInfo = new JPanel(); //Pannel for severe information

		JLabel skewTInfo = new JLabel("Wind, temp, etc"); //Label for skewT panel
		skewT.add(skewTInfo);
		
		String skewTRef = "src/sounding section 1.png";
		BufferedImage sect1img = ImageIO.read(new File(skewTRef));
		sect1img.getHeight();
		JLabel sect1label = new JLabel(new ImageIcon(sect1img));
		skewT.add(sect1label);		
		
		//Precip water image
		String precipPath = "src/precipWaterImg.png";
		String section3 = "src/sounding section 3.png";
		BufferedImage precipWaterImg = ImageIO.read(new File(precipPath));
		BufferedImage section3img = ImageIO.read(new File(section3));
		precipWaterImg.getHeight();
		section3img.getHeight();
		JLabel precipLabel = new JLabel(new ImageIcon(precipWaterImg));
		JLabel sect3label = new JLabel(new ImageIcon(section3img));
		nums.add(precipLabel);
		nums.add(sect3label);
		

		JLabel hodoLabel = new JLabel("Hodograph in 3D"); //Label for the hodograph
		hodoGraph.add(hodoLabel);
		
		//Picture
		String hodoPath = "src/hodo_3d.png";
		BufferedImage hodoImg = ImageIO.read(new File(hodoPath));
		JLabel hodoPicLabel = new JLabel(new ImageIcon(hodoImg));
		hodoGraph.add(hodoPicLabel);	
				
		//Label for the raw math
		JLabel rawData = new JLabel("Raw numbers");
		nums.add(rawData);	
		
		//JLabel rawDataInfo = new JLabel(calc.testAdd()));
		
		//label for the severe weather info
		JLabel severeData = new JLabel("Severe Weather Info");	   
		severeInfo.add(severeData);
		
		String sect4ref = "src/sounding section 4.png";
		BufferedImage sect4img = ImageIO.read(new File(sect4ref));
		sect1img.getHeight();
		JLabel sect4label = new JLabel(new ImageIcon(sect4img));
		severeInfo.add(sect4label);		

		JSplitPane top = new JSplitPane(SwingConstants.HORIZONTAL,skewT, nums);
		frame.add(top);

		JSplitPane bottom = new JSplitPane(SwingConstants.HORIZONTAL, hodoGraph, severeInfo);
		frame.add(bottom);

		GridLayout grid = new GridLayout();
		grid.setHgap(10);

		frame.setLayout(grid);
		frame.setVisible(true);
		//}

		
	}

}


