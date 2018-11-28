package Übung9;

public class Queens_Prob {
	
	private int[] queens(int n, boolean rand) {
		int[] q = new int[n];
		queens_helper(q, 0, rand);
		return q;
	}
	
	private boolean queens_helper(int[] qs, int col, boolean rand) {
		if(col == qs.length) {
			return true;
		}

		for( ;row < qs.length; ++row) {
			if(isSafe(qs, row, col)) {
				qs[col] = row;
				if(queens_helper(qs, col+1, rand)) {
					return true;
				}
			}
		}
	}
	return false;
}
	
	private boolean isSafe(int[] qs, int row, int col) {
		int up = row;
		int down = row;
		boolean isStillSafe = true;
		
		for(int i = col-1; i >=0 && isStillSafe; --i) {
			int r = qs[i];
			isStillSafe = r != row && r != ++up && r != --down;
		}
		return isStillSafe;
	}
	
	private void printIt(int[] qs, int n) {
		System.out.println("Lösung: ");
		for(int i: qs) {
			System.out.print((i+1)+" ");
		}
		System.out.println();
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(qs[i] == j) {
					System.out.print("|D|");
				} else {
					System.out.print("|_|");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Queens_Prob q = new Queens_Prob();
		int n = 8;
		boolean rand = true;
		if(n > 3) {
			int[] queens = q.queens(n, rand);
			q.printIt(queens, n);
		} else {
			System.out.println("Keine gueltige Loesung vorhanden.");
		}
	}
}
