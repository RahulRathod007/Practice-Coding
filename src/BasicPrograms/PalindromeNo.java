package BasicPrograms;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		int rev=0;
		int rem;
		int temp = no;
		while(no!=0)
		{
			rem = no % 10;
			no = no / 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reverse is : "+ rev);
		no = temp;
		if(rev ==no)
		{
			System.out.println("Plaindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
