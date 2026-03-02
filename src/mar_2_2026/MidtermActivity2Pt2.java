package mar_2_2026;

public class MidtermActivity2Pt2 {
	public static void main(String[] args) {
	System.out.println("\n--- PART II: 6 Unique Outputs ---");
    
    int trickVal = 13;
    int trickResult = trickVal++ + ++trickVal; 
    System.out.println(trickResult); 


    int valM = 55, valN = 49;
    boolean checkLimits = (valN < valM) && (valM != 999); 
    System.out.println(checkLimits); 

    
    int shiftBase = 17;
    int shiftResult = shiftBase << 2; 
    System.out.println(shiftResult); 

    
    int modBase = 89, modDivisor = 22;
    int remainder = modBase % modDivisor; 
    System.out.println(remainder); 

  
    int valP = 27, valQ = 41;
    boolean isDifferenceLarge = (valQ - valP) >= 19; 
    System.out.println(isDifferenceLarge); 

   
    int valR = 108, standardDivisor = 3;
    int mathResult = valR / standardDivisor;
    System.out.println(mathResult); 
    
}
}
