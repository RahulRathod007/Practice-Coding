//Sum of First n odd no 
package BasicPrograms;

import java.util.Scanner;

public class Sum_First_N_ODD {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a no :");
		int no = xyz.nextInt();
		int sum = no * (no+1);
		System.out.println("Sum Of First " +no+ " Even is " +sum);
	}
}
