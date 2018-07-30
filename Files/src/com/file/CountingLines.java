package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingLines {
	public static void main(String args[]) throws IOException {
		int lineCount = 0;

		BufferedReader reader = new BufferedReader(new FileReader("P:/Users/manasab/Desktop/new.txt"));//
		// call readline to count lines
		
		while (true) {
			String line = reader.readLine();

			if (line == null) {
				break;
			}
			lineCount++;

		}

		reader.close();
		System.out.println("Line count=  " + lineCount);
	}

}
