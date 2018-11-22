package Übung1;

public class Aufgabe1_1 {
	int[] zahlen = new int[5];
	int min;
	int max = 0;
	int avg = 0;
	int sum = 0;
	
	void min() {
		
		for(int i = 0; i < zahlen.length; ++i) {
			if(i == 0) {
				min = zahlen[i];
			}
			if(zahlen[i] < min) {
				min = zahlen[i];
			}
		}
	}
	
	void max() {
		for(int i = 0; i < zahlen.length; ++i) {
			if(zahlen[i] > max) {
				max = zahlen[i];
			}
		}
	}
	
	void avg() {
		for(int i = 0; i < zahlen.length; ++i) {
			avg += zahlen[i];
		}
		avg /= zahlen.length;
	}
	
	void sum() {
		for(int i = 0; i < zahlen.length; ++i) {
			sum += zahlen[i];
		}
	}
	
	public static void main(String[] args) {
		
		Aufgabe1_1 a1 = new Aufgabe1_1();
		a1.zahlen[0] = 5;
		a1.zahlen[1] = 4;
		a1.zahlen[2] = 3;
		a1.zahlen[3] = 2;
		a1.zahlen[4] = 1;
		a1.min();
		a1.max();
		a1.avg();
		a1.sum();
		System.out.println(a1.min);
		System.out.println(a1.max);
		System.out.println(a1.avg);
		System.out.println(a1.sum);
	}
}
