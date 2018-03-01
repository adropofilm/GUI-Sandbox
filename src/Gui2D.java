import java.awt.*;
import javax.swing.*;

/*
 * GUI with 2D graphic widget
 */

public class Gui2D extends JPanel {
	  public static void main(String args[]) {
		  Gui2D panel = new Gui2D();
		  panel.go();
	  }
	  
	  public void go() {
		  	JFrame frame = new JFrame("draw panel");
		  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  	Gui2D panel = new Gui2D();
		    
		  	frame.add(panel);
		
		  	frame.setSize(300, 200);
		  	frame.setVisible(true);
	  }
	  
	  public void paintComponent (Graphics g) {
		  g.setColor(Color.MAGENTA);
		  g.fillOval(50,  50,  100, 100);
	  }
	  
	  public void paint( Graphics g) {
		  g.setColor(Color.blue);
		  g.fillOval(50,  50,  100, 100);
	  }
}


