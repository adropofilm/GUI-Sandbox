import javax.swing.*;
import java.awt.event.*; // ActionListener and ActionEvent are in here ;)

/*
 * GUI with frame
 */


public class GuiFrame implements ActionListener { 
	JButton button;
	
	public static void main(String[] args) {
		GuiFrame gui = new GuiFrame();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new  JButton("click me");
		
		button.addActionListener(this);	// ADD ME TO YOUR LIST OF LISTENERS, BUTTON
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {		// IMPLEMENT ACTIONLISTENER INTERFACE'S ACTIONPERFORMED()
		button.setText("I've been clicked"); 	// STUFF JUST POPPED OFF SHAWTY
	}
	
}
