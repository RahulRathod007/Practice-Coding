/*
Sum of Divisors
Description: Write a program to calculate the sum of divisors of a number.
Input: n = 12
Output: 28
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOFDivisior {
	public static void main(String[] args) {
		System.out.println("Enter a no :");
		Scanner xyz = new Scanner(System.in);
		int no = xyz.nextInt();
		
		int sum = 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
