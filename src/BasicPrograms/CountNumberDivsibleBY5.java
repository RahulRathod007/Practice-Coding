/*
Count Numbers Divisible by 5
Description: Write a program to count the numbers divisible by 5 between 1 and n.
Input: n = 20
Output: 4
*/
package BasicPrograms;

import java.util.Scanner;

public class CountNumberDivsibleBY5 {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int count =0;
		for(int i=1;i<=no;i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}
		System.out.println("Number Divisible By 5 Between " +no+ " number is "+count);
	}
}
