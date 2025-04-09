/*
Print Star Box
Description: Write a program to print a star box of size n.
Input: n = 4
Output:

	****
	****
	****
	****
*/
package Patterns;

import java.util.Scanner;

public class P8 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
