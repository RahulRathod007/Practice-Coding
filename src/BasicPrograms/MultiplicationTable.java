/*
Description: Write a program to print the multiplication table for a number n.
Input: n = 4
Output: 4 8 12 16 20

 */
package BasicPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner xyz = new Scanner (System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		for(int i=1;i<=5;i++)
		{
			System.out.println(no*i);
		}
	}
}
