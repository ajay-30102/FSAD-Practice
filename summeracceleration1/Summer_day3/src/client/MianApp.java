package client;
import bank.IntrestCaluculator;
import java.util.Scanner;
public class MianApp {
	public static void main(String[] args) {
		System.out.println("Principle amount between 200000 && 500000");
		Scanner sc = new Scanner(System.in);
		
		IntrestCaluculator
		IntrestCaluculator.setPrinciple(200000);
		IntrestCaluculator.setYears(5.5);
		IntrestCaluculator.setROI(6);
		double intrest = IntrestCaluculator .calcIntrest("Simple");
		System.out.printf("Simple Intrest = Rs.%.2f%n",intrest);
	}
}
