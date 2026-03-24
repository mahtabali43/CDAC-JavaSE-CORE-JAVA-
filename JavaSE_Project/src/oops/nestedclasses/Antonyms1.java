package oops.nestedclasses;

abstract class Bus{
	abstract public void speed();
}


public class Antonyms1 {
      public static void main(String[] args) {
		Bus b = new Bus() {
			public void speed() {
				System.out.println("Speed is 100km");
			}
		};
		b.speed();
	}
}
