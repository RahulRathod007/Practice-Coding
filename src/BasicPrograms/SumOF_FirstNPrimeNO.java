/*
Sum of First N Prime Numbers
Description: Write a program to calculate the sum of the first n prime numbers.
Input: n = 4
Output: 17
*/
package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstNPrimeNO {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();

		int count = 0;
        int num = 2;
        int sum = 0;

        while (count < no) {
            int j = 1;
            int c = 0;

            while (j <= num) {
                if (num % j == 0) {
                    c++;
                }
                j++;
            }

            if (c == 2) { // prime number has exactly 2 divisors
                sum += num;
                count++;
            }
            num++;
        }

        System.out.println("Sum of first " + no + " prime numbers is: " + sum);
	}
}
