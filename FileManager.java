package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	/**
	 * This method will return the list of files from a given folder .
	 * @param folder
	 * @return
	 */
	public static List<String> getAllFiles(String folderpath)
	{
		// Creating file object
		File f1 = new File(folderpath);
		
		// Getting all files into fileArray
		File[] listOfFiles = f1.listFiles();
		
		// Creating List to store file Names
		List<String> filenames = new ArrayList<String>();
		
		for(File f:listOfFiles)
			filenames.add(f.getName());
		
		return filenames;
		
	}
	
	/**
	 * This method will create file and Append content in it .
	 * @param folderpath
	 * @param filename
	 * @param content
	 * @return
	 */
	public static boolean createFiles(String folderpath , String filename, List<String> content )
	{
		try
		{
			File f1 = new File(folderpath , filename);
			FileWriter fw = new FileWriter(f1);
			
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			
			fw.close();
			return true;
			
		}
		catch(Exception E)
		{
			return false;
		}
		
		
	}
	
	/**
	 * This method is used to delete the file from the given folder .
	 * @param folderpath
	 * @param filename
	 * @return
	 */
	public static boolean deleteFile(String folderpath , String filename)
	{
		
	File f1 = new File(folderpath+"\\"+filename);
	
	try 
	{
		if(f1.delete())
			return true;
		else
			return false;
		
	}
	catch(Exception E)
	{
		return false;
	}
	}
	
	/**
	 * This method is used to search a file form the given folder .
	 * @param folderpath
	 * @param filename
	 * @return
	 */
	public static boolean searchFile(String folderpath , String filename)
	{
		
	File f1 = new File(folderpath+"\\"+filename);
	
	try 
	{
		if(f1.exists())
			return true;
		else
			return false;
		
	}
	catch(Exception E)
	{
		return false;
	}
	}
	
		

}
