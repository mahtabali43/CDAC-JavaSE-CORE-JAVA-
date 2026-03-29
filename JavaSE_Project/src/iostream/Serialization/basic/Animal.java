package iostream.Serialization.basic;

import java.io.Serializable;

public class Animal implements Serializable{
        private String name;
        private String legs;
        private int age;
        
        public Animal(String name, String legs, int age) {
        	this.name = name;
        	this.age = age;
        	this.legs = legs;
        }
        
        public void disp() {
        	System.out.println("Name: "+name+", Age: "+age+", Legs: "+ legs);
        }
        
}
