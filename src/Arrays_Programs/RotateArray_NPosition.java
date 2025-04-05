package Arrays_Programs;
import java.util.*;
public class RotateArray_NPosition {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		
		System.out.println("Enter values in Array : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Enter Postion which you want to rotate array :");
		int pos = xyz.nextInt();
		int k=0;
		for(int i=pos;i<a.length;i++)
		{
			b[k] = a[i];
			k++;
		}
		for(int i=0;i<pos;i++)
		{
			b[k] = a[i];
			k++;
		}
		System.out.print("\nRotate Array : ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}
	}
}
