package BasicPrograms;

import java.util.Scanner;

public class OddNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		if(no%2!=0)
		{
			System.out.println("ODD");
		}
		else
		{
			System.out.println("Even");
		}
	}
}
