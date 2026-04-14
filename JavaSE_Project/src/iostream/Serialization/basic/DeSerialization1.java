package iostream.Serialization.basic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization1 {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		BufferedInputStream br = new BufferedInputStream(new FileInputStream("SerializedFile.txt"));
		ObjectInputStream ois = new ObjectInputStream(br);
		  Animal a =(Animal) (ois.readObject());
		  System.out.println(a);
		  br.close();
		  ois.close();
	}
	
}



       