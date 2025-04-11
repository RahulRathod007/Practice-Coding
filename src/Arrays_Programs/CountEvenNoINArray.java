/*
Count Even Numbers in Array
Description: Count how many even numbers are in an array.
Input: [1, 2, 3, 4, 5, 6]
Output: 3
*/
package Arrays_Programs;

import java.util.Scanner;

public class CountEvenNoINArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a elements in array :");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("\nDisplay array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		//COUNT EVEN ELEMENT LOGIC.
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("\nCount Of Even Elements In Array : "+count);
	}
}
