import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20, 20, 100, 100);
	}
	
}
