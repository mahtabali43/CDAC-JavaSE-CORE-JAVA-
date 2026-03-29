package iostream.filehandling.bufferprocess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
  
	public static void main(String[] args) throws IOException {
	   File f = new File("abc.txt");
//		FileWriter fw = new FileWriter(f,true);
//		BufferedWriter bw = new BufferedWriter(fw);  // Wrapping the buffer for best performance
		
	   BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
//	   char [] b = {'a','b','c'};
//		bw.write(b);
//	   System.out.println(bw.equals(bw)); // equals always compare containts
	   String s = "Hey g how are you and what are u doing in these days in your life\n";
//	   bw.write("This is Buffer Reader");
	   bw.write(s);
		System.out.println("Executed...");
		bw.close();
	}
	
}
