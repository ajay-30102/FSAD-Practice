package ajay;
import java.util.Queue;
import java.util.LinkedList;


public class buffer {
	private final Queue<Integer> b;
	private final int maxSize;
	
	public buffer(int mSize) {
		b = new LinkedList<Integer>();
		maxSize = mSize;
	}
	public synchronized void produce  (int e) throws InterruptedException {
		while(b.size()==maxSize) {
			System.out.println("Buffer is full");
			wait();
		}
		b.add(e);
		System.out.println("Produced : "+e);
		notify();
	}
	public synchronized int consume() throws InterruptedException {
		while(b.size()==0) {
			System.out.println("Buffer is Empty");
			wait();
		}
		int e=b.poll();
		System.out.println("Consumed : "+e);
		notify();
		return e;
		
	}

}
