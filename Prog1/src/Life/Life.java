package Life;

public class Life {
	boolean[][] life;
	boolean[][] newLife;

	Life(int zeilen, int spalten) {
		life = new boolean[zeilen][spalten];
		newLife = new boolean[zeilen][spalten];
	}

	public void init() {
		for (int i = 0; i < life.length; ++i) {
			for (int j = 0; j < life[i].length; ++j) {
				life[i][j] = Math.random() < 0.5;
			}
		}
	}

	public void printIt(boolean[][] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j] ? "X" : "_");
			}
			System.out.println();
		}
	}
	
	int[][] findCells(int[][] tgrid, int n){
		int ind = (tgrid.length*tgrid[0].length);
		return findCellsHelper(tgrid, n,0, ind-1);
	}
	
	int[][] findCellsHelper(int[][] tgrid, int n, int idx, int ind){
		if(ind >= 0) {
			int x = ind/tgrid[0].length;
			int y = ind%tgrid[0].length;
			if(tgrid[x][y] == n) {
				++idx;
			}
			int[][] cgrid = findCellsHelper(tgrid, n, idx, ind-1);
			if(tgrid[x][y] == n) {
				cgrid[idx-1][0] = x;
				cgrid[idx-1][1] = y;
			}
			return cgrid;
		} else {
			return new int[idx][2];
		}
	}
	
	private void makeNew() {
		for(int i = 0; i < life.length; ++i) {
			for(int j = 0; j < life[i].length; ++j) {
				int tField = 0;
				for(int x = (i-1); x <= (i+1); ++x) {
					for(int y = (j-1); y <= (j+1); ++y) {
						int a = (x + life.length) % life.length;
						int b = (y + life[i].length) % life[i].length;
						if(!(x == 0 && y  == 0) && life[a][b]) {
							++tField;
						}
					}
				}
				newLife[i][j] = tField == 3 || (life[i][j] && tField == 2);
			}
		}
		life = newLife;
	}

	public static void main(String[] args) {
		Life l = new Life(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		l.init();
		for(int i = 0; i < 5; ++i){
			System.out.println((i+1)+". Transformation:");
			l.printIt(l.life);
			l.makeNew();
			System.out.println();
			l.printIt(l.life);
			System.out.println();
		}
	}
}
