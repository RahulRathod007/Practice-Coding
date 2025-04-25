package Arrays_Programs;
import java.util.*;
public class FiboArray {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int len = xyz.nextInt();
		int a[] = new int[len];
		a[0]=0;
		a[1]=1;
		for(int i=2;i<a.length;i++)
		{
			a[i] = a[i-1] + a[i-2];
		}
		
		System.out.print("\nDisplay Fibonacci Array :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
