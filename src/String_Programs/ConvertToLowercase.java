/*
Convert String to Lowercase
Description: Convert a string to lowercase.
Input: "HELLO"
Output: "hello"
*/
package String_Programs;
import java.util.*;
public class ConvertToLowercase {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		//USING INBUILT FUNCTION 
//		String s1 = str.toLowerCase();
//		System.out.println(s1);
		
		//MANUAL LOGIC
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' || ch[i]<='Z')
			{
				ch[i] = (char) (ch[i]+32);
			}
		}
		System.out.println(ch);
	}
}
