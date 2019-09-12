package lab.lab1;

import java.util.Scanner;

/**
 * @author KIRAN
 *
 */

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class Custom_Exception {
	public static void main(String[] args) {
		int age;
		boolean voter = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();
		try {
			if (age < 18)
				throw new MyException("under age exception");
			else {
				voter = true;
				System.out.println("You have voting rights");
			}
		} catch (MyException ex) {
			System.out.println(ex.fillInStackTrace());
		}

	}

}
