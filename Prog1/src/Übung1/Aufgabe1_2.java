package Übung1;

public class Aufgabe1_2 {
	
	public void sum() {
		int n = 6;
		int erg = 0;
		int i = 0;
		while(i < n) {
			erg += i;
			++i;
			System.out.println(i+". Zwischensumme: "+erg);
		}
		System.out.println("Ergebnis: "+erg);
	}
	
	public void prod() {
		int n = 10;
		int erg = 1;
		int i = 1;
		while(i <= n) {
			erg *= i;
			System.out.println(i+". Zwischensumme: "+erg);
			++i;
		}
		System.out.println("Ergebnis: "+erg);
	}
	
	public static void main(String[] args) {
		Aufgabe1_2 a2 = new Aufgabe1_2();
		a2.sum();
		a2.prod();
	}
}
