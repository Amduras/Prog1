package Übung8;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Sorts {
	
	Sorts(){
	}
	
	private void insertion_sort(double[] arr) {
		for(int i = 1; i < arr.length; ++i) {
			final double IVAL = arr[i];
			int j = i;
			while(j > 0 && arr[j -1] > IVAL) {
				arr[j] = arr[j - 1];
				--j;
			}
			arr[j] = IVAL;
		}
		System.out.println("Done.");
	}
	
	private void selection_sort(double[] arr) {
		for(int i = 0; i < arr.length - 1; ++i) {
			int min = i;
			for(int j = i+1; j < arr.length; ++j) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
		System.out.println("Done.");
	}
	
	private void bubble_sort(double[] arr) {
		for(int i = 1; i < arr.length; ++i) {
			boolean bAtLeastOneSwap = false;
			for(int j = 0; j < arr.length - i; ++j) {
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j+1);
					bAtLeastOneSwap = true;
				}
			}
			if(!bAtLeastOneSwap) {
				System.out.println("Done.");
				return;
			}
		}
	}
	
	private void swap(double[] arr, int pos1, int pos2) {
		double tmp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = tmp;
	}
	
	private double[] genNumbers(double[] arr, int seed) {
		Random rnd = new Random(seed);
		for(int i = 0; i < arr.length; ++i) {
			arr[i] = rnd.nextDouble()*10;
		}
		return arr;
	}
	
	private void checkSorted(double[] arr, double[] check) {
		boolean sorted = true;
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != check[i]) {
				sorted = false;
			}
		}
		
		if(sorted) {
			System.out.println("Alle Zahlen sortiert");
		} else {
			System.out.println("Sortieren fehlgeschlagen");
		}
	}
	
	private void printIt(double[] arr) {
		DecimalFormat formatter = new DecimalFormat("#.##");
		for(double i : arr) {
			System.out.print(formatter.format(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		long start;
		long stop;
		int amountZahlenInsert = 10000000;
		int amountZahlenSelect = 200000;
		int amountZahlenBubble = 10000000;
		int seed = 42;
		Sorts sorts = new Sorts(); 
		
		double[] arr = new double[amountZahlenInsert];
		double[] check = new double[amountZahlenInsert];
		
		System.out.println("Insertionsort");
		arr = sorts.genNumbers(arr, seed);
		check = arr;
		Arrays.parallelSort(check);
		start = System.nanoTime();
		sorts.insertion_sort(arr);
		stop = System.nanoTime();
		sorts.checkSorted(arr, check);
		System.out.println("Zeit: "+((stop-start)/1000000)+"ms für "+amountZahlenInsert+" Zahlen");
		
		System.out.println("\nSelectionsort");
		arr = new double[amountZahlenSelect];
		check = new double[amountZahlenSelect];
		arr = sorts.genNumbers(arr, seed);
		check = arr;
		Arrays.parallelSort(check);
		start = System.nanoTime();
		sorts.selection_sort(arr);
		stop = System.nanoTime();
		sorts.checkSorted(arr, check);
		System.out.println("Zeit: "+((stop-start)/1000000000)+"s für "+amountZahlenSelect+" Zahlen");
		
		System.out.println("\nBubblesort");
		arr = new double[amountZahlenBubble];
		check = new double[amountZahlenBubble];
		arr = sorts.genNumbers(arr, seed);
		check = arr;
		Arrays.parallelSort(check);
		start = System.nanoTime();
		sorts.bubble_sort(arr);
		stop = System.nanoTime();
		sorts.checkSorted(arr, check);
		System.out.println("Zeit: "+((stop-start)/1000000)+"ms für "+amountZahlenBubble+" Zahlen");
	}
}
