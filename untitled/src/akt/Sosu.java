package akutsu;

public class Sosu {
	public void sosu() {

		boolean[] isPrime = new boolean[101];
		
		for (int i=2; i<100; i++) {
			if (i==2) {
				isPrime[i] = true;
			}
			isPrime[i] = true;
		}
		
		int amari = 0;
		for (int i = 2; i <= 100; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i ; j <= 100; j += i) {
					isPrime[j] = false;
				}
				System.out.println(i);
				continue;
			}
		}
	}
}
