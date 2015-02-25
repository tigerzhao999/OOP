
public class Line {
	private double m , b ,xint;
	private boolean isVertical = false;
	public Line(double m, double b) {
		this.m = m;
		this.b = b;
	}
	
	public Line(double x, double y, double m) {
		this.m = m;
		b = y - (m * x);
	}
	
	public Line(double x1, double y1, double x2, double y2){
		if (x1 == x2){
			isVertical = true;
			xint = x1;
		}
		else {
			m = (y2 - y1) / (x2 - x1);
			b = y1 - (m * x1);
		}
	}
	
	public Line(double x){
		isVertical = true;
		xint = x;
	}
	public boolean intersects(Line other){
		if (isVertical && other.isVertical){
			return (xint == other.xint);
		}
		else if (isVertical && !other.isVertical){
			return true;
		}
		else if (!isVertical && other.isVertical){
			return true;
		}
		return !(m == other.m);
	}
	public boolean equals(Line other){
		
		if (isVertical && other.isVertical){
			return (xint == other.xint);
		}
		if (m == other.m){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isPara(Line other){
		if (isVertical){
			return (other.isVertical);
		}
		else {
			return m == other.m;
		}
	}
}
