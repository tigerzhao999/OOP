
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class peTWOpointFOUR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		//frame.setSize(200,200);DOUBLE FRAME SIZE 
		frame.setSize(400,400);
		//JTextField text = new JTextField ("Hello, World!"); CHange to "hello Your name"
		JTextField text = new JTextField ("Hello, Wesley!");
		text.setBackground(new Color (152,251,152));
		frame.add(text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
