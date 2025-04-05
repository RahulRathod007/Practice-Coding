package Arrays_Programs;
import java.util.*;
public class Check_ArmStrong_OrNot {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number :");
		int no = xyz.nextInt();
		int count=0;
		int temp = no;
		while(no!=0)
		{
			no=no/10;
			count++;
		}
		no = temp;
		int sum =0;
		while(temp!=0)
		{
			int rem = temp % 10;
			temp = temp /10;
			int p = (int) Math.pow(rem, count);
			sum = sum + p;
		}
		if(sum==no)
		{
			System.out.println("Armstrong No ");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	} 
}
