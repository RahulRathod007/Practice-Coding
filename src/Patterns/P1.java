/*
	5 4 3 2 1
	4 3 2 1
	3 2 1
	2 1
	1

 */
package Patterns;
public class P1 {
	public static void main(String[] args) {
		int no = 5;
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<=5;j++)
			{	
				if(j<=6-i)
				{
					System.out.print(no);
					no--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			no--;
			System.out.println();
		}
		
	}
}
