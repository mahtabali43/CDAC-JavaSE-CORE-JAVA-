package Serialization.basic;

import java.io.*;

public class de_serial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Person p1 =(Person) ois.readObject();
		p1.disp();
		fis.close();
		ois.close();
		System.out.println("De_Serialization is Completed...");
	}

}
