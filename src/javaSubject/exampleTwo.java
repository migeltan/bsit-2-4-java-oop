package javaSubject;

public class exampleTwo {

	    static String brand = "Toyota";
	    String model;

	    public void startEngine() {
	        int year = 2023;
	        String model = "Truck";
	        
	        System.out.println(brand + " " + model + " " + year);
	    }

	    public static void main(String[] args) {
	        
	        exampleTwo e1 = new exampleTwo();
	        exampleTwo e2 = new exampleTwo();

	        e1.model = "Vios";
	        e2.model = "Mitsubshi";

	        e1.startEngine();
	        e2.startEngine();
	    }
	}
