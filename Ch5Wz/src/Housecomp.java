import java.awt. *;
import java.awt.*;
import java.awt.*;

import javax.swing.*;

public class Housecomp extends JApplet {
	public void paint(Graphics g){
		
		Graphics2D g1 = (Graphics2D) g;
		Rectangle body = new Rectangle(400,400,400,400);
		Rectangle door = new Rectangle(450,590,100,210);
		Rectangle glass = new Rectangle(600,679,75,75);
		g1.drawLine(400,400,600,200);
		g1.drawLine(600,200,800,400);
		g1.draw(body);
		g1.draw(door);
		g1.draw(glass);
				
		
		
}
	
}