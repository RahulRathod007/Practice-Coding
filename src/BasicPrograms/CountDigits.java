package BasicPrograms;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no ");
		int no = xyz.nextInt();
		int count =0;
		while(no!=0)
		{
			no = no /10;
			count++;
		}
		System.out.println("Count is : "+count);
	}
}
