package akutsu;

public class Root {
	public void root(int x) {
		
		//double x = 11;
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;

		for (int i=1; i<10; i++) {
			double t = i*i;
			if (x < t) {
			    p1 = i - 1;
				break;
			}
		}
		
		for (int i=1; i<10; i++) {
			double t = (p1+0.1*i) * (p1+0.1*i);
			if (x < t) {
				p2 = i - 1;
				break;
			}
		}
		
		for (int i=1; i<10; i++) {
			double t = (p1 + 0.1 * p2 + 0.1*i) * (p1 + 0.1 * p2 + 0.1*i);
			if (x < t) {
				p3 = i - 1;
				break;
			}
		}
		
		System.out.println(p1 + p2 * 0.1 + p3 * 0.01);
	}
}
