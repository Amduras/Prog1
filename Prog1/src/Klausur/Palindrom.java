package Klausur;

public class Palindrom {
	
	private String isPalinWord(String s, boolean ignoreCase) {
		boolean palin = true;
		int i = 0;
		if(ignoreCase) {
			s = s.toLowerCase();
		}
		while(palin && i < (s.length()/2)) {
			if(s.charAt(i) != s.charAt((s.length()-1) - i)) {
				palin = false;
			}
			++i;
		}
		
		if(palin) {
			return s+" ist ein Palindrom";
		} else {
			return s+" ist kein Palindrom";
		}
	}
	
	private String isPalinNumber(int n, int end) {
		boolean palin = true;
		int i = 0;
		while(palin && i < end/2) {
			if(((n >>> i) & 1) != ((n >>> (end-1)-i) & 1)) {
				palin = false;
			}
			++i;
		}
		if(palin) {
			return n+" ist ein Palindrom";
		} else {
			return n+" ist kein Palindrom";
		}
	}
	
	private String isPalinArray(char[] field) {
		boolean palin = true;
		int i = 0;
		int length = field.length-1;
		while(palin && i < field.length / 2) {
			if(field[i] != field[(length - i)]) {
				palin = false;
			}
			++i;
		}
		for(char c: field) {
			System.out.print(c);
		}
		if(palin) {
			return " ist ein Palindrom";
		} else {
			return " ist kein Palindrom";
		}
	}
	
	public static void main(String[] args) {
		String word = "Otto";
		int number = 2;
		String test = Integer.toBinaryString(number);
		char[] ding = {'o','t','t','o'};
		Palindrom p = new Palindrom();
		System.out.println(p.isPalinWord(word,true));
		System.out.println(p.isPalinArray(ding));
		System.out.println(p.isPalinNumber(number, test.length()));
		System.out.println(p.isPalinWord(test, true));
		//Weißte was: Nein! Fick dich! Wandel dir die scheiß zahl in nen binärstring um un benutz die 
		//isPalinWord-funktion du sohn deiner mutter!
		
	}
}
