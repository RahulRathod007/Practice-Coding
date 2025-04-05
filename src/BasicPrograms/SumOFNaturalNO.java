package BasicPrograms;

import java.util.Scanner;

public class SumOFNaturalNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int i=1;
		int sum =0;
		while(i<=no)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum is : " + sum);
	}
}
