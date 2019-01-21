package rational;

public class Sort {

	
	public Sort() {
		
	}
	
	public void insertion(Rational field[]) {
		for(int i = 1; i < field.length; ++i) {
			final Rational IVAL = field[i];
			int j = i;
			while(j > 0 && field[j-1].less(IVAL)) {
				field[j] = field[j-1];
				--j;
			}
			field[j] = IVAL;
		}
	}
	
	public void selection(Rational field[]) {
		for(int i = 0; i < field.length; ++i) {
			int min = i;
			for(int j = i; j < field.length; ++j) {
				if(field[min].less(field[j])) {
					min = j;
				}
			}
			swap(field, min, i);
		}
	}
	
	
	public void bubble(Rational field[]) {
		for(int i = 1; i < field.length; ++i) {
			boolean swaped = false;
			for(int j = 0; j < field.length-1; ++j) {
				if(field[j].less(field[j+1])) {
					swap(field, j, j+1);
					swaped = true;
				}
			}
			if(!swaped) {
				return;
			}
		}
	}
	
	private void swap(Rational[] field, int min, int i) {
		Rational tmp = field[min];
		field[min] = field[i];
		field[i] = tmp;
	}
}
