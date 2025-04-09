/*
Sum of First N Prime Numbers
Description: Write a program to calculate the sum of the first n prime numbers.
Input: n = 4
Output: 17
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstNPrimeNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int i=1;
		int count;
		int sum =0;
		while(i<=no)
			{
				int j=1;
				count=0;
				while(j<=i)
				{
					if(i%j==0)
					{
						count++;
					}
					j++;
				}
				if(count==2)
				{
					sum  = sum + i;
				}
				i++;
			}
		System.out.println(sum);
	}
}
