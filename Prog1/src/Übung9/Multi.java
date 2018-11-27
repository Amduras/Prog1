package Übung9;

public class Multi {
	
	private int mult_iter(int a, int b) {
		if(b == 0) {
			return 0;
		} else if( b == 1) {
			return a;
		} else {
			int erg=0;
			for(int i = 0; i < Math.abs(b); ++i) {
				erg = erg+a;
			}
			if(b < 0) {
				erg*=-1;
			}
			return erg;
		}
	}
	
	private int mult_rec(int a, int b) {
		if(b == 0 || a == 0) {
			return 0;
		} else if(b == 1) {
			return a;
		} else {
			if(b < 0) {
				return -a + mult_rec(b+1, a);
			} else {
				return a + mult_rec(b-1, a);
			}
		}
	}
	
	public static void main(String[] args) {
		int  a = 3;
		int b = -2;
		int erg;
		Multi mult = new Multi();
		erg = mult.mult_iter(a, b);
		System.out.println("Iterativ: "+erg);
		erg = mult.mult_rec(a, b);
		System.out.println("Rekursiv: "+erg);
	}
}
