/*
Description: Write a program to print numbers in reverse order.
Input: n = 5
Output: 5 4 3 2 1

*/
package BasicPrograms;
import java.util.Scanner;

public class ReversePrintNumbers {
	public static void main(String[] args) {
		Scanner xyz = new Scanner (System.in);
		System.out.println("Enter a no ");
		int no = xyz.nextInt();
		int i=no;
		while(i>0)
		{
			System.out.print(" "+i);
			i--;
		}
		
	}
}
