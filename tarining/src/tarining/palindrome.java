package tarining;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		int sum = 0;
		int num = number;
		//to calculate sum
		while (num != 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (sum == number)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
