/*
Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.
Input: [1, 2, 3, 4], [3, 4, 5, 6]
Output: [3, 4]
*/
package Arrays_Programs;

import java.util.Scanner;

public class CommonElementINTwoArray {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        int[] arr1 = new int[4];
        int[] arr2 = new int[4];

        System.out.println("Enter 4 elements for the first array:");
        for (int i = 0; i < 4; i++) {
            arr1[i] = xyz.nextInt();
        }

        System.out.println("Enter 4 elements for the second array:");
        for (int i = 0; i < 4; i++) {
            arr2[i] = xyz.nextInt();
        }

        System.out.print("Output: [");
        boolean first = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if already printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr1[k] == arr1[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        if (!first) {
                            System.out.print(", ");
                        }
                        System.out.print(arr1[i]);
                        first = false;
                    }
                }
            }
        }
        System.out.println("]");
    }
}
