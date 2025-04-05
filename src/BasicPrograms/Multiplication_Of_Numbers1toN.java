/*
Multiplication of Numbers from 1 to N
Description: Write a program to find the multiplication of all numbers from 1 to n.
Input: n = 4
Output: 24
*/
package BasicPrograms;

import java.util.Scanner;

public class Multiplication_Of_Numbers1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int i=1;
		int sum =1;
		
		while(i<=no)
		{
			sum =sum* i;
			i++;
		}
		System.out.println(sum);
		
	}
}
