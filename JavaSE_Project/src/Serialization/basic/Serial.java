package Serialization.basic;

import java.io.*;

public class Serial {

	public static void main(String[] args) throws IOException{
		Person p = new Person("MAHTAB ALI", 23, "INDIA");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
		System.out.println("Serilization has completed...");
	}
	
}
