/*
Perfect Square Numbers
Description: Write a program to find perfect square numbers up to n.
Input: n = 20
Output: 1 4 9 16
*/
package BasicPrograms;

import java.util.Scanner;

public class PerfectSquareNumber {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int square=0;
		for(int i=1;i*i<=no;i++)
		{
			if(square<20)
			{
				square = i * i;
				System.out.println(square);
			}
		}
	}
}
