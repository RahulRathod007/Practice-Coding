/*
Check if String Starts with a Substring
Description: Check if a string starts with a specific substring.
Input: "hello", substring "he"
Output: Starts with "he"
*/
package String_Programs;

import java.util.Scanner;

public class CheckStringStartsWith_Substring {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter a Substring  startswith :");
		String sub = xyz.nextLine();
		boolean result = str.startsWith(sub);
		
		if (result) {
            System.out.println("Yes, String starts with \"" + sub + "\"");
        } else {
            System.out.println("No, String does not start with \"" + sub + "\"");
        }
	}
}
