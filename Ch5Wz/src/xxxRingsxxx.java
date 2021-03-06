import java.awt.*;
import javax.swing.*;
public class xxxRingsxxx extends JApplet{

	private final int radius = 600;
	private final int strokeSize = 7;
	
	public void paint(Graphics g){
		//setSize(500,2);
		Graphics2D g1 = (Graphics2D) g;
		
		Dimension appletSize = this.getSize();
	    int height = appletSize.height;
		int width = appletSize.width;

		BasicStroke bs1 = new BasicStroke(strokeSize);
		g1.setStroke(bs1);
		
		g1.setColor(Color.BLUE);
		g1.drawOval((height/2)-(2*radius), (width/2)-(radius/2), radius, radius);
		g1.setColor(Color.BLACK);
		g1.drawOval((height/2)-(2*radius)+radius, (width/2)-(radius/2), radius, radius);
		g1.setColor(Color.RED);
		g1.drawOval((height/2)-(2*radius)+(2*radius), (width/2)-(radius/2), radius, radius);
		g1.setColor(Color.YELLOW);
		g1.drawOval((height/2)-(2*radius)+(radius/2), (width/2), radius, radius);
		g1.setColor(Color.GREEN);
		g1.drawOval((height/2)-(2*radius)+(radius/2)+radius, (width/2), radius, radius);
	}
}
