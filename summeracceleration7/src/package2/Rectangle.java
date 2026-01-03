package package2;
import package1.TwoDshape;
public class Rectangle extends TwoDshape {
	private double s2;
	private Rectangle() {
		super(0);
	}
	public Rectangle(double s1,double s2) {
		super(s1);
		this.setS2(s2);
	}
	private void setS2(double s2) {
		this.s2 = (s2>0 && s2<=100)?s1:0;
	}
	public void setS1(double s1) {
		super.setS1(s1);
	}
	public double calcArea() {
		return this.s1*this.s2;
	}
	public double calcperi() {
		return 2*(this.s1+this.s2);
	}
	protected String getName() {
		return (this.s1==this.s2)?"Square":"Rectangle";
	}
	

}
