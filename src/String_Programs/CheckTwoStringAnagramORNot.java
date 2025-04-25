package String_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckTwoStringAnagramORNot {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        
        boolean flag;
        
        if(s1.length()!=s2.length())
        {
        	flag = false ;
        }
        else
        {
        	flag = true;
        	char ch[] = s1.toCharArray();
            char ch1[] = s2.toCharArray();
            
            Arrays.sort(ch);
            Arrays.sort(ch1);
            
            for(int i=0;i<ch.length;i++)
            {
            	if(ch[i]!=ch1[i])
            	{
            		flag = false ;
            		break;
            	}
            }
        }
        if(flag)
        {
        	System.out.println("Anagram");
        }
        else
        {
        	System.out.println("Not Anagram");
        }
    }
}
