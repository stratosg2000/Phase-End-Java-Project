package filemagic.service.com;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileMagicMainService {

	public void magicListFiles(Scanner scanner) {
		// TODO Auto-generated method stub
		
		String directoryPath;
				
		System.out.println("Please provide the path of the directory for file listing: ");
		System.out.println("An example of a path is : C:\\Users\\strat\\eclipse-workspace\\ProjectDir");
		directoryPath = scanner.nextLine();
	    
		System.out.println( " ########################################## " );
		System.out.println( "The provided directory is : " +directoryPath );
		
		
	    File directory = new File(directoryPath);

		 // check if the provided folder exists     
		 		 
	    if (directory.exists() && directory.isDirectory()) {
	            System.out.println("The directory " + directoryPath + " indeed exists.");
	            
	            	            
	        //  File folder = new File(directoryPath);
	    		File[] files = directory.listFiles();
	    		
	    		Arrays.sort(files);
	            System.out.println(" ----------------------------------------------" );
	    		System.out.println("Below is the list of files in ascending order: ");
	    			for (File file : files) {
	    					if (file.isFile()) {
	    						System.out.println(file.getName());
	    						}
	    		}
	    			
	    		System.out.println(" ----------------------------------------------" );
	    		        
	        	} else {
	            System.out.println("The directory " + directoryPath + " does not exist !" );
	        	}
	  System.out.println( " ########################################## " );      
	  }
		
}


