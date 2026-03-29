


//4. Write a Java program to find the longest word in a text file

package iostream.Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LongesWord  {

	
		public static void main(String[] args) throws IOException {
			File f = new File("Numbering.txt");
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mahta\\git\\repository3\\JavaSE_Project\\src\\iostream\\Assignment\\LongesWord.java"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			
			// lines
			String line=null;
			int l=0,count=0;
			System.out.println("Started");
			while((line=br.readLine())!=null) {
			
				String[] s = line.split("\\s+");
				for(String a : s) {
					count+= a.length();
				}
				
			}
			System.out.println("Number of Words: "+ count);
			bw.close();
			System.out.println("Executed...");
		}
		
	}

	
	
	
	

