/*
Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
*/
package Arrays_Programs;

import java.util.Scanner;

public class LargestSumOfContigiousSubArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter a values in array :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print (" "+a[i]);
		}
		//LONGEST SUM OF CONTIGIOUS SUBARRAY LOGIC
		int currentSum = a[0];
		int maxSum = a[0];
		for(int i=1;i<a.length;i++)
		{
			currentSum += a[i];
			if(currentSum<a[i])
			{
				currentSum = a[i];
			}
			if(currentSum>maxSum)
			{
				maxSum = currentSum;
			}
		}
        System.out.println("\nLargest Sum of Contiguous Subarray: " + maxSum);
	}
}
