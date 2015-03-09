public class PrimeGen {
	private int prevPrime = 1;

	public int nextPrime() {
		int nPrime = prevPrime+ 1;
		while (!(isPrime(nPrime))) {
			nPrime = nPrime + 1;
		}
		prevPrime = nPrime;
		return nPrime;
	}

	static boolean isPrime(int n) {
		if (n % 2 == 0)
			return false;

		for (int i = 3; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
