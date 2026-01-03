package shape;

public class point {
	private  double x,y;
	public void  setX(double x) {
		this.x=(x>=0 & x<=100)?x:0;
	}
	public void setY(double y) {
		this.y = (y>=0 && y<=100)?y:0;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	private point() {
		this.x=this.y=0;
	}
	
	public point(double x,double y) {
		this();
		this.setX(x);
		this.setY(y);
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(this.x*this.x+Math.pow(this.y, 2));
	}
	
	public double distancePoint(point p) {
		double dx = this.x-p.getX();
		double dy = this.y-p.getY();
		return Math.sqrt(Math.pow(dx,2)+Math.pow(dy, 2));
	}
	public void printpoint() {
		System.out.printf("X:% 1.f,y:%1.f)",this.x,this.y);
	}

}
