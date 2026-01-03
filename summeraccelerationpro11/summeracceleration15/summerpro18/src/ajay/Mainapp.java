package ajay;

public class Mainapp {
	public static void main(String[] args) {
		buffer b =new buffer(3);
		Thread p = new Thread(new Producer(b));
		Thread c =new Thread(new Consumer(b));
		c.start();
		p.start();
		
		
	}
	


}
