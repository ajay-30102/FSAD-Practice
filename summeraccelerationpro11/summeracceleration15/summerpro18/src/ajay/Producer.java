package ajay;

public class Producer implements Runnable{
	private final buffer b;
	public Producer(buffer b) {
		this.b =b;
	}
	public void run() {
		int value =0;
		while(true) {
			b.Producer(value++);
		}
		
	}


}
