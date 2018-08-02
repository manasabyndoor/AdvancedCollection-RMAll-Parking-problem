package com.advancedcollection;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TsetClass { // test class

	public static void main(String args[]) { // main function

		Movie_DetailList movie1 = new Movie_DetailList();
		Scanner scanner = new Scanner(System.in);

		String movie_name = scanner.nextLine();

		movie1.add_movie(new Movie_Details("raazi", "acvc", "md", "horror"));
		movie1.add_movie(new Movie_Details("milana", "puneeeth", "md", "horror"));

		boolean findByName = movie1.findByName("Milana");// checking by name

		if (findByName) {
			System.out.println("Movie found");
		} else
			System.out.println("Not found");
		boolean findByGenre = movie1.findByGenre("Milana");

		if (findByName) {
			System.out.println("Movie found");
		} else
			System.out.println("Not found");
		movie1.remove_movie("Dangal");
		movie1.display();
	}
}