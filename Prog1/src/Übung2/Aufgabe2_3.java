package Übung2;

public class Aufgabe2_3 {
	
	void rule1(boolean a, boolean b) {
		boolean c = !(a&&b);
		boolean d = !a||!b;
		System.out.println("a: "+a+" b: "+b);
		if(c == d) {
			System.out.println("Regel erfüllt.");
		} else {
			System.out.println("Regel nicht erfüllt");
		}
	}
	
	void rule2(boolean a, boolean b) {
		boolean c = !(a || b);
		boolean d  = !a && !b;
		System.out.println("a: "+a+" b: "+b);
		if(c == d) {
			System.out.println("Regel erfüllt.");
		} else {
			System.out.println("Regel nicht erfüllt");
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
