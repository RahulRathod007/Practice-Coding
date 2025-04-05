package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstODD {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt(); 
		int sum = no*no;
		System.out.println("sum of first " +no+ " odd no is : "+sum);
	}
}
