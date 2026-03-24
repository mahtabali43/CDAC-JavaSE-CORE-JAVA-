package oops.nestedclasses;

 class Cars {
      
	private String color;
	private long price;
	private boolean b = false;
	
    public void set(String color, long price) {
    	this.color = color;
    	this.price = price;
    }
    
    public void disp() {
    	System.out.println("Color: "+ color + ", Price: "+ price);
    }
    
    public class Engine{
    	
    	public void start() {
    		
    			b = true;
    			System.out.println("Engine Started...");
    		
    	}
    	
    	public void stop() {
    		
    			b = false;
    			System.out.println("Engine Stopped...");
    		
    	}
    	
    	
    }
    
	
}
 
 
 public class Car{
	 public static void main(String[] args) {
		 // Outer class
		Cars c = new Cars();
		c.set("Blue", 1000000);
		c.disp();
		
		// Inner Class
		
		Cars.Engine e = c.new Engine();
		e.start();
		e.stop();
		
	}
 }
