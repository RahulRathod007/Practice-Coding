/*
Description: Write a program to calculate the sum of squares of the first n natural numbers.
Input: n = 3
Output: 14
 */
package BasicPrograms;

import java.util.Scanner;

public class SumOF_Square_FirstN_EvenNatural {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= no) 
		{
			sum = sum + i * i;
			i++;
		}
		System.out.println(sum);

	}
}
