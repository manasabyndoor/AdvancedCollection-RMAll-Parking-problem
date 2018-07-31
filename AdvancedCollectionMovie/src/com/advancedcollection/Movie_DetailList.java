package com.advancedcollection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;




public class Movie_DetailList {
	Set<Movie_Details> set = new LinkedHashSet<>();

	
	
	public void remove_movie(String movie_name)
	{
		Predicate<Movie_Details> delMovie=Movie_Details->Movie_Details.getMov_name().equals(movie_name);
		set.remove(delMovie);
		
	}
	public void removeAll()
	{
		set.removeAll(set);
		System.out.println("Removed");
		
	}

	public void add_movie(Movie_Details movie_name) {
		set.add(movie_name);
		System.out.println(movie_name.getMov_name()+" added");
		
	}
	public boolean findByName(String Movie_name)
	{
		Predicate<Movie_Details> findmovie=Movie_Details->Movie_Details.getMov_name().equals(Movie_name);
		return set.stream().anyMatch(findmovie);
	}
	public boolean findByGenre(String genre) {
		Predicate<Movie_Details> findmovie=Movie_Details->Movie_Details.getGenre().equals(genre);
		return set.stream().anyMatch(findmovie);
	}
	public void display()
	{
		Consumer<Movie_Details> disp=Movie_Details->System.out.println(Movie_Details);
		set.stream().forEach(disp);
	}
	
	
}
