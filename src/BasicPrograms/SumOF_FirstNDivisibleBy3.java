package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstNDivisibleBy3 {

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter how many numbers divisible by 3 you want to sum: ");
        int no = xyz.nextInt();

        int sum = 0;
        for (int i = 1; i <= no; i++) 
        {
            sum = sum + (i * 3);
        }
        System.out.println("Sum = " + sum);
    }
}
