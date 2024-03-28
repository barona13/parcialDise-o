public class Primo {
    public static boolean esPrimo(int a) {
		int d = 2;
		boolean s = true;
		while (s && d != a) {
			if (a % d == 0)
				s = false;
			d++;
		}
		return s;
	}
    
}
