package oops.nestedclasses;

interface Animal{
//	void speaks();  // non parameterized and void
//	void speaks(int i,int j);// parameterized and void
	int  add(int i,int j);
}

public class Lambaa {
	
	public static void main(String[] args) {
		Animal a = (int i,int j)->  i+j;
	    System.out.println("Addition is: "+a.add(5,7));
	}
	
}
