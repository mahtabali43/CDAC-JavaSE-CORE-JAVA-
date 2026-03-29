package iostream.Serialization.basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization1 {
    public static void main(String[] args) throws Exception {
    	Animal a = new Animal("Cat", "Four", 3);
    	File f = new File("SerializedFile.txt");
    	FileOutputStream fos = new FileOutputStream(f);
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
//    	System.out.println(oos.hashCode());  // returns hashcode of object
    	oos.writeObject(a);
    	System.out.println("End...");
    	oos.close();
    	fos.close();
	}
	
	
}
