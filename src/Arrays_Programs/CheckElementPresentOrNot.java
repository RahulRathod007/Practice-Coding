/*
Check if Array Contains a Specific Element
Description: Check if a specific element exists in an array.
Input: [1, 2, 3, 4], element 3
Output: Found
*/
package Arrays_Programs;

import java.util.Scanner;

public class CheckElementPresentOrNot {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter array values : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print (" "+a[i]);
		}
		
		//ACTUAL LOGIC 
		System.out.println("\nEnter a element : ");
		int input = xyz.nextInt();
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == input)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}
