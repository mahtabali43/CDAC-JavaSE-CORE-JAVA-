//2. Write a program to read the same program file and write it to other file with
//the lines number added before each line, starting from 1.

package iostream.Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddIndex {

	
		public static void main(String[] args) throws IOException {
			File f = new File("Numbering.txt");
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mahta\\git\\repository3\\JavaSE_Project\\src\\iostream\\Assignment\\Count.java"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			
			// lines
			String line=null;
			int l=0,i=1;
			while((line=br.readLine())!=null) {
				bw.write(i+" "+line);
				bw.newLine();
				i++;
			}
			
			bw.close();
			System.out.println("Executed...");
		}
		
	}

	
	
	
	

