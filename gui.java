package senior_project;

import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class gui implements ActionListener {
	String stringEntered;
	calculations calc = new calculations();
	Hodgraph_output hodo = new Hodgraph_output();
	double[] hardcodeTest = {1000.00,  151.00,  -9999.00,  -9999.00,  -9999.00,  -9999.00,  997.00, 178.00, 19.40, 18.90, 160.00, 8.99};
	BufferedImage hodoImg = null;
	
	public void paint(Graphics g) {
	        g.drawImage(hodoImg, 0, 0, null);
	 }
	
	public void importImage() {
		try {
		    hodoImg = ImageIO.read(new File("hodo_3d.png"));
		} 
		catch (IOException e) {
		}
		
	}
	
	public void displayWindow() throws IOException {	
		JFrame mainFrame = new JFrame("SWORD - (Radio)Sonde Weather Observations ReDrawn");
		JTabbedPane tabbedFrame = new JTabbedPane();
				
		/* Setting main frame properties */
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension defaultWidth = mainFrame.getMaximumSize();
		double defaultWidth2 = defaultWidth.getWidth();
		defaultWidth2 = defaultWidth2/2;
	    mainFrame.setSize((int) defaultWidth2,750); //TODO: Change this so it defaults to the window size of the user's screen
	    
	    /* Adds the Tabbed Frame */
		mainFrame.add(tabbedFrame);  
		
		/* New Panel for the user input tab */
		JPanel textInput = new JPanel();
		GridLayout gridOne = new GridLayout();
		textInput.setLayout(gridOne);
		
		/* New Panel for the data display tab */
		JPanel dataOutput = new JPanel();
			
		/* New panel for hodograph */
		JPanel hodograph = new JPanel();
		JTextArea displayData = new JTextArea();
		hodograph.add(displayData);
		
		//Displays 3d Hodograph
		String hodoPathFile = "src/hodo_3d.png";
		BufferedImage hodoImg2 = ImageIO.read(new File(hodoPathFile));
		JLabel hodoPicLabel2 = new JLabel(new ImageIcon(hodoImg2));
		hodograph.add(hodoPicLabel2);	
		
		
		/* Setting up the main panel on the windows. Tabs for switching sections */ 
		//TODO: change to JFormattedTextField so it ONLY takes doubles? 
		JTextField userInputField = new JTextField();
		textInput.add(userInputField);
		
		
		/* Adding the tabs */
		tabbedFrame.addTab("Input data here", textInput);
		tabbedFrame.addTab("Data Output", dataOutput);
		tabbedFrame.addTab("Hodograph", hodograph);
		
		/* Setting up output tab and Panel */		
		/* Area to enter text */
		JTextArea textSpace = new JTextArea();
		dataOutput.add(textSpace);
		
		/*Adds button and sends data to the display panel*/
		JButton sendData = new JButton("Send input to program");
		textInput.add(sendData);
		
		sendData.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//AbstractButton userInputField = null;
				stringEntered = userInputField.getText();
				textSpace.setText(stringEntered);
				sendData.setText("Data sent");
			
				//send to string
				ArrayList toArrayList = new ArrayList<Double>();
				String delim1 = ", ";
			
				toArrayList.add(stringEntered);
				for (int i = 0; i < toArrayList.size(); i++) {
					System.out.println(toArrayList + "\n");
					toArrayList.toArray();
					//TODO:figure out how to split based on groups of five - make sublists? 
				}
			}
		});
		
				
		GridLayout gridTwo = new GridLayout();
		mainFrame.setLayout(gridTwo);
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
