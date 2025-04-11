/*
Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.
Input: [1, 2, 2, 3, 4, 2, 5], element 2
Output: 3
*/

package Arrays_Programs;

import java.util.Scanner;

public class FrequencyOfArrayElementBYInput {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Enter a array elements :");
		int a[] = new int[7];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("\nDisplay array elements :");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		System.out.println("\nEnter a element which you want to see frequency ");
		int input = xyz.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==input)
			{
				count++;
			}
		}
		System.out.println(input+ " ---> " +count);
	}
}
