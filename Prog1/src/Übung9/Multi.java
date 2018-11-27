package Übung9;

public class Multi {
	
	private int multi_iter(int a, int b) {
		int erg=0;
		
		return erg;
	}
	
	private int multi_rec(int a, int b) {
		int erg = 0;
		
		return erg;
	}
	
	public static void main(String[] args) {
		int  a = 5;
		int b = 10;
		int erg;
		Multi mult = new Multi();
		erg = multi_iter(a,b);
		System.out.println("Iterativ: "+erg);
		erg = multi_rec(a,b);
		System.out.println("Rekursiv: "+erg);
	}
}
