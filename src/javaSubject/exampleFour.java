package javaSubject;

public class exampleFour {
	public static void main(String[] args) {
		
		int a = 2;
		int b = 2; 
		
		int min = (a<5) ? a : b;
		System.out.println(min); 
		
		int x = 5; 
		int y = 3; 
		
		System.out.println(x & y); // 5 = 0101 
		                           // 3 = 0011
		                           // AND = 0001 = 1 
		
		System.out.println(x | y); // 5 = 0101 
        						   // 3 = 0011
		                           // OR = 0111 = 7 
		
		int q = 5;
		
		if(++q < 10 & ++q > 3) { 
			System.out.println(q);
		}
		

	}
		
}
