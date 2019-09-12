/**
 * 
 */
package lab.lab1;
import java.util.*;

/**
 * @author KIRAN
 *
 */
public class Array_Avg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n,i;
		double[] arr=new double[20];
		double sum=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Elements\n");
		n = sc.nextInt();
		System.out.println("Enter The Elements\n");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		
			sum+=arr[i];
		}
		
		 System.out.printf("Average of array is  %7.3f ",(sum/n));


	}

}
