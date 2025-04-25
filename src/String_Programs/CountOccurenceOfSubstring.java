/*
Count Occurrences of a Substring in String
Description: Count how many times a substring occurs in a string.
Input: "hello world hello", substring "hello"
Output: 2
*/
package String_Programs;
import java.util.*;
public class CountOccurenceOfSubstring {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter Substring : ");
		String substr = xyz.nextLine();
		
		int count = 0;
		int index = 0;
		
		while((index=str.indexOf(substr,index))!=-1)
		{
			count++;
			index++;
		}
		System.out.println("Occurances of \""+substr+ "\": " +count);
	}
}	
