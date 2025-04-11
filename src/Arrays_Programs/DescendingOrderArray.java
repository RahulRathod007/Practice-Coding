/*
Sort Array in Descending Order
Description: Sort the elements of the array in descending order.
Input: [10, 2, 30, 4, 5]
Output: [30, 10, 5, 4, 2]
*/
package Arrays_Programs;
import java.util.Scanner;
public class DescendingOrderArray {
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
		System.out.println("\nDisplay Descending Array :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i]; 
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(" "+a[i]);
		}
	}
}
