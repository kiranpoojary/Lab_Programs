/**
 * 
 */
package lab.lab1;
import java.util.*;

/**
 * @author KIRAN
 *
 */
public class Swap_Two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=sc.nextInt();
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Numbers after swaping  "+a+"  "+b);
		
		

	}

}
