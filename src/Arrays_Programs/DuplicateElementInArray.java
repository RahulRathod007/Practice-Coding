/*
Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.
Input: [1, 2, 3, 4, 5, 1, 3]
Output: [1, 3]
*/
package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		Scanner xyz = new  Scanner(System.in);
		System.out.println("Enter values in array : ");
		int a[] = new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print (" "+a[i]);
		}
		
		//DUPLICATE ELEMENTS LOGIC USING SORTING
//		Arrays.sort(a);
//		System.out.println("\nDuplicate Elements are : ");
//		System.out.print("[");
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(i<a.length-1 && a[i]==a[i+1])
//			{	
//				System.out.print(" "+a[i]);
//				while(a[i]==a[i+1])
//				{
//					i++;
//				}
//			}
//			
//		}
//		System.out.print(" ]");
		
		
		
		//DUPLICATE ELEMENTS LOGIC WITHOUT SORTING
		System.out.println("\nDuplicate Elements are :");
		System.out.print("[");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" "+a[i]);
				}
			}
		}
		System.out.print("]");
	}
}
