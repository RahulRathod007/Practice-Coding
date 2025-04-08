package Arrays_Programs;

import java.util.Scanner;

public class SumOF_Odd_1toN {
public static void main(String[] args) {
	Scanner xyz = new Scanner(System.in);
	System.out.println("Enter a no :");
	int no = xyz.nextInt();
	int i=1;
	int sum =0;
	while(i<=no)
	{
		if(i%2!=0)
		{
			sum = sum + i;
		}
		i++;
	}
	System.out.println("Sum of Odd no : " +sum);
}
}
