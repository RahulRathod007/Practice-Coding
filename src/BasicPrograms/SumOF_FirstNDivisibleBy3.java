package BasicPrograms;

import java.util.Scanner;

public class SumOF_FirstNDivisibleBy3 {

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.print("Enter how many numbers divisible by 3 you want to sum: ");
        int no = xyz.nextInt();

        int sum = 0;
        int count = 1;
        int num = 3;

        while (count < no) {
            sum += num;
            num += 3;
            count++;
        }

        System.out.println("Sum = " + sum);
    }
}
