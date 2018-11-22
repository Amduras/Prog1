package Übung4;

public class Teiler {
	
	public String ggt(int z1, int z2) {
		if(z1 < 0) {
			z1 *=-1;
		}
		
		if(z2 < 0) {
			z2 *= -1;
		}
		
		if (z1 > 0 && z2 > 0) {
			while (z2 != z1) {
				if (z1 > z2) {
					z1 -= z2;
				} else {
					z2 -= z1;
				}
			}
			return Integer.toString(z1);
		} else {
			return "Undefiniert"; 
		}
	}
	
	public String kgv(int z1, int z2) {
		if(z1 < 0 ) {
			z1 *= -1;
		}
		
		if(z2 < 0 ) {
			z2 *= -1;
		}
		
		if (z1 > 0 && z2 > 0) {
			int a = z1;
			int b = z2;
			while (a != b) {
				if (a < b) {
					a += z1;
				} else {
					b += z2;
				}
			}
			return Integer.toString(b);
		} else {
			return "Undefined";
		}
	}
	
	public static void main(String[] args) {
		Teiler t = new Teiler();
		System.out.println("Ergebnis GGT: "+t.ggt(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		System.out.println("Ergebnis KgV: "+t.kgv(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}
