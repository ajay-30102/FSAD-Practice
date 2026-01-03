package ajay;

public class Mainapp {
	public static void main(String[] args) {
		buffer b = new buffer(3);
		Thread pt = new Thread(new Producer(b));
		Thread c =new Thread(new consume(b));
		c.start();
		pt.start();
	}

}
