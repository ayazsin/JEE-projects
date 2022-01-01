package model;

public class Model1 {
	
	private int p1;
	private int p2;
	private int sum;
	public Model1(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
		setSum();
	}
	public int getP1() {
		return p1;
	}
	public void setP1(int p1) {
		this.p1 = p1;
	}
	public int getP2() {
		return p2;
	}
	public void setP2(int p2) {
		this.p2 = p2;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = p1 + p2;
	}
	@Override
	public String toString() {
		return "Model1 [p1=" + p1 + ", p2=" + p2 + ", sum=" + sum + "]";
	}
	
	
	
	

}
