package iostream.Serialization.basic;

import java.io.*;

public class Person implements Serializable{

	private String name;
	private int age;
	private String add;
	public Person(String name, int age, String add) {
		
		this.name = name;
		this.age = age;
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void disp() {
		System.out.println("Name: "+name+ ", Age:"+age+", Address: "+add);
	}
	
	
	
}
