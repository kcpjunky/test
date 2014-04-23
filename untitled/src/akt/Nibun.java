package akutsu;

public class Nibun {

	void getRoot(int x) {
		int a = 0;
		int b = x;
		
		
		for (int i = 0 ;i < 100; i++) {
			if (f(b/2) < 0) {
				a = a + (b-a) / 2;
				
			} else {
				b /= 2;
			}
		}
		
		System.out.println("root +" + x + " = " + b);
	}
	
	
	public int f(int x) {
		return x * x;
	}
}
