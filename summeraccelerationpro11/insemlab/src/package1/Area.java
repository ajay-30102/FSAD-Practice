package package1;
import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int radius = sc.nextInt();
        double area = (double)22 / 7 * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

}
