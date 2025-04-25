/*
Find the First Non-Repeated Character in a String
Description: Find the first non-repeated character in a string.
Input: "swiss"
Output: w
*/
package String_Programs;

import java.util.Scanner;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = xyz.nextLine();
		
		int[] count = new int[256]; // Array to count characters

        // Step 1: Count how many times each character appears
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch] = count[ch] + 1;
        }
        
        
        // Step 2: Find the first character with count 1
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }

        // If no non-repeated character found
        System.out.println("No non-repeated character found.");
	}
}
