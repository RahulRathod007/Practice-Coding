package String_Programs;
import java.util.*;
public class Palindrome_String {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = xyz.next();
		
		 
		//1) Using + (String Concatenation) Operator.
		String s = str;
	    String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.printf("%s string is Palindrome",s);
		}
		else
		{
			System.out.printf("%s string is not Palindrome",s);			
		}
	
		
		//2) Using Character Array.
	/*	char ch[] = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev = rev + ch[i];
		}
		if(str.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	*/
		
		// 3) Using StringBuffer class.
	/*	StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(str.equals(sb.toString()))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	*/
	}
}
