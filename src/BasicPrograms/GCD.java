/*
Find Greatest Common Divisor (GCD)
Description: Write a program to find the greatest common divisor (GCD) of two numbers.
Input: a = 12, b = 15
Output: 3
*/
package BasicPrograms;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a first no :");
		int first = xyz.nextInt();
		System.out.println("Enter a second no :");
		int second = xyz.nextInt();
		
		// Euclidean Algorithm
//		while(second!=0)
//		{
//			int temp = second;
//			second =  first % second ;
//			first = temp;
//		}
//		System.out.println("GCD : "+first);
		
		
		//Second Approach 
		int gcd = 1;
		int min = Math.min(first, second);
		for(int i=1;i<=min;i++)
		{
			if(first%i==0 && second%i==0)
			{
				gcd = i;
			}
		}
		System.out.println("GCD : "+gcd);
	}
}
