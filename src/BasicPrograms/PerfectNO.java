/*
CHECK NO IS PERFECT OR NOT
input : 6
output : Perfect NO
*/
package BasicPrograms;

import java.util.Scanner;

public class PerfectNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner (System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		int sum =0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum = sum + i;
			}
		}
		if(sum==no)
		{
			System.out.println("Perfect No ");
		}
		else
		{
			System.out.println("Not Perfect No");
		}
	}
}
