// Input : Welcome To Java 
// Output : Number of Words in Above String is 3
package String_Programs;
import java.util.*;
public class CountTheWord {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = xyz.nextLine();
		
		int count = 1;
		for(int i=0;i<str.length();i++)
		{
			if( (str.charAt(i)==' ' ) && (str.charAt(i+1)!=' ') )
			{
				count++;
			}
		}
		System.out.println("Number of Words in Above String is : "+count);
	}
}
