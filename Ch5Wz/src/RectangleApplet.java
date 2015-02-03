import java.awt. *;
import javax.swing. *;




public class RectangleApplet extends JApplet{
	public void paint(Graphics g)
	{
		//prepare for ext graphics
		Graphics2D g2 = (Graphics2D) g;
		
		//make rectangle
		Rectangle box = new Rectangle(5,10,20,30);
		g2.draw(box);
		
		//move rectangle places
		box.translate(15, 25);
		
		//draw moved box
		g2.draw(box);
		
		
	}

}
