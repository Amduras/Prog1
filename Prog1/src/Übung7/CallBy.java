package Übung7;

public class CallBy {
	int[] a = {10,20,30};
	int[] b = {1,2,3,4,5}; 
	int n = 0;
	int m = 0;
	
	void swap(int x, int y) {
		++n;
		++m;
		int tmp = x;
		x = y;
		y = tmp;
	}
	
	public static void main(String[] args) {
		CallBy c = new CallBy();
		c.swap(c.a[c.n], c.b[c.m]);
		c.swap(c.a[c.n], c.b[c.n]);
		c.swap(c.a[c.n], c.n);
		
		System.out.print("a: ");
		for(int i = 0; i < c.a.length; ++i){
			System.out.print(c.a[i]+" ");
		}
		
		System.out.print("\nb: ");
		for(int i = 0; i < c.b.length; ++i){
			System.out.print(c.b[i]+" ");
		}
		System.out.println();
		
		System.out.println("n: "+c.n);
		System.out.println("m: "+c.m);
	}
}
