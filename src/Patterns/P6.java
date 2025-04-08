/*
Print Decreasing Number Pattern
Description: Write a program to print a decreasing number pattern.
Input: n = 5
Output:

	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1
*/
package Patterns;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		for(int i=1;i<=no;i++)
		{	int n = no - i + 1; 
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.print(n);
					n--;
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
