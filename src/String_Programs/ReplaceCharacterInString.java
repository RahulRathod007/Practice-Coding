package String_Programs;
import java.util.*;
public class ReplaceCharacterInString {
	public static void main(String[] args) {
		Scanner xyz = new Scanner (System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		
		System.out.println("Enter a target character : ");
		char target = xyz.next().charAt(0);
		
		System.out.println("Enter a replacement character : ");
		char replacement = xyz.next().charAt(0);
		
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==target)
			{
				ch[i] = replacement;
			}
		}
		String result = new String(ch);
		System.out.println("Original String : "+str);
		System.out.println("Replaced String : "+result);
	}
}
