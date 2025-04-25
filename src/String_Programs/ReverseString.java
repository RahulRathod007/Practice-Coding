/* Reverse a String
Description: Reverse the given string.
Input: "hello"
Output: "olleh"
*/
package String_Programs;

import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		// 1) Reverse String using + (String Concatenation) Operator.
	
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.print("Reverse String is : "+rev);    
		
		// 2) Using Character Array.
	
		/*	char ch[] = str.toCharArray();
		String rev ="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev +ch[i];
		}
		System.out.println("Reverse String is : "+rev);   */
		
		// 3) Using StringBuffer class.
		/*
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Reverse String is : "+sb);  */
	}
}
