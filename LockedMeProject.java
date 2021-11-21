package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;



public class LockedMeProject {
	public static final String folderpath ="D:\\Fullstack\\Learning_Projects\\LockedMeProjects";
	
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int inputcase;
	     int terminateflag = 0;
		 
	      do {
	    	  displayMenu();
	    	  System.out.println("Enter your choice :");
	    	  inputcase = Integer.parseInt(sc.nextLine());
	    	  
	    	  switch(inputcase) {
	    	  
	    	  case 1: // Display all files in main Folder in asscending order .
	    		  sortedFilesInAsscending();
	    		  break;
	    		  
	    	  case 2: // File Operations
	    		  System.out.println("Business Operations \n");
	    		  fileoperations();
	    		  break;
	    		  
	    	  case 3:  // Terminate The Applications .
	    		  System.out.println("Application Terminated Sucessfully !!");
	    		  System.exit(0);
	    		  break;
	    		  
	    	  default :
	    		  System.out.println("Enter choice correctly and retry .... \n\n");
	    	  
	    	  }
	    	   		  
	      } while(inputcase > 0);
	   
	}
	
	
	/**
	 * Sorted Files list in Asscending order .
	 */
	public static void sortedFilesInAsscending()
	{
		  List<String> fileslist = new ArrayList();
		  fileslist= FileManager.getAllFiles(folderpath);
		  
		  Collections.sort(fileslist);
		  System.out.println("List of Files in the Asscending order :");
		  for(String s:fileslist)
			  System.out.println(s);
	}
	
	/**
	 * Create and add content into file .
	 */
	public static void createFile()
	{
		
		Scanner sc = new Scanner(System.in);
		// Number of lines of content add into file .
		int linescount ;
		List<String> content = new ArrayList<String>();
		String filename;			
		// Read filename from user
		System.out.println("Enter the file name :");
		filename = sc.nextLine();
		
		// Read number of linescount from user
		System.out.println("Enter the number of linescount that it to entered into the file");
		//linescount = sc.nextInt();
		linescount = Integer.parseInt(sc.nextLine());
		
		// Read the content from the user .
		for(int i=1;i <= linescount;i++)
		{
			System.out.println("Enter line "+i+" :");
			content.add(sc.nextLine());
			
		}
		
		boolean issaved = FileManager.createFiles(folderpath, filename, content);
		
		if(issaved)
			System.out.println("File and data saved sucessfully ");
		else
			System.out.println("File not saved , please contact admin admin@lockedme.com  ?? ");
		
	}
	
	/**
	 * Deleting file
	 */
	public static void deleteFile()
	{
		
		Scanner sc = new Scanner(System.in);
		String filename ;
		System.out.println("Enter filename to delete :");
	    filename = sc.next();
	    boolean isDeleted = FileManager.deleteFile(folderpath, filename);
		
		if(isDeleted)
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
		
	}
	
	/**
	 * Search file in folder .
	 */
	public static void searchFile()
	{
		Scanner sc = new Scanner(System.in);
		String filename ;
		
		System.out.println("Enter filename to  search :");
	    filename = sc.next();
		boolean isFound = FileManager.searchFile(folderpath, filename);
		
		if(isFound)
        {
            System.out.println("File Found successfully");
        }
        else
        {
            System.out.println("File is not present in the current folder");
        }
	}

	
	/**
	 * File operations
	 * @return 1 to Terminate the application .
	 */
	public static void fileoperations() {
		int inputCase = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(" \n 1. Add file\n 2. Delete file\n 3. Search file . \n 4. Return to previous menu :\n 5. Terminate the Application \n");
			System.out.println("************************************************************************************************");
			System.out.println("Enter your choice :");
			
			inputCase = Integer.parseInt(sc.nextLine());
			switch(inputCase) {
			case 1: //Creation of File and save data .
				createFile();
				break;
				
			case 2: // Deletion of File from the given folder.
				deleteFile();
				break;
				
			case 3: // Search File in folder.
				searchFile();
				break;
				
			case 4: // Return to Previous Menu
				System.out.println("Back to Main Menu");
				return ;
				
			case 5:  // Terminate the application .
				System.out.println("Application Terminated Sucessfully !!");
				System.exit(0);
				
			default :
				System.out.println(" Enter choice correctly and retry ..... \n");
				break;
			}
			
		}while(true) ;
		
	}
	
	public static void displayMenu()
	{
		 System.out.println("************************************************************************************************");
		 System.out.println("\t\t\t\t\t LockedMe.com");
		 System.out.println("************************************************************************************************");
		 System.out.println("\t\t\t\t \t\t\t \tDeveloper: Rajashekhar Kurva");
		 System.out.println("************************************************************************************************");
		 System.out.println("Main context :\n\n 1. Display Files in asscending order \n 2. Business Operations \n 3. Terminate the Application\n");
		 System.out.println("************************************************************************************************");
	      
	}
	

	

}



	
	






