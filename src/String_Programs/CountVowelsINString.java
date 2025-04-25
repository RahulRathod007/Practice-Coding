/*
Count Vowels in String
Description: Count the number of vowels in a given string.
Input: "hello"
Output: 2
*/
package String_Programs;

import java.util.Scanner;

public class CountVowelsINString {
 
	public static void main(String[] args) {
	Scanner xyz = new Scanner(System.in);
	System.out.println("Enter a String :");
	String str = xyz.nextLine();
	char ch[] = str.toCharArray();
	
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' && 
		ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
		{
			count++;
		}
	}
	System.out.println("No Of Vowels in Above String : "+count);
}	
}
