/*
Calculate Sum of All Divisors
Description: Write a program to calculate the sum of all divisors of a number.
Input: n = 12
Output: 28
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOFAllDivisors {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int sum =0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				sum += i;
			}
		}
        System.out.println("Sum of all divisors of " + no + " is: " + sum);
	}
}
