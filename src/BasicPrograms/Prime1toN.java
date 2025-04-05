package BasicPrograms;

import java.util.Scanner;

public class Prime1toN {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = xyz.nextInt();

//		int i=1;
//		while(i<=no)
//		{
//			int j=1,count=0;
//			while(j<=i)
//			{
//				if(i%j==0)
//				{
//					count++;
//				}
//				j++;
//			}
//			if(count==2)
//			{
//				System.out.println(i);
//			}
//			i++;
//		
		
		for(int i=2;i<=no;i++)
		{	int count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
