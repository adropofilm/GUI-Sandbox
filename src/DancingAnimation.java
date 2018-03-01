import javax.swing.*;
import java.awt.*;

public class DancingAnimation {
	int yCoord = 0;
	int xCoord = 0;
	
	public static void main(String[] args) {
		DancingAnimation gui = new DancingAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dancerImage dancer = new dancerImage();
		
		frame.getContentPane().add(dancer);
		frame.setSize(700, 700);
		frame.setVisible(true);
		
		// Animate via loop:
		for (int i = 0; i < 250; i++) {
			xCoord++; yCoord++;
			dancer.repaint();
			
			try {
				Thread.sleep(10);
			} catch(Exception ex) {}
		}
	}
	
	class dancerImage extends JPanel{
		public void paintComponent(Graphics g) {
			Image picture = new ImageIcon(getClass().getResource("/images/fatima.PNG")).getImage();
			g.drawImage(picture, xCoord, yCoord, this);
		}
		
	}
}
