/*
Count the Number of Prime Numbers in a Range
Description: Write a program to count the number of prime numbers between m and n.
Input: m = 1, n = 10
Output: 4
*/
package BasicPrograms;
import java.util.Scanner;

public class CountPrime1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a start :");
		int s = xyz.nextInt();
		System.out.println("Enter a end ");
		int e = xyz.nextInt();
		int i=1;
		int totalCount = 0;
		while(i<=e)
		{
			int j=1;
			int count =0;
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
				totalCount++;
			}
			i++;
		}
		System.out.println(totalCount);
		
		
	}
}
