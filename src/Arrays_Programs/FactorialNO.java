/*
Find the Factorial Using While Loop
Description: Write a program to calculate the factorial of a number using a while loop.
Input: n = 5
Output: 120
*/
package Arrays_Programs;
import java.util.Scanner;

public class FactorialNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no ");
		int no = xyz.nextInt();
		int fact = 1;
		int i=1;
		while(i<=no)
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial is : " +fact);
	}
}
