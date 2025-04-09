/*
Print Hollow Square
Description: Write a program to print a hollow square pattern.
Input: n = 5
Output:

	*****
	*   *
	*   *
	*   *
	*****
*/
package Patterns;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || j==1 || i==5 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");

		}
	}
}
