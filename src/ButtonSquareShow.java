import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonSquareShow {
	JFrame frame;
	JButton labelButton;
	JButton colorButton;
	JLabel label;
	Boolean originalColor;
	
	public static void main(String[] args) {
		ButtonSquareShow GUI = new ButtonSquareShow();
		GUI.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instantiate objects & register listeners:
		labelButton = new  JButton("change label");
		labelButton.addActionListener(new LabelListener());
		
		colorButton = new JButton("change circle");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label, yo.");
		Gui2D circle = new Gui2D();
		
		// Add content to JFrame:
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, circle);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
	
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event ) {
			label.setText("Who told you to change me?!");
		}
	}
	
	
}
