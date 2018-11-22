package Übung8;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Sorts {
	double[] check;
	int amountZahlen;
	
	Sorts(int amountZahlen){
		this.amountZahlen = amountZahlen;
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
		
		if(checkSorted(arr)) {
			printIt(arr);
		} else {
			System.out.println("Sortieren fehlgeschlagen");
		}
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
		
		if(checkSorted(arr)) {
			printIt(arr);
		} else {
			System.out.println("Sortieren fehlgeschlagen");
		}
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
				if(checkSorted(arr)) {
					printIt(arr);
				} else {
					System.out.println("Sortieren fehlgeschlagen");
				}
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
		check = arr;
		return arr;
	}
	
	private boolean checkSorted(double[] arr) {
		boolean sorted = true;
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i] != check[i]) {
				sorted = false;
			}
		}
		return sorted;
	}
	
	private void printIt(double[] arr) {
		DecimalFormat formatter = new DecimalFormat("#.##");
		for(double i : arr) {
			System.out.print(formatter.format(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int amountZahlen = 100;
		int seed = 42;
		double[] arr = new double[amountZahlen];
		Sorts sorts = new Sorts(amountZahlen); 
		
		arr = sorts.genNumbers(arr, seed);
		Arrays.parallelSort(sorts.check);
		
		System.out.println("Insertionsort");
		sorts.insertion_sort(arr);
		
		arr = sorts.genNumbers(arr, seed);
		System.out.println("\nSelectionsort");
		sorts.selection_sort(arr);
		
		arr = sorts.genNumbers(arr, seed);
		System.out.println("\nBubblesort");
		sorts.bubble_sort(arr);
	}
}
