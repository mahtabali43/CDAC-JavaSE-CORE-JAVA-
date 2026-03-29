package iostream.Serialization.basic;

import java.io.*;

public class Serial {

	public static void main(String[] args) throws IOException{
		Person p = new Person("MAHTAB ALI", 24, "Saharanpuriya,INDIA");
		FileOutputStream fos = new FileOutputStream("abc.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
		System.out.println("Serialization is done...");
	}
	
}
