/*
Description: Write a program to calculate the sum of first n even numbers.
Input: n = 4
Output: 20
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_Even_1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int sum =0;
//		for(int i=1;i<=no;i++)
//		{
//			sum  = sum + i *2;
//		}
//		System.out.println(sum);
		
		int count =0;
		int i=1;
		while (count < no) {
            if (i % 2 == 0) { // Check if number is even
                sum += i;
                count++;      // Count only even numbers
            }
            i++;
        }

        System.out.println("Sum of first " + no + " even numbers is: " + sum);
	}
}
