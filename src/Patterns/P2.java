/*
Description: Write a program to print a triangle of stars.
Input: n = 4
Output:
	*
	**
	***
	****

*/
package Patterns;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no ");
		int no = xyz.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=no;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
