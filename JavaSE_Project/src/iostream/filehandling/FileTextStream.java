package iostream.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTextStream {

	public static void main(String[] args) throws IOException {
		File f = new File("ab.txt");
//		FileWriter fw = new FileWriter(f);
//		fw.write("My Name is Khan And i am not a CDACist1...");
//		fw.write("\nMy Name is Khan And i am not a CDACist2...");
//		fw.write("\nMy Name is Khan And i am not a CDACist3...");
//		fw.write("  My Name is Khan And i am not a CDACist...");
//		
//		System.out.println("Executed...");
//		fw.close();
		// Reading form itself and writting to destination...
//		FileWriter fw = new FileWriter("ab.txt", true); // Appending, it means if we run again this file, it will add the containt again in it
//		FileReader fr = new FileReader("C:\\Users\\mahta\\git\\repository3\\JavaSE_Project\\src\\iostream\\filehandling\\FileTextStream.java");
		FileReader fr = new FileReader("C:\\CDAC\\CDAC BANGALORE\\CCEE.txt");
		FileWriter fw = new FileWriter("ab.txt", true);
		
		
		int i=0,c=0;
		while( (i=fr.read()) != -1) {
			System.out.print((char)i+"="+i+",");	// read converts the each char to related ascii value
			fw.write(i);
			c++;
		}
		
		fr.close();
		
		System.out.println("Executed\n\n\n");
		FileReader fr1 = new FileReader("ab.txt");
		i = 0;
		c = 0;
		// to count all char
		while( (i=fr1.read()) != -1) {
			c++;
		}
		fw.write("Number of copied Char is "+ c);// it will print the total number of char present in the file...
		fw.close();
		fr.close();
		fr1.close();
	}
	
}
