/*
Split a String into Words
Description: Split a string into words.
Input: "hello world"
Output: ["hello", "world"]
*/
package String_Programs;
import java.util.*;
public class SplitStringIntoWords {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = xyz.nextLine();
		

		//USING SPLIT METHOD
        String[] words = str.split(" ");

        System.out.print("[");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) { // skip empty strings if multiple spaces
                System.out.print("\"" + words[i] + "\"");
            }
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

		//MANUAL lOGIC 
//		String word = "";
//        System.out.println("Words are: ");
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (ch != ' ') {
//                word = word + ch;
//            } else {
//                if (word.length() > 0) {
//                    System.out.println(word);
//                    word = ""; // reset for next word
//                }
//            }
//        }
//
//        // Print last word if present
//        if (word.length() > 0) {
//            System.out.println(word);
//        }
	}
}
