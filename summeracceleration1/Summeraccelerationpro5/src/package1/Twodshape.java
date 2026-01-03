package package1;

public class Twodshape {
	public double d1;
	
	public void setD1(double d1) {
		this.d1=(d1>0 && d1<=100)?d1:-0;
	}
	public double getD1() {
		return this.d1;
	}
	public String getName() {
		return "Line";
	}
	
	protected Twodshape() {
		this.d1=0;
	}
	public Twodshape(double d1) {
		this();
		this.setD1(d1);
		
	}
	public double calcArea() {
		return 0;
	}
	public double calcperi() {
		return this.d1;
	}
	public void printDetails() {
		System.out.printf("Name of the shape: %S%n",this.getName());
		System.out.printf("Area:%2fsq.m%n",this.calcArea());
		System.out.printf("Perimeter:%2fm%n",this.calcperi());
	}
	 

}
