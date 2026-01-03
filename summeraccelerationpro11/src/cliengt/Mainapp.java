package cliengt;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Mainapp {
	public static void main(String[] args) {
		try {
		abc();
		}
		catch(FileNotFoundException ffe) {
			System.out.println("File could not found" );
			
		}

		catch(ArithmeticException ae) {
			System.out.println("Connot divided by Zero" );
			
		}
		finally {
			System.out.println("Line 21 is Excuted");
		}
		
	}
	public static void abc() throws FileNotFoundException,ArithmeticException {
		int x = 1001;
		File inf = new File("Sample.txt");
		Scanner sc;
		int y,result;
		try {
			sc = new Scanner(inf);
			
			while(sc.hasNextInt()) {
			y = sc.nextInt();
			result = x/y;
			System.out.println("Result ="+result);
			}
		}
		catch(FileNotFoundException ffe) {
			System.out.println("File sample.csv is not found" );
			
		}
		catch(ArithmeticException ae) {
			x++;
		}
		System.out.println("x value:"+x);
		
	}

}
