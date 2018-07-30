package com.file;

import java.io.File;

public class FileIO {
	public static void main(String args[])
	{
		
		File f=new File("P:/Users/manasab/Desktop/new.txt");
		System.out.println(f+(f.exists()?"is found" : "is missing"));//f.exists() if file is present or not
	}

}
