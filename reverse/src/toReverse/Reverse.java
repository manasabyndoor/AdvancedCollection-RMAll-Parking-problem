package toReverse;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		System.out.println("Enter string");
		Scanner scan=new Scanner(System.in);
		
		String str = scan.nextLine();
		String reverse =" ";
		while(str==" ")
		{
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println("Reverse string");
		System.out.println(reverse);
		}
	}

}
