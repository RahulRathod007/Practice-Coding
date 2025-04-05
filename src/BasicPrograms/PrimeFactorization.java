/*
Prime Factorization
Description: Write a program to perform prime factorization of a number n.
Input: n = 12
Output: 2 2 3
 */
package BasicPrograms;
import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int i=2;
		 while (no > 1)
		 {
	            if (no % i == 0) 
	            {
	                System.out.print(i + " ");
	                no = no / i;
	            } 
	            else {
	                i++;
	            }
	        }
	}
}
