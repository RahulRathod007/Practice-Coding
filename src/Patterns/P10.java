/*
Print Right-Angle Triangle Pattern of Numbers
Description: Write a program to print a right-angle triangle of numbers.
Input: n = 4
Output:
 
	1
	12
	123
	1234
*/
package Patterns;

import java.util.Scanner;

public class P10 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no ");
		int no = xyz.nextInt();
		
		for(int i=1;i<=no;i++)
		{	int n =1;
			for(int j=1;j<=no;j++)
			{
				if(i>=j)
				{
					System.out.print(n);
					n++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
