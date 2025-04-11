/*
Find Minimum Element in Array
Description: Find the smallest element in an array.
Input: [10, 20, 30, 5, 15]
Output: 5
*/
package Arrays_Programs;

import java.util.Scanner;

public class MinElementInArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter a array values :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.print("\nDisplay Array Values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("\nMin Element in Array is : "+min);
	}
}
