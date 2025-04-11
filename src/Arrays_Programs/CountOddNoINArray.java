/*
Count Odd Numbers in Array
Description: Count how many odd numbers are in an array.
Input: [1, 2, 3, 4, 5, 6]
Output: 3
*/
package Arrays_Programs;

import java.util.Scanner;

public class CountOddNoINArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter elements in array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("\ndisplay array elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		//COUNT ODD ELEMEMT LOGIC 
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println("\nCount Of Odd Elements in Array is : "+count);
	}
}
