package Arrays_Programs;
import java.util.*;
public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array Values :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.print("\nDisplay Original Array Values : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
		
		System.out.print("\nDisplay Reverse Array :");
		int mid = a.length/2;
		int f = a[0];
		int l = a.length-1;
		
		for(f=0;f<=mid;f++)
		{
			int temp = a[f];
			a[f] = a[l] ;
			a[l] = temp;
			l--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d ",a[i]);
		}
	}
}