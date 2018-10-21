import java.util.Scanner;
	
public class TryMyCode {

	
	public static void main(String[] args) {		
		moreOrLessVersion1();
	}

	private static void moreOrLessVersion1() {
		Scanner sc = new Scanner(System.in);
		 
	    System.out.println("Saisissez un code: ");
	    int secretCode = sc.nextInt();
	    int testValue = Integer.MIN_VALUE;
	    int tryTimes = 1;
	    
    	System.out.println("A votre avis, quel est le code ? ");
    	testValue = sc.nextInt();
    	
	    while(testValue!=secretCode)
	    {
	    	if (testValue<secretCode) {
	    		System.out.println("Il faut plus");	
	    	} else if (testValue>secretCode) {
	 	    	System.out.println("Il faut moins");
	        }
	    	
	    	System.out.println("Resaisir le code svp");
		    testValue = sc.nextInt();
		    tryTimes++;
		    
	    }
		System.out.println("Bravo! Vous avez trouvé");
		System.out.println("Vous avez trouve en "+tryTimes+" fois");
	}
	

	 
	

}


