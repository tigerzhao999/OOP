
public class Roachtester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoachPop roach = new RoachPop(10);
		roach.waitForDouble();
		roach.spray();
		System.out.println(roach.getRoach());
		roach.waitForDouble();
		roach.spray();
		System.out.println(roach.getRoach());
		roach.waitForDouble();
		roach.spray();
		System.out.println(roach.getRoach());

	}

}
