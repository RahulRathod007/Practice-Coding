package Arrays_Programs;
import java.util.*;
public class InsertElementOnINdex {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Length of array :");
		int len = xyz.nextInt();
		int a[] = new int[len];
		System.out.println("Enter Array values :");
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = xyz.nextInt();
		}
		System.out.println("Display Array Values :");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		System.out.println("\nEnter index where you want to insert value");
		int index = xyz.nextInt();
		System.out.println("\nEnter Element which you want to insert");
		int value = xyz.nextInt();
		
//		for(int i=index+1;i>=index;i--)
//		{
//			a[i+1]=a[i];
//		}
//		a[index]=value;
		
		for(int i=0;i<a.length;i++){
			if(i==index-1)
			{
				for(int j=a.length-1;j>index-1;j--)
				{
					a[j]=a[j-1];
				}
				a[index-1]=value;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.printf(" %d\t",a[i]);
		}
	}
}
