package rational;

import java.util.Random;

public class Ratio {
	
	//compare funktion: beide auf den gleichen nenner bringen
	
	public static Rational[] genField(int maxL, int maxZ, int maxN) {
		Random length = new Random();
		int fLength = length.nextInt(maxL)+2;
		Rational[] tmp = new Rational[fLength];
		
		Random zaehler = new Random();
		Random nenner = new Random();
		
		for(int i = 0; i < tmp.length; ++i) {
			tmp[i] = new Rational(zaehler.nextInt(maxZ), nenner.nextInt(maxN));
		}
		
		return tmp;
	}

	public static void printField(Rational[] field) {
		for(Rational i: field) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Rational[] rField = genField(10, 100, 100);
		Rational[] sortField = new Rational[rField.length];
		Sort s = new Sort();
		
		System.out.println("Vor dem Sortieren:\t( "+rField.length+" Elemente zu sortieren )");
		printField(rField);
		
		System.arraycopy(rField, 0, sortField, 0, rField.length);
		System.out.println("Bubblesort:");
		s.bubble(sortField);
		printField(sortField);
		
		System.arraycopy(rField, 0, sortField, 0, rField.length);
		System.out.println("Insertion:");
		s.insertion(sortField);
		printField(sortField);
		
		System.arraycopy(rField, 0, sortField, 0, rField.length);
		System.out.println("Selection:");
		s.selection(sortField);
		printField(sortField);
	}
}