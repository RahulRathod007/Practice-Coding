/*
Rotate Array by N Positions
Description: Rotate the array by n positions to the right.
Input: [1, 2, 3, 4, 5], n = 2
Output: [3, 4, 5, 1, 2]
*/
package Arrays_Programs;

import java.util.Scanner;

public class RotateArrayNPosition {
	public static void main(String[] args) {
		Scanner xyz = new  Scanner(System.in);
		System.out.println("Enter values in array : ");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print (" "+a[i]);
		}
		
		System.out.println("\nEnter a index from which you want to rotate array :");
		int index = xyz.nextInt();
		int b[] = new int [a.length]; 
		int k=0;
		for(int i=index;i<a.length;i++)
		{
			b[k++] = a[i];
		}
		for(int i=0;i<index;i++)
		{
			b[k++] = a[i];
		}
		System.out.println("ROTATED ARRAY :");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
}
