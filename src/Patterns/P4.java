/*
	   1    
	  121   
	 12321  
	1234321
*/
package Patterns;
import java.util.Scanner;
public class P4 {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num = xyz.nextInt();
		for(int i=1;i<=num;i++)
		{	int no =1;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i && j<=3+i)
				{
					if(j<4)
					{
						System.out.print(no);
						no++;
					}
					else
					{
						System.out.print(no);
						no--;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}
	}
}
