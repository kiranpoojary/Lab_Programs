package lab.lab1;

import java.util.Scanner;

/**
 * @author KIRAN
 *
 */
public class Compound_Interest {
	public static void main(String[] args) {
		double principle, rate , time ;
		int n; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		principle=sc.nextDouble();
		System.out.println("Enter rate");
		rate=sc.nextDouble();
		System.out.println("Enter Time");
		time=sc.nextDouble();
		 
        /* Calculate compound interest */
        double CI = principle * (Math.pow((1 + rate / 100), time)); 
          
        System.out.printf("Compound Interest is %.2f",( CI-principle));
	
	}

}