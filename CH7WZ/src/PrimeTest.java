
public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime a = new IsPrime();
		if(a.isPrime(5)){
			System.out.println("ITS PRIME");
		}
		else{
			System.out.println("NOT PRIME");
		}
		PrimeGen pg = new PrimeGen();
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());
		System.out.println(pg.nextPrime());

	}

}
