package BasicPrograms;

import java.util.Scanner;

public class Table1ToN {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter  no :");
		int no = xyz.nextInt();
		for(int i=0;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(no*j);
			}
		}
	}

}
