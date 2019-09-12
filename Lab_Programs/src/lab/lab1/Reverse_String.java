package lab.lab1;
import java.util.*;

/**
 * @author KIRAN
 *
 */
public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,rev;
		int i,j;
		System.out.println("Enter your String\n");
		str=sc.nextLine();
		int len=str.length();
		StringBuilder sb = new StringBuilder(str);
		for(i=len-1,j=0;i>=0;i--,j++)
		{
			 
	        sb.setCharAt(i, str.charAt(j)); 
	        
		}
		
		System.out.println(sb.toString());
		
		
	}

}
