package package2;
import package1.TwoDshape;

public class Triangle extends TwoDshape{
	private double s2,s3;
	public void setS2S3(double s2,double s3) {
		if(s2>0 && s3>0) {
			if(s2+s3<=this.s1 | s2+this.s1<=s3 || s3+this.s1<=s2) {
				this.s2 = this.s3  = 0;
			}
			else {
				this.s2=s2;
				this.s3=s3;
			}
		}
		else this.s2=this.s3;
	}
	
	private Triangle() {
		super(0);
	}
	
	public Triangle(double s1,double s2,double s3) {
		super(s1);
		this.setS2S3(s2,s3);
	}
	public double calcperi() {
		return s1+s2+s3;
	}
	public calcArea() {
		double sp = this.calcperi()/2;
		return Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
	}
	public String getName() {
		return (s1==s2 && s2==s3?"Equilateral")
	}

}
