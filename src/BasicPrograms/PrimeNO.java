package BasicPrograms;

import java.util.Scanner;

public class PrimeNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		int count = 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		System.out.println("prime no");
		else
		System.out.println("Not Prime");
	}
}
