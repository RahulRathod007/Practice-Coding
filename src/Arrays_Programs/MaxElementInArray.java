/*
Find Maximum Element in Array
Description: Find the largest element in an array.
Input: [12, 34, 56, 78, 23]
Output: 78
*/
package Arrays_Programs;
import java.util.Scanner;

public class MaxElementInArray {
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
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("\nMax Element in Array is : "+max);
	}
}
