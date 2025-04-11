/*
Find the Second Largest Element in Array
Description: Find the second largest element in an array.
Input: [10, 20, 30, 40, 50]
Output: 40

*/
package Arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementINArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter a elements in array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("\n\nDisplay array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		//SECOND LARGEST FIND USING SORTING TECHNIQUE
//		Arrays.sort(a);
//		System.out.println("\n------SORTED ARRAY------");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.printf(" %d ",a[i]);
//		}
//		int count =0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[a.length-1] == a[i])
//			{
//				count++;
//			}
//		}
//		System.out.printf("\nSecond Largest Element is :  %d ",a[a.length-(count+1)]);
		
		
		//SECOND LARGEST ELEMENT WITHOU SORTING
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("\nMax element is : "+max);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max)
			{
				a[i]=0;
			}
		}
		
		int max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Second max element is : "+max2);
	}
}
