/*
Sum of First N Perfect Squares
Description: Write a program to calculate the sum of the first n perfect squares.
Input: n = 4
Output: 30
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstNPerfectSquares {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int sum = 0;
		for(int i=1;i<=no;i++)
		{
			sum = sum + i * i;
		}
		System.out.println("Sum of N Perfect Square is : "+sum);
	}
}
