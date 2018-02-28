import javax.swing.*;

public class SimpleGui {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
}
