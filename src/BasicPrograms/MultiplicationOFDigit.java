/*
Multiplication of Digits
Description: Write a program to calculate the multiplication of digits of a number.
Input: n = 123
Output: 6
*/
package BasicPrograms;

import java.util.Scanner;

public class MultiplicationOFDigit {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int sum =1;
		int rem =0;
		while(no!=0)
		{
			rem = no % 10;
			no = no /10;
			sum = rem * sum;
		}
		System.out.println(sum);
	}
}
