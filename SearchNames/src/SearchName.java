
import java.util.Scanner;
public class SearchName {

	public static void main(String args[])
	{
		int n,i=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of names ");
		n=scanner.nextInt();
		String names[]=new String[10];
		System.out.println("Enter the names ");
		while(n>=0)
		{
			names[i]=scanner.nextLine();
			i++;
			n--;
			
		}
		//comparing key with string names
		String key="kay";
			if(names[0].equals(key))
			{
				System.out.println("Found");
				
			}
			else
			{
				System.out.println("Not Found");
			}
		//}
		
		
		
	
	}
}
