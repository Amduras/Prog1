package Übung9;

public class Queens_Prob {
	
	private int[] queens(int n, boolean rand) {
		int[] q = new int[n];
		boolean done = queens_helper(q, 0, rand);
		if(done) {
			return q;
		} else {
			return null;
		}
	}
	
	private boolean queens_helper(int[] qs, int col, boolean rand) {
		if(col == qs.length) {
			return true;
		}

		for(int row = 0 ;row < qs.length; ++row) {
			if(isSafe(qs, row, col)) {
				if(rand) {
					qs[0] = (int) (Math.random()*qs.length);
				} else {
					qs[col] = row;
				}
				if(queens_helper(qs, col+1, false)) {
					return true;
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
			isStillSafe = qs[i] != row && qs[i] != ++up && qs[i] != --down;
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
		int[] queens = q.queens(n, rand);
		if(queens != null) {
			q.printIt(queens, n);
		} else {
			System.out.println("Keine gueltige Loesung gefunden.");
		}
	}
}
