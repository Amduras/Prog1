package Übung2;

public class Aufgabe2_4 {
	boolean a, b, c;
	
	Aufgabe2_4(){
		a = true;
		b = false;
		c = false;
	}
	
	public void doit() {
		if(a || b) {
			b = true;
		} else {
			c = true;
		}
		a = b && c;
		c = !a;
		System.out.println("a: "+a+"\nb: "+b+"\nc: "+c);
	}
	public static void main(String[] args) {
		Aufgabe2_4 a = new Aufgabe2_4();
		a.doit();
	}
}
