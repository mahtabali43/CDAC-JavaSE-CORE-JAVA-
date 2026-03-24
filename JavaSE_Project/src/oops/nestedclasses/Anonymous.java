package oops.nestedclasses;

class Plane {
	private int speed;
	private int people;
	
    public void fly() {
    	System.out.println("Airplane flying...");
    }
	
}

public class Anonymous {
        public static void main(String[] args) {
			Plane p = new Plane()
					{
				public void fly() {
					System.out.println("Not flying...");
				}
					};
		    p.fly();
		}
}
