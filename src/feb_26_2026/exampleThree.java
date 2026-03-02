package feb_26_2026;

public class exampleThree {
	public static void main(String[] args) {
		

		int x = 55;
		int y = 52;
		int z = 33;
		int a = 28;
		int b = 41;

		System.out.println(a++ + --b); //28 + 40 = 68   a = 29 |  b = 40
		System.out.println(++x + ++y); //56 + 53 = 109  x = 56 |  y = 53 
		System.out.println(++z + a--); //34 + 29 = 63   z = 34 |  a = 28
		System.out.println(--b + ++x); //39 + 57 = 96   b = 39 |  x = 57
		System.out.println(y++ + --z); //53 + 33 = 86   y = 54 |  z = 33
		System.out.println(++a + ++b); //29 + 40 = 69   a = 29 |  b = 40
		System.out.println(x++ + --y); //57 + 53 = 110  x = 58 |  y = 53
		System.out.println(++z - ++a); //34 - 30 = 4    z = 34 |  a = 30
		System.out.println(b++ + --x); //40 + 57 = 97   b = 41 |  x = 57 
		System.out.println(y++ + --z); //53 + 33 = 86   y = 54 |  z = 33
	}
		
}
