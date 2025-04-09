/*
Power of a Number
Description: Write a program to calculate the power of a number x^y.
Input: base = 2, index = 3
Output: 8
*/

package BasicPrograms;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a base  :");
		int base = xyz.nextInt();
		System.out.println("Enter a index :");
		int index = xyz.nextInt();
		
		int p=1;
		for(int i=1;i<=index;i++)
		{
			p = p * base;
		}
		System.out.println("Power is : "+p);
	}
}
