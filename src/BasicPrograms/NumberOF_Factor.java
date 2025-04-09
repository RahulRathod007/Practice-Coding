/*
Number of Factors
Description: Write a program to count the number of factors of a number.
Input: n = 12
Output: 6
*/
package BasicPrograms;

import java.util.Scanner;

public class NumberOF_Factor {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int count=1;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
