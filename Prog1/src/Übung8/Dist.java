package Übung8;

import java.util.Random;

public class Dist {
	
	private int[] distribution_counting(int[] field, int m) {
		int[] count = new int[m * 2 + 1];
		
		for(int i = 0; i < field.length; ++i) {
			++count[field[i] + m];
		}
		
		int i = 0, j = count.length - 1;
		while(i < field.length) {
			if(count[j] > 0) {
				--count[j];
				field[i] = j-m;
				++i;
			} else {
				--j;
			}
		}
		
		return field;
	}
	
	private int[] genNumbers(int[] arr, int seed) {
		Random rnd = new Random(seed);
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = rnd.nextInt()/1000000;
		}
		return arr;
	}
	
	private void printIt(int[] field) {
		for(int i : field) {
			System.out.print(i+" ");
		}
	}
	
	private int getMax(int[] field) {
		int max = field[0];
		for(int i: field) {
			max = Math.max(Math.abs(max), Math.abs(i));
		}
		return max;
	}

	public static void main(String[] args) {
		Dist dis = new Dist();
		int seed = 42;
		int[] field = new int[10];
		
		dis.genNumbers(field, seed);
		System.out.println("Vor dem Sortieren");
		dis.printIt(field);
		int m = dis.getMax(field);
		dis.distribution_counting(field, m);
		System.out.println("\nNach dem Sortieren");
		dis.printIt(field);
	}
}
