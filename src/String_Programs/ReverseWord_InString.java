//Input :  Rahul Rathod
//Output : luhaR dohtaR 

package String_Programs;
import java.util.*;
public class ReverseWord_InString {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");  //Input String From Keyboard.
		String str = xyz.nextLine();
		String words[] = str.split(" ");   // Splitting string into words.
		String ReverseString ="";
		
		// 1) Write Logics Manually.
	/*	for(String w:words) //Rahul
		{
			String ReverseWords ="";
			for(int i=w.length()-1;i>=0;i--) //Rahul
			{
				ReverseWords += w.charAt(i); 
			}
			ReverseString += ReverseWords+" "; //luhaR
		}
		System.out.println(ReverseString);
	*/
		
		
		// 2) Using StringBuilder class.
		for(String w:words)  //Rahul
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();    // luhaR
			ReverseString += sb.toString()+" ";  //luhaR
		}
		System.out.println(ReverseString); 
	}
}
