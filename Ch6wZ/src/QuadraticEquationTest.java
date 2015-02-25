
public class QuadraticEquationTest {

	public static void main(String[] args) {
		QuadraticEquation qe = new  QuadraticEquation(1, 0, -1);
		if (qe.hasSolutions()){
			System.out.println("Solution 1 is " + qe.getSolution1());
			System.out.println("Solution 2 is " + qe.getSolution2());	
		}
		else {
			System.out.println("No Real Solutions");
		}
	}
}

