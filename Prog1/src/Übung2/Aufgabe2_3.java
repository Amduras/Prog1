package �bung2;

public class Aufgabe2_3 {
	
	void rule1(boolean a, boolean b) {
		boolean c = !(a&&b);
		boolean d = !a||!b;
		System.out.println("a: "+a+" b: "+b);
		if(c == d) {
			System.out.println("Regel erf�llt.");
		} else {
			System.out.println("Regel nicht erf�llt");
		}
	}
	
	void rule2(boolean a, boolean b) {
		boolean c = !(a || b);
		boolean d  = !a && !b;
		System.out.println("a: "+a+" b: "+b);
		if(c == d) {
			System.out.println("Regel erf�llt.");
		} else {
			System.out.println("Regel nicht erf�llt");
		}
	}
	
	public static void main(String[] args) {
		Aufgabe2_3 c = new Aufgabe2_3();
		System.out.println("1. Regel:");
		c.rule1(true, true);
		System.out.println("2. Regel:");
		c.rule2(true, true);
	}
}
