package mar_2_2026;

public class MidtermActivity2Pt1{

    public static void main(String[] args) {

        System.out.println("--- PART I: Q1 (Bitwise Operators) ---");
        boolean bitBool1 = true, bitBool2 = false;
        int bitNum1 = 14, bitNum2 = 11; // 1110 & 1011 = 1010 (10)
        int bitNum3 = 7, bitNum4 = 8;   // 0111 | 1000 = 1111 (15)

        System.out.println(bitBool1 ^ bitBool2); // true
        System.out.println(bitNum1 & bitNum2);   // 10
        System.out.println(bitBool1 & bitBool2); // false
        System.out.println(bitNum3 | bitNum4);   // 15


        System.out.println("\n--- PART I: Q2 (Ternary Operator) ---");
        int t1 = 5, t2 = 10;
        
        System.out.println((t1 < t2) ? true : false); // true
        System.out.println((t1 > t2) ? true : false); // false
        System.out.println((t1 == 5) ? 25 : 0);       // 25
        System.out.println((t2 == 10) ? 30 : 0);      // 30


        System.out.println("\n--- PART I: Q3 (Assignment Operators) ---");
        int addVar = 100;
        addVar += 20;
        System.out.println("Addition: " + addVar); // Addition: 120

        int subVar = 100;
        subVar -= 30;
        System.out.println("Subtraction: " + subVar); // Subtraction: 70

        int multVar = 12;
        multVar *= 12;
        System.out.println("Multiplication: " + multVar); // Multiplication: 144

        int divVar = 64;
        divVar /= 4;
        System.out.println("Division: " + divVar); // Division: 16


        
    }
}
