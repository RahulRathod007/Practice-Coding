/*
Print Number Pattern
Description: Write a program to print a number pattern.
Input: n = 5
Output:
	1
	12
	123
	1234
	12345

*/
package Patterns;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = xyz.nextInt();
		
		for(int i=1;i<=num;i++)
		{	int no =1;
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
				{
					System.out.print(no);
					no++;
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
