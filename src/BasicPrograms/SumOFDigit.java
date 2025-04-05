package BasicPrograms;

import java.util.Scanner;

public class SumOFDigit {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int sum =0;
		int rem;
		
		while(no!=0)
		{
			rem = no % 10;
			no = no /10;
			sum = sum + rem;
		}
		System.out.println("Some Of Above Digit is : "+sum);
	}
}
