/*
Sum of Elements in Array
Description: Calculate the sum of all elements in an array.
Input: [1, 2, 3, 4, 5]
Output: 15
*/
package Arrays_Programs;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		int sum =0 ;
		System.out.println("Enter array values : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		System.out.print("\nDisplay Array Values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		
		//SUM LOGIC 
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("\nSum Of Array  : "+ sum);
	}
}
