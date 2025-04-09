/*
Count Digits Divisible by 3
Description: Write a program to count the digits divisible by 3 in a number.
Input: n = 123456
Output: 2
*/
package BasicPrograms;

import java.util.Scanner;

public class CountDigitDivisibleBY3 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int rem;
		int count=0;
		
		while(no!=0)
		{
			rem = no % 10;
			no = no /10;
			
			if(rem%3==0)
			{
				count++;
			}
		}
		System.out.println("Count is "+count);
	}
}
