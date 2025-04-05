package Arrays_Programs;
import java.util.*;
public class PalindromeNo {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a No : ");
		int no = xyz.nextInt();
		int rem,rev=0;
		int temp = no;
		while(no!=0)
		{
			rem = no %10;
			no = no /10;
			rev = rev* 10 + rem;
		}
		no = temp;
		if(no==rev)
		{
			System.out.println("Palindrome No ");
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}
}
