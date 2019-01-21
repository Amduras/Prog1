package rational;

class Rational implements Number{
	private int zaehler;
	private int nenner;
	
	public Rational(int zaehler, int nenner) {
		int[] tmp = reduce(zaehler, nenner);
		this.zaehler = tmp[0];
		if(tmp[1] != 0) {
			this.nenner = tmp[1];
		} else {
			throw new MyException("Nenner ist 0");
		}
	}
	
	private int ggt(int z1, int z2) {
		if(z2 == 0) {
			return z1;
		} else {
			return ggt(z2, z1%z2);
		}
	}

	public Rational sub(Rational a) {
		int zaehler = (this.zaehler * a.getNenner()) - (a.getZaehler() * this.nenner);
		int nenner = (this.nenner * a.getNenner());
		return new Rational(zaehler, nenner);
	}

	public Rational add(Rational a) {
		int zaehler = (this.zaehler * a.getNenner()) + (a.getZaehler() * this.nenner);
		int nenner = (this.nenner * a.getNenner());
		return new Rational(zaehler, nenner);
	}
	
	public Rational multi(Rational a) {
		int zaehler = (this.zaehler * a.getZaehler());
		int nenner = (this.nenner * a.getNenner());
		return new Rational(zaehler, nenner);
	}
	
	public Rational div(Rational a) {
		int zaehler = a.getNenner();
		int nenner = a.getZaehler();
		Rational tmp = new Rational(zaehler, nenner);
		tmp = multi(tmp);
		return tmp;
	}
	
	public int[] reduce(int a, int b) {
		int[] tmp = {0,0};
		boolean negA = a < 0;
		boolean negB = b < 0;
		int ggt = ggt(negA ? -a : a, negB ? -b : b);
		if(ggt != 0) {
			tmp[0] = a / ggt;
			tmp[1] = b/ ggt;
			if(negB) {
				tmp[0] = -a;
				tmp[1] = -b;
			}
			return tmp;
		} else {
			return tmp;
		}
	}
	
	@Override
	public String toString() {
		return zaehler+"/"+nenner; 
	}
	
	boolean less(Rational r) {
		return nenner*r.zaehler < r.nenner*zaehler;
	}
	
	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}