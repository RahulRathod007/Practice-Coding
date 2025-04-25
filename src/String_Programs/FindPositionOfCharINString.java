/*
Find the Position of a Character in a String
Description: Find the index of a specific character in a string.
Input: "hello", character o
Output: 4
*/
package String_Programs;
import java.util.*;
public class FindPositionOfCharINString {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter a character : ");
		char ch = xyz.next().charAt(0);
		
		
		int index = -1 ;
		char s[] = str.toCharArray();
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==ch)
			{
				index = i;
				break;
			}
		}
		if (index != -1) {
            System.out.println("Character '" + ch + "' found at index: " + index);
        } else {
            System.out.println("Character '" + ch + "' not found in the string.");
        }
	}
}
