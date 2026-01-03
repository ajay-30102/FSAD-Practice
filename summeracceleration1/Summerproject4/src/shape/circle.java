package shape;

public class circle {
	private double rad;
	private point cc;
	
//methods
	public void setRadius(double r) {
		this.rad = (r>0 && r<=10)?r:0;
	}
	
	public void setCentre(point p) {
		this.cc=p;
	}
	
	public point getCentreofCircle() {
		return this.cc;	
	}
	
	private circle() {
		this.cc = new point(0,0);
		this.rad = 0;
	}
	public double getRadius() {
	    return this.rad;
	}
	
	public circle(double r,double x,double y) {
		this();
		this.setRadius(r);
		this.setCentre(new Point(x,y));
	}
	
	public double distanceCircle(circle c) {
		double sr = this.rad +c.getRadius();
		double dr = Math.abs(this.rad - c.getRadius());
		double dc = this.cc.distancePoint(c.getCentreofCircle());
		if(dc>sr) return dc-sr;
		if(dc<sr) return dr-dc;
	}
	
	
}
