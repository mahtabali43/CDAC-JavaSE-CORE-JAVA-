package iostream.filehandling.bufferprocess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_Reader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		int c=0,i=0;
		String line;
		// read() used to read the characters, and readLine() used to 
		// read the total lines
		while((line=br.readLine())!=null) {
			i++;
		}
		System.out.println("Total charactors are: "+i);
		br.close();
	}
	
}
