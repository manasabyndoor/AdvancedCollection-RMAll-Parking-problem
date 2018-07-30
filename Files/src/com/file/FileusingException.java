package com.file;

import java.io.File;

public class FileusingException {

	public static void main(String args[])
	{
	boolean bool=false;
	File f=null;
	try
	{
		//creating new file
		f= new File("test.txt");
		bool=(f.exists());
		if(bool==true)
		{
			//delete 
			f.delete();
			System.out.println("Deleted");
			
		}
		bool=f.exists();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
