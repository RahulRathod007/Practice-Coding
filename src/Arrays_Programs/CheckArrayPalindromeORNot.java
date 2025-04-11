/*
Check if Array is Palindrome
Description: Check if an array is the same when reversed.
Input: [1, 2, 3, 2, 1]
Output: Palindrome
*/
package Arrays_Programs;

import java.util.Scanner;

public class CheckArrayPalindromeORNot {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter array values :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.print("\nDisplay Array Values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		int len = a.length;
		boolean ispalindrome = true;
		for(int i=0;i<len/2;i++)
		{
			if(a[i]!=a[len-1-i])
			{
				ispalindrome = false;
				break;
			}
		}
		if(ispalindrome)
		{
			System.out.println("\nPalindrome Array");
		}
		else
		{
			System.out.println("\nNot Palindrome Array");
		}
		
	}
}
