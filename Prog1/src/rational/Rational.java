package rational;

public class Rational {
	int[] zahl1;
	int[] zahl2;
	
	public Rational(int z1 , int n1, int z2, int n2) {
		zahl1 = new int[2];
		zahl2 = new int[2];
		zahl1[0] = z1;
		zahl1[1] = n1;
		zahl2[0] = z2;
		zahl2[1] = n2;
	}
	
	private int ggt(int z1, int z2) {
		if(z2 == 0) {
			return z1;
		} else {
			return ggt(z2, z1%z2);
		}
	}
	
	private int kgv(int z1, int z2) {
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
			return b;
		} else {
			return 0;
		}
	}
	
	private int[] add(int[] a, int[] b) {
		int[] tmp = new int[a.length];
		tmp[0] = (a[0] * b[1]) + (b[0] * a[1]);
		tmp[1] = a[1] * b[1];
		return tmp;
	}
	
	private int[] sub(int[] a, int[] b) {
		int[] tmp = new int[a.length];
		int[] multiA = new int[a.length];
		int[] multiB = new int[b.length];
		multiA[0] = a
		return tmp;
	}
	
	private int[] multi(int[] a, int b[]) {
		int[] tmp = new int[a.length];
		for(int i = 0; i < a.length; ++i) {
			tmp[i] = a[i] * b[i];
		}
		
		return tmp;
	}
	
	private int[] div(int[] a, int[] b) {
		int[] tmp = new int[a.length];
		
		return tmp;
	}
	
	private String reduce(int[] bruch) {
		int ggt = ggt(bruch[0], bruch[1]);
		if(ggt != 0) {
			bruch[0] /= ggt;
			bruch[1] /= ggt;
			return bruch[0]+"/"+bruch[1];
		} else {
			return "Undefined";
		}
	}
	
	public static void main(String[] args) {
//		args[0] = zaehler1;
//		args[1] = nenner1;
//		args[2] = zaehler2;
//		args[3] = nenner2;
		Rational ratio = new Rational(Integer.parseInt(args[0]), 
				Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		int[] add = ratio.add(ratio.zahl1, ratio.zahl2);
		int[] sub = ratio.sub(ratio.zahl1, ratio.zahl2);
		int[] multi = ratio.multi(ratio.zahl1, ratio.zahl2);
		int[] div = ratio.div(ratio.zahl1, ratio.zahl2);
		System.out.println("Zahl1: "+args[0]+"/"+args[1]+" = "+ratio.reduce(ratio.zahl1));
		System.out.println("Zahl2: "+args[2]+"/"+args[3]+" = "+ratio.reduce(ratio.zahl2));
		System.out.println("Add: "+add[0]+"/"+add[1]+" = "+ratio.reduce(add));
		System.out.println("Sub: "+sub[0]+"/"+sub[1]+" = "+ratio.reduce(sub));
		System.out.println("Multi: "+multi[0]+"/"+multi[1]+" = "+ratio.reduce(multi));
		System.out.println("Div: "+div[0]+"/"+div[1]+" = "+ratio.reduce(div));
		
	}
}
