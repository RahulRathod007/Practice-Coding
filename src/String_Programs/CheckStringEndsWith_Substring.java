/*
Check if String Ends with a Substring
Description: Check if a string ends with a specific substring.
Input: "hello", substring "lo"
Output: Ends with "lo"
*/
package String_Programs;

import java.util.Scanner;

public class CheckStringEndsWith_Substring {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter a Substring endsWith : ");
		String sub = xyz.nextLine();
		
		boolean result = str.endsWith(sub);
		
		if(result)
		{
			System.out.println("Yes, String Endswith \"" +sub+ "\" ");
		}
		else
		{
			System.out.println("No, String Not Endswith \"" +sub+ "\" ");
		}
	}
}
