/*
Check if a String is Palindrome
Description: Check if the given string is a palindrome.
Input: "madam"
Output: Palindrome

*/
package String_Programs;
import java.util.*;
public class Palindrome_String {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = xyz.next();
		
		//1) Using + (String Concatenation) Operator.
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev += str.charAt(i); 
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	// 2) Using Character Array
	/*	char ch[] = str.toCharArray();
		String rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev += str.charAt(i); 
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	*/
		
	// 3) Using String Buffer Class
		
		StringBuffer sb = new StringBuffer(str);
	/*	sb.reverse();
		if(str.equals(sb.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	*/
	}
}

















