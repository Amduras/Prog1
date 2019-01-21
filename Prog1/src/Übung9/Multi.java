package Übung9;

public class Multi {
	
	private int mult_iter(int a, int b) {

		int erg=0;
		for(int i = 0; i < Math.abs(b); ++i) {
			erg = erg+a;
		}

		return b < 0 ? -erg : erg;
	}
	
	private int mult_rec(int a, int b) {
		if(b == 0) {
			return 0;
		} else if(b < 0) {
			return -a + mult_rec(a, b+1);
		} else {
			return a + mult_rec(a, b-1);
		}
	}
	
	public static void main(String[] args) {
		Multi mult = new Multi();
		int a = 3;
		int b = -2;
		int erg;
		erg = mult.mult_iter(a, b);
		System.out.println("Iterativ: "+erg);
		erg = mult.mult_rec(a, b);
		System.out.println("Rekursiv: "+erg);
	}
}
