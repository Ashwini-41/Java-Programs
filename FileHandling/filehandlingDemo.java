package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandlingDemo {

	
	static File file = new File("C:\\VS code programs\\Programs\\FileHandling\\test.txt");

	public static void createFile() {
		// File file = new File("C:\\Users\\ashwi\\eclipse-workspace\\Programs\\src\\Filehandling\\test.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("File created " + file.getName());
			}else {
				System.out.println("File exist" + file.getName());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(file.getAbsolutePath());
	}
 
	public static void getFileInformation() {
		File file = new File("C:\\VS code programs\\Programs\\FileHandling\\test.txt");
		if(file.exists()) {
			System.out.println("File name " + file.getName());
			System.out.println("Readable" + file.canRead());
			System.out.println("Writable " + file.canWrite());
			System.out.println("Executable " + file.canExecute());
			System.out.println("Äbsolute path " + file.getAbsolutePath());
			System.out.println("path " + file.getPath());
			System.out.println("Characters of file " + file.length());
			System.out.println("Parent " + file.getParent());
		}
	}
	
	public static void writingToFile() {
		// File file = new File("C:\\Users\\ashwi\\eclipse-workspace\\Programs\\src\\Filehandling\\test.txt");
        try {
        	FileWriter fileWriter = new FileWriter(file);
        	String contentFile = "Hello all of you Good Morning!! My name is Ashwini Garad ";
        	fileWriter.write(contentFile);
        	fileWriter.close();
        }catch(IOException e) {
        	e.printStackTrace();
        }
	}
	
	public static void readFile() {
	  //File file = new File("C:\\Users\\ashwi\\eclipse-workspace\\Programs\\src\\Filehandling\\test.txt");
      try {
    	  Scanner sc = new Scanner(file);
    	  while(sc.hasNext()) {
    		  String readLine = sc.nextLine();
    		  System.out.println(readLine);
    	  }
    	  sc.close();
      }catch(FileNotFoundException e) {
    	  e.printStackTrace();
      }
	}
	
	public static void deleteFile() {
		try {
			if(file.delete()) {
		    	System.out.println("deleted file succesfully!");
		    }else {
		    	throw new Exception("File is already deleted");
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	createFile();
    getFileInformation();
    writingToFile();
    readFile();
    deleteFile();
    
    
    
   
	}

}
