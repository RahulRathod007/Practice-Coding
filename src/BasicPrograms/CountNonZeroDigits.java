/*
Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203
Output: 3
*/
package BasicPrograms;

import java.util.Scanner;

public class CountNonZeroDigits {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int rem;
		int count=0;
		while(no!=0)
		{
			rem = no % 10;
			no = no/10;
			if(rem!=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
