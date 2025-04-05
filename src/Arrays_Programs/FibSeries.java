package Arrays_Programs;
import java.util.*;
public class FibSeries {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = xyz.nextInt();
		
		int no1=0,no2=1,no3;
		System.out.print(no1+" "+no2);
		for(int i=2;i<num;i++)
		{
			no3 = no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(" "+no3);
		}
	}
}
