/*
Sum of Cubes of First N Natural Numbers
Description: Write a program to calculate the sum of cubes of the first n natural numbers.
Input: n = 3
Output: 36
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_CubesFirst_N_NaturalNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int sum =0;
		int i=1;
		while(i<=no)
		{
			sum += i*i*i;
			i++;
		}
		System.out.println(sum);
	}
}
