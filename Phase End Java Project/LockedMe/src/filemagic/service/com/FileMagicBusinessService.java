package filemagic.service.com;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileMagicBusinessService {

	public void magicBusinness(Scanner scanner, String operation){
		// TODO Auto-generated method stub
		
		String businnessFileName; 
		String businessDirectoryPath;
		String backlash = "\\" ;
		String businnessFullPath;
		boolean directoryExists = false; 
		
		System.out.println( " ########################################## " );
		System.out.println( " You have enterned the mode of " +operation.toUpperCase()+  " your file");
		System.out.println( " Please provide the path of the directory in which you would like to work with.");
		System.out.println( " An example of a path is : C:\\Users\\strat\\eclipse-workspace\\ProjectDir");
		
		businessDirectoryPath = scanner.nextLine();
		File directory = new File(businessDirectoryPath);
		
		System.out.println( "The provided directory is : " +businessDirectoryPath );

		      // With the below code the program will check the existence of the provided folder      
				
	    if (directory.exists() && directory.isDirectory()) {
	            
	        	System.out.println(" The directory " + businessDirectoryPath + " indeed exists.");
	            System.out.println(" ----------------------------------------------" );
	            directoryExists = true;
	    } else {
                System.out.println(" The directory " + businessDirectoryPath + " does not exist !" );
        }
	            
	   	   // the below code is executed only if the user has provided a valid directory     
	   
	    if ( directoryExists== true){
		   
	  	        System.out.println(" Please provide the name of the filename  " );
	  	        businnessFileName = scanner.nextLine();
	    		System.out.println(" ----------------------------------------------" );
	            
	            
	    		businnessFullPath = businessDirectoryPath + backlash + businnessFileName;
	            System.out.println(" The full path is :" +businnessFullPath);
	            
	            File file = new File(businnessFullPath);
	            
	            
	    switch (operation) {
                case "creating":
                    createFile(file, businnessFileName, businessDirectoryPath);
                    break;

                case "deleting":
                    deleteFile(file, businnessFileName);
                    break;

                case "searching":
                    searchFile(file, businnessFileName, businessDirectoryPath);
                    break;

                default:
                    System.out.println(" Something gone wrong ... invalid input value in magicBusinness class ");
                    break;
            	}        
	    }
	}
	                
	         
	            
	    	private void createFile(File file, String fileName, String directoryPath) {
	    	  
         				if (file.exists()) {
         					System.out.println("File already exists.");
         					}else {
             
         						try {
         							// Create a new empty file in the given directory
         							boolean created = file.createNewFile();
         							if (created) {
         							System.out.println(" File " +fileName+ " has been created successfully in " + directoryPath );
         							}else{
         								System.out.println(" File creation failed.");
         							} 
         							}catch (IOException e){
         							System.out.println("An error occurred: " + e.getMessage());
         							}
         				System.out.println( " ########################################## " ); 
         					}		
	    	}
	       
	            
	            

				private void deleteFile(File file, String fileName){
	                       		if (file.exists()) {
	            				boolean deleted = file.delete();
	            				if (deleted) {
	            				System.out.println("File " +fileName+ " deleted successfully.");
	            				System.out.println( " ########################################## " );
	            				} else {
	            				System.out.println("File deletion failed.");
	            				System.out.println( " ########################################## " );
	            				}
	            		}else {
	            				System.out.println("File does not exist.");
	            				System.out.println( " ########################################## " );
	            		       }
	            }
	            

				
				
				
				private void searchFile(File file, String fileName, String directoryPath){
            				if (file.exists()) {
            				System.out.println("File " +fileName+ " found in directory " +directoryPath);
            				System.out.println( " ########################################## " );
            				} else {
            				System.out.println("File " +fileName+ " was NOT found in directory " +directoryPath);
                			System.out.println( " ########################################## " );
            				}
               
         }
	 }             
  





