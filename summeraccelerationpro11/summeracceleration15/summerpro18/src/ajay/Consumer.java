package ajay;

public class Consumer implements Runnable {
	private final buffer b;
	public Consumer(buffer b) {
		this.b=b;
	}
	public void run() {
		try{
			while(true) {
		
			b.consume();
			Thread.sleep(1500);
			
		}
		}
		catch(InterruptedException ie) {
		
	}
}


}
