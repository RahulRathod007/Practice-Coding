/*
Join an Array of Strings into One String
Description: Join an array of strings into a single string.
Input: ["hello", "world"]
Output: "helloworld"
*/
package String_Programs;
import java.util.*;
public class JoinArrayOfString_IntoOne {
	public static void main(String[] args) {
		
		String words[] = {"hello", "world"};
		
		String result = "";
		for(int i=0;i<words.length;i++)
		{
			result += words[i];
		}
		System.out.println("\nJoining String : \""+result+"\" ");
	}
}
