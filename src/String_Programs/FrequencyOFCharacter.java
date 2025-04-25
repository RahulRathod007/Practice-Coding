/*
Find the Frequency of a Character in a String
Description: Find how many times a character appears in a string.
Input: "hello", character l
Output: 2
*/
package String_Programs;
import java.util.*;
public class FrequencyOFCharacter {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter a character :");
		char target = xyz.next().charAt(0);
		
		int count =0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]== target)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
