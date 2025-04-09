/*
Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.
Input: a = 12, b = 15
Output: 60
*/
package BasicPrograms;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a first no :");
		int first = xyz.nextInt();
		System.out.println("Enter a second no :");
		int second = xyz.nextInt();
		
		//FORMULA : LCM = (first * second) / GCD
		int OriginalF = first;
		int OriginalS = second;
		while(second!=0)
		{
			int temp = second;
			second = first % second;
			first = temp;
		}
		int GCD = first;
		int LCM = (OriginalF * OriginalS)/GCD;   
		System.out.println("LCM : "+LCM);
	}

}
