package iostream.Serialization.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization1 {
 
	public static void main(String[] args) throws Exception {
		FileInputStream fos = new FileInputStream("SerializedFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fos);
		     Animal a1 = (Animal)ois.readObject();
		     a1.disp();
		
	}
	
}
