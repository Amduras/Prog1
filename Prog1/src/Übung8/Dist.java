package Übung8;

public class Dist {
	Dist(){
		
	}
	
	private void distribution_counting(int[] field, int m) {
		int[] count = new int[m];
		for(int i = 0; i < field.length; ++i) {
			++count[field[i]];
		}
		for(int i = 0, j = 0; i < count.length; ++i) {
			for(int k = 0; k < count[i]; ++k) {
				field[j++] = i;
			}
		}
	}
	
	public static void main(String[] args) {
		Dist dis = new Dist();
		int[] field = new int[80];
		int m = 8;
		dis.distribution_counting(field, m);
	}
}
