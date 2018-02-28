import java.awt.*;
import javax.swing.*;

public class GuiImage extends JPanel{
	static GuiImage picture;
	
	public static void main(String args[]) {
		picture = new GuiImage();
		picture.go();
	}
	
	public void go() {
	  	JFrame frame = new JFrame("image panel");
	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	
	  	frame.add(picture);
		
	  	frame.setSize(600, 600);
	  	frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		Image picture = new ImageIcon(getClass().getResource("/images/fatima.PNG")).getImage();
		g.drawImage(picture, 3, 4, this);
	}
	
}
