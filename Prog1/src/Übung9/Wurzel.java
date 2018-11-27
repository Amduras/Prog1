package Übung9;

import java.text.DecimalFormat;

public class Wurzel {
	
	private double sqRoot(double uG, double oG, int counter) {
		
		double tmp = oG/2;
		
		if(counter < 20) {
			if(tmp * 2 < uG) {
				return sqRoot(tmp, oG, counter+1);
			} else{
				return sqRoot(uG, tmp, counter+1);
			}
		} else {
			return tmp;
		}
		
//		if(counter < 100) {
//			
//			if(tmp * 2 > oG) {
//				sqRoot(uG, tmp, counter+1);
//			} else if(tmp * 2 < uG) {
//				sqRoot(tmp, oG, counter+1);
//			}
//		} else {
//			return tmp;
//		}
	}
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Wurzel w = new Wurzel();
		int number = (int) (Math.random()*100);
		System.out.println(number);
		double uG = 1;
		double oG = number;
		int counter = 0;
		double root = w.sqRoot(uG, oG, counter);
		System.out.println(Math.sqrt(number));
		System.out.println("Wurzel von: "+number+ " ist: "+df.format(root));
	}
}
