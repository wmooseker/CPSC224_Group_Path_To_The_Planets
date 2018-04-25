import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gameGUI extends JFrame implements ActionListener{
	
	//private JFrame mainFrame = new JFrame();
	private JPanel mainPanel = new JPanel(); 
	
    private JButton rulesButton = new JButton("Rules");
    private JButton playButton = new JButton("Play");
    
    private static final int defaultWidth = 1200;
    private static final int defaultHeight = 800;
	
	public gameGUI() {
		//define settings used for every rules panel
        setSize(defaultWidth, defaultHeight);
        //this.setLayout(new GridBagLayout());
        this.setLayout(new BorderLayout());
        
        mainPanel = createMainPanel();
        
        playButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 mainPanel.setBackground(Color.green);
	        	 Game spaceBalls = new Game(mainPanel);
	         }
	      });
        
        rulesButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           RulesFrame rules = new RulesFrame();
	         }
	      });
        
        mainPanel.add(rulesButton);
  	  	mainPanel.add(playButton);
  	  	
  	  
       add(mainPanel);
        
	}
	
	private JPanel createMainPanel() {
		JPanel returnPanel = new JPanel();
		returnPanel.setBackground(new java.awt.Color(40,23,35));
        returnPanel.setPreferredSize(new Dimension(defaultWidth,defaultHeight - 120));
        
        JLabel greeting = new JLabel("SPACE BALLS");
        greeting.setFont(new Font("Verdana",1,65));
        greeting.setForeground(Color.white);
  	  	returnPanel.add(greeting, BorderLayout.NORTH);
        
		return returnPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rulesButton) {
    		mainPanel.setBackground(Color.yellow);
    		}
    	else {
    		mainPanel.setBackground(Color.red);
    		
    	}
		
	}
}