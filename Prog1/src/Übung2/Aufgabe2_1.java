package Übung2;

public class Aufgabe2_1 {
	
	public String year(int jahr) {
	if(jahr % 4 == 0 && (jahr%100!=0 || jahr%400 == 0)) {
		return jahr+" ist ein Schaltjahr";
	} else {
		return jahr+" ist kein Schaltjahr";
	}
}
	public static void main(String[] args) {
		Aufgabe2_1 a2 = new Aufgabe2_1();
		System.out.println(a2.year(1900));
	}
}
