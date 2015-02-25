
public class LineT {
	public static void main(String[] args) {
		Line l1 = new Line(1, 2, 3);
		Line l2 = new Line(1, 2, 1, 4);
		Line l3 = new Line(5, 6);
		Line l4 = new Line(12);
		Line l5 = new Line(1);
		System.out.println("Does Line 1 intercept line 3 " + l1.intersects(l3));
		System.out.println("Is Line 2 parallel to line 4 " + l2.isPara(l4));
		System.out.println("Does Line 2 equal line 5 " + l2.equals(l5));
		
}
}
