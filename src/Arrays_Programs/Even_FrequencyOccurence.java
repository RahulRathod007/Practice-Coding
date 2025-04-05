/*Given No of Array consists of n elements you have  to print the elements which has appeared even number of times.
Input : 1 1 2 3 2 
Output: 1 2
*/
package Arrays_Programs;
import java.util.*;
public class Even_FrequencyOccurence {
	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = xyz.nextInt();
		int a[] = new int[size];
		//Inserting Array values
		System.out.println("Enter values in array :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = xyz.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
		// Counting frequency of each element
		for (int i = 0; i < a.length; i++) 
		{
			if (!map.containsKey(a[i])) // check whether the element is previously there or not
			{ 
			 map.put(a[i], 1); // not there in HashMap
			} 
			else 
			{
				// the element is already there in map
			 map.put(a[i], map.get(a[i]) + 1);
			}
		}
		// Printing elements with even frequencies
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			if (entry.getValue() % 2 == 0) 
			{
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
