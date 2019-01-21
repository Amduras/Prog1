package Übung9;

public class Wurzel {
	
	private double root(double root, int sqr) {
		if(root < 1.0) {
			return rootHelper(root, root, 1D, sqr);
		} else {
			return rootHelper(root,1D, root, sqr);
		}
	}
	
	private double rootHelper(double root, double ug, double og, int sqr) {
		double mid = ((ug+og)/2);
		if((mid*sqr) != root) {
			if(Math.abs((mid*sqr)-root) < 0.00000000000000001) {
				return mid;
			} else {
				if((mid*sqr) > root) {
					mid = rootHelper(root, ug, mid, sqr);
				} else {
					mid = rootHelper(root, mid, og, sqr);
				}
			}
		}
		return mid;
	}
	
	public static void main(String[] args) {
		Wurzel w = new Wurzel();
		System.out.println(w.root(27, 2));
	}
}
