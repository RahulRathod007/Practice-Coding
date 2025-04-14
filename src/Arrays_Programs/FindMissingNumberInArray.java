/*
Find Missing Number in Array
Description: Find the missing number in an array containing numbers from 1 to n.
Input: [1, 2, 4, 5]
Output: 3
*/
package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
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
		
		//MISSING ELEMENT LOGIC
		Arrays.sort(a); // Sorting  Array
		System.out.println("\nMissing Elements are : ");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.print(" "+j);
			}
		}
		
		
		//ANOTHER LOGIC
//		for(int i=0;i<a.length-1;i++)
//		{
//			int diff = a[i+1]-a[i];
//			if(diff>1)
//			{	int count=a[i];
//				while(count<a[i+1]-1)
//				{   ++count;
//					System.out.printf("\n%d ",count);
//				}
//			}
//		}
	}
}
