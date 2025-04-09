/*
Check for Perfect Cube
Description: Write a program to check if a number is a perfect cube.
Input: n = 27
Output: Perfect Cube
*/
package BasicPrograms;

import java.util.Scanner;

public class CheckPerfectCube {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		
		//USING INBUILT FUNCTION
		
//		int cuberoot = (int)Math.round(Math.cbrt(no));
//		if(cuberoot * cuberoot * cuberoot ==no)
//		{
//			System.out.println("Perfect Cube ");
//		}
//		else
//		{
//			System.out.println("Not Cube ");
//		}
		
		//MANUAL LOGIC
		boolean isPerfectCube = false;
		for(int i=1;i<=no;i++)
		{
			if(i*i*i==no)
			{
				isPerfectCube = true;
				break;
			}
		}
		if(isPerfectCube)
		{
			System.out.println("Perfect Cube ");
		}
		else
		{
			System.out.println("Not Cube");
		}
	}
}
