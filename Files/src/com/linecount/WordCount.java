package com.linecount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public static void main(String args[]) {
		BufferedReader reader = null;
		// initialise wordcount
		int wordCount = 0;
		
		try {
			reader = new BufferedReader(new FileReader("P:/Users/manasab/Desktop/new.txt"));
			// reading the first line into current line
			String currentLine = reader.readLine();
			
			
			while (currentLine != null) {
				String words[] = currentLine.split(" ");
				// updating wordcount
				wordCount = wordCount + words.length;
				currentLine = reader.readLine();
			}
			System.out.println("Number of words=" + wordCount);
		} 
		
		
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
