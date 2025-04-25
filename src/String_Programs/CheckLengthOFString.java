/*
check the Length of a String
Description: Find the length of a given string.
Input: "hello"
Output: 5
*/
package String_Programs;
import java.util.*;
public class CheckLengthOFString {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		//USING INBUILT FUNCTION
//		int count = str.length();
//		System.out.println(count);
		
		//MANUAL LOGIC 
		int count =0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
