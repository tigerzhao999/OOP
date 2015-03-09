import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Spiral extends JApplet {
	private final int SEGMENT_LENGTH = 90;

	public void init() {
		setSize(800, 800);
		setBackground(Color.WHITE);
	}

	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 2000, 2000);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3));

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;

		g2d.setColor(Color.BLUE);

		// Start drawing spiral
		int x = xCenter;
		int y = yCenter;
		int step = 0;

		while ((x < 2500) && (y < 2500) && (x > 0) && (y > 0)) {
			int length = SEGMENT_LENGTH + ((step / 2) * SEGMENT_LENGTH);
			if (step % 2 == 0) {
				if (x <= xCenter) {
					g2d.drawLine(x, y, x + length, y);
					x += length;
				} else {
					g2d.drawLine(x, y, x - length, y);
					x -= length;
				}

			} else {
				if (y < yCenter) {
					g2d.drawLine(x, y, x, y + length);
					y += length;
				} else {
					g2d.drawLine(x, y, x, y - length);
					y -= length;
				}

			}
			step++;
		}
	}
}
