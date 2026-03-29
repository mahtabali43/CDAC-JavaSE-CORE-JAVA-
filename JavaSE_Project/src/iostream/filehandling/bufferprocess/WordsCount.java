package iostream.filehandling.bufferprocess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WordsCount {

	public static void main(String[] args) throws IOException {
		File f = new File("Abcd.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line;
		int count=0, max=-1;
		while((line=br.readLine())!=null) {
			
			String[] words = line.split("\\s+");  // splitting String in words using split() method.
			for(String w : words) {
			   count=w.length();
			   if(count>max) {  // finding maximum length word and storing in the count.
				   max=count;
			   }
			}
			for(String w : words) {
				   
				   if(w.length()==max) {
					   System.out.println("'"+w+ "' is with max length = "+ max);  // printing word with max count
					   bw.close();
						br.close();
					   return;
				   }
				  
				}
		}
		
		
		System.out.println("There is no word in the File...");
		
		bw.close();
		br.close();
	}
	
}
