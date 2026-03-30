package Collections.List.ArrayList.Comparator;

public class Employee {

	
	private String name;
	private int age;
	private int sl;
	
   public Employee(String name, int age, int sl) {
		this.name = name;
		this.age = age;
		this.sl = sl;
	}

   public String getName() {
	return name;
   }

   public int getAge() {
	return age;
   }

   public int getSl() {
	return sl;
   }

   @Override
   public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", sl=" + sl + "]";
   }
	
   
   
}
