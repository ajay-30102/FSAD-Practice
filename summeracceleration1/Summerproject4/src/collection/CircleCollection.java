package collection;

public class CircleCollection {
	private int count;
	private Circle[] cCol;
	private static final int MAX_SIZE=5;
	
	public CircleCollection() {
		this.count = 0;
		cCol = new Circle[MAX_SIZE];	
	}
	
	public boolean addCircle(Cirle c) {
		if(c.getRadius() <=0 || this.count>=MAX_SIZE) return false;
		this.cCol[this.count++]=c; return true;
	}
	public Circle getDShortest(Circle c) {
		if()
	}

}
