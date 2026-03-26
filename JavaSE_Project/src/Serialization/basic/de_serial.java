package Serialization.basic;

import java.io.*;

public class de_serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("abc.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		        Person p1 = (Person)ois.readObject();
		        p1.disp();
		System.out.println("De-Serialization done...");
	}

}
