package oops.nestedclasses;

class Pen{
	private String color;
	private int price;
	
	 public void set(String color, int price) {
		 this.color = color;
		 this.price = price;
	 }
	 public void disp() {
		 System.out.println("Color: "+color+", Price: "+price);
	 }
	static class Pen1{
		 private String name;
		 public void set(String name) {
			 this.name = name;
		 }
		 public void disp() {
			 System.out.println("Name of pen is: "+ name);
		 }
	 }
	
}

public class Static_nested {
	public static void main(String[] args) {
		Pen p = new Pen();
	       Pen.Pen1 p1 = new Pen.Pen1();
	       p.set("Blue", 20);
	       p.disp();
	       p1.set("ButterFlow");
	       p1.disp();
	       
	}
       
}
