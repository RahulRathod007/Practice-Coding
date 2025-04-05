/*
Find Sum of All Odd Numbers in a Range
Description: Write a program to find the sum of all odd numbers in a range from m to n.
Input: m = 1, n = 10
Output: 25
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_OddNo1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a start value :");
		int i= xyz.nextInt();
		System.out.println("enter a end value");
		int end = xyz.nextInt();
		int sum =0;
		while(i<=end)
		{
			if(i%2!=0)
			{
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}

