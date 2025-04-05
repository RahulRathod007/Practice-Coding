package Arrays_Programs;
import java.util.*;
public class FactorialApp {
 public static void main(String[] args) {
	Scanner xyz  = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num = xyz.nextInt();
	int fact = 1;
	
	for(int i=1;i<=num;i++)
	{
		fact = fact * i;
	}
	System.out.printf("Factorial of %d is : %d",num,fact);
}
}
