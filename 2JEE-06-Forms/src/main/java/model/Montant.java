package model;

public class Montant {
	
	private double dollar;
	private double euro;
	

	public double getDollar() {
		return dollar;
	}

	public void setDollar(double euro) {
		this.dollar = euro * RateEnum.RATE.d;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double dollar) {
		this.euro = dollar / RateEnum.RATE.d;
	}

	@Override
	public String toString() {
		return "Montant [dollar=" + dollar + ", euro=" + euro + "]";
	}
	
	
	
	

}
