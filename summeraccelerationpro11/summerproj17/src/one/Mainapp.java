package one;

public class Mainapp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Printnumber());
		Thread t2 =new Thread(new client());
		
		t1.start();
		
		t2.start();
		
		System.out.println("I am done");
	}


}
