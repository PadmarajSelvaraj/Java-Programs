package JavaSimpleProrgrams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

import com.google.common.io.Files;

//import com.google.common.io.Files;

public class FileHandle {

public static void main(String[] args) {
				// TODO Auto-generated method stub
			
		 /* File creation
		  * 
		  *   File sk = new File("C:\\Users\\91725\\Desktop\\Practice");
		  boolean result =  sk.exists();
		  
		  System.out.println(result);
		    
		  if(result == false) {
			  
			  sk.mkdir(); */
	
	
	/* new file creation
	 * 
	 * File sk = new File("C:\\Users\\91725\\Desktop\\Practice\\java.xlsx");
	  boolean result =  sk.exists();
	  
	  System.out.println(result);
	    
	  if(result == false) {
		  
		  try {
			sk.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
		 }	*/	
	
	/* Deletion
	File sk = new File("C:\\Users\\91725\\Desktop\\Practice\\java.xlsx");
	sk.delete();  */
	
	/* File rename
	
	File sk = new File("C:\\Users\\91725\\Desktop\\Practice\\java.txt");
	File sk1 = new File("C:\\Users\\91725\\Desktop\\Practice\\Programs.txt");
	
	sk.renameTo(sk1); */
	
	//File sk1 = new File("C:\\Users\\91725\\Desktop\\Practice");
	
	// get abs path System.out.println(sk1.getAbsolutePath());
	
	// get file name System.out.println(sk1.getName());
	
	//System.out.println(sk1.canRead());
	
	//System.out.println(sk1.canWrite());
	/*
	List all the file in the folder ( Used lambdar expression)
	File sk1 = new File("C:\\Users\\91725\\Desktop\\Practice");
	String[] abc = sk1.list();
	List <String> ab = Arrays.asList(abc);
	
	ab.forEach(a->System.out.println(a));
	
	//Check filer or folder sk1.isFile();
	
	//Check filer or folder sk1.isDirectory(); */
	
	// aftr closing the file whatever we writing would reflect
	// For forced close use the flush
	 
	/*
	try {
		FileWriter writer = new FileWriter("C:\\Users\\91725\\Desktop\\Practice\\Programs.txt");
		BufferedWriter bf = new BufferedWriter(writer);
		   bf.write("Jave is a good Programming Language");
		   bf.newLine();
		   bf.write("I love programming");
		   bf.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
   
	 
	 try {
		FileReader rk = new FileReader("C:\\Users\\91725\\Desktop\\Practice\\Programs.txt");
	    BufferedReader be = new BufferedReader(rk);
	   String zk =  be.readLine();
	    while(zk!=null)
	    {
	    	
	    	System.out.println(zk);
	    	 zk =  be.readLine();
	    }
	 
	 } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  */
	
	File source = new File("D:\\Practice\\test.xlsx");
	File dest = new File("D:\\Practice\\copied\\Programs.xlsx");
   
	try {
		
		Files.copy(source, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
 }

}	






