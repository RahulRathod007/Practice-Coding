/*
Merge Two Arrays
Description: Merge two arrays into one.
Input: [1, 2, 3], [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
*/
package Arrays_Programs;

import java.util.Scanner;

public class MergeTwoArrays {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter first array values :");
		int a[] = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		
		int b[] = new int[5];
	    System.out.println("Enter values in second array : ");
	    for(int i=0;i<b.length;i++)
	    {
	    	b[i] = xyz.nextInt();
	    }
	    
	    System.out.print("\nDisplay First array : ");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.printf(" %d ",a[i]);
	    }
	    System.out.print("\nDisplay second array : ");
	    for(int i=0;i<b.length;i++)
	    {
	    	System.out.printf(" %d ",b[i]);
	    }
	    
	    //MERGE LOGIC 
	    int k=0;
	    int c[] = new int [a.length+b.length];
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	c[k] = a[i];
	    	k++;
	    }
	    for(int i=0;i<b.length;i++)
	    {
	    	c[k] = b[i];
	    	k++;
	    }
	    System.out.print("\nDisplay First array : ");
	    for(int i=0;i<c.length;i++)
	    {
	    	System.out.printf(" %d ",c[i]);
	    }
	}
}
