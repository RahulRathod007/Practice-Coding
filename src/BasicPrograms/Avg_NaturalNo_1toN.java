/*
Calculate Average of First N Natural Numbers
Description: Write a program to calculate the average of the first n natural numbers.
Input: n = 5
Output: 3.0
*/

package BasicPrograms;

import java.util.Scanner;

public class Avg_NaturalNo_1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int i= 1;
		int sum =0;
		while(i<=no)
		{
			sum = sum  + i;
			i++;
		}
		float avg = sum / no;
		System.out.println("Average is : "+avg);
	}
}
