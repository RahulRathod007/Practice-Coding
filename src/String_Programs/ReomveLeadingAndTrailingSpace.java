/*
Remove Leading and Trailing Spaces from String
Description: Remove any leading and trailing spaces from a string.
Input: " hello "
Output: "hello"
*/
package String_Programs;
import java.util.*;
public class ReomveLeadingAndTrailingSpace {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		//USING INBUILD FUNCTION 
//		String s1 =str.trim();
//		System.out.println(s1);
		
		//MANUAL LOGIC 
		int start = 0;
		int end = str.length()-1;
		
		//Removing Leading Space
		while(start<=end && str.charAt(start)==' ')
		{
			start++;
		}
		
		//Remove Trailing Space
		while(end>=start && str.charAt(end)==' ')
		{
			end--;
		}
		
		String result = str.substring(start , end+1);
		System.out.println("Original String: \"" +str+ "\"");
        System.out.println("Trimmed String: \""+result+"\"");
	}
}
