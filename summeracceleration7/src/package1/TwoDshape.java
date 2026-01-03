package package1;

public abstract class TwoDshape {
	//members
	protected double s1;
	//methods
	protected void setS1(double s1) {
		this.s1 = (s1>0 && s1<=100)?s1:0;
	}
	protected double getS1() {
		return this.s1;
	}
	public abstract double calcArea();
	public abstract double calcPeri();
	
	private TwoDshape() {
		this.s1=0;
	}
	protected TwoDshape(double s1) {
		
		this.setS1(s1);
	}
	protected String getName() {
		return "TwoDshape";
	}
	public final void printSummary() {
		System.out.printf(getName(), null)
	}
}
