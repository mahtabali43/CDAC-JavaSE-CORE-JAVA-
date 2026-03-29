//1. Write a Program to read the same program file and find the no. of lines, words
//and characters. Write the result in in to a text file (result.txt)

package iostream.Assignment;

import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Count {
   
	public static void main(String[] args) throws IOException {
		File f = new File("result.txt");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\mahta\\git\\repository3\\JavaSE_Project\\src\\iostream\\Assignment\\Count.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		// lines
		String line=null;
		int l=0, ch=0, w=0;
		while((line=br.readLine())!=null) {
			ch+=line.length();
			l++;
			String[] s = line.split("\\s+");
			for(String wr : s) {
				w++;
			}
		}
		
		bw.write("Number of Charactors: "+ ch);
		bw.newLine();
		bw.write("Number of Words: "+ w);
		bw.newLine();
		bw.write("Number of Lines: "+ l);
		
		bw.close();
		System.out.println("Executed...");
	}
	
}
