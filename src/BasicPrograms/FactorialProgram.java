package BasicPrograms;

import java.util.Scanner;

public class FactorialProgram {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		int fact = 1 ;
		for(int i=1;i<=no;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial is : "+fact);
	}
}
