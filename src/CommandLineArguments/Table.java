package CommandLineArguments;

public class Table {
	public static void main(String[] x) {
		
		int no = Integer.parseInt(x[0]);
		for(int i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
	}
}
