/* INPUT = 5 
 * OUTPUT ->
    *
   ***
  *****
 *******
*********

*/
package Patterns;
import java.util.Scanner;
public class P5 {
	public static void main(String[] args) {
		Scanner xyz =  new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i && j<=4+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
