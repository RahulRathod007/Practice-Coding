
package BasicPrograms;
import java.util.Scanner;

public class Sum_Of_Numbers {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("enter a number");
		int no = xyz.nextInt();
		
		int sum = 0;
		//int i=1;
//		while(i<=no)
//		{
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("Sum is :"+sum);
		
		for(int i=1;i<=no;i++)
		{
			sum += i;
		}
		System.out.println("Sum is :" + sum);
		
	}

}
