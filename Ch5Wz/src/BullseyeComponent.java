import java.awt. *;
import java.awt.geom.Ellipse2D;

import javax.swing. *;



public class BullseyeComponent extends JApplet {
	public void paint(Graphics g){
	
	Graphics2D g1 = (Graphics2D) g;
	Ellipse2D.Double circle = new Ellipse2D.Double(100,100,1000,1000);
	g1.draw(circle);
	g1.setColor(Color.BLACK);
	g1.fill(circle);
	
	Ellipse2D.Double circle2 = new Ellipse2D.Double(200,200,800,800);
	g1.setColor(Color.WHITE);
	g1.draw(circle2);
	g1.fill(circle2);
	
	Ellipse2D.Double circle3 = new Ellipse2D.Double(300,300,600,600);
	g1.setColor(Color.BLACK);
	g1.draw(circle3);
	g1.fill(circle3);
	
	Ellipse2D.Double duduududududuuududuududududuududud = new Ellipse2D.Double(400,400,400,400);
	g1.setColor(Color.WHITE);
	g1.draw(duduududududuuududuududududuududud);
	g1.fill(duduududududuuududuududududuududud);
	
	Ellipse2D.Double circle5 = new Ellipse2D.Double(500,500,200,200);
	g1.setColor(Color.BLACK);
	g1.draw(circle5);
	g1.fill(circle5);

}
	
}
