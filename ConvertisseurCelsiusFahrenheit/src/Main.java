import java.util.Scanner;

public class Main {
	/*
	 * Dans ce TP, on va faire un convertisseur de degrés Celcius <-> Fahrenheit
	 * 1. Bienvenue
	 * Nous affichons un message de bienvenue à notre utilisateur
		 * CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT
		 * -------------------------------------------------
	 * 2. Choix des options
	 * Le programme se lance et l'on demande à l'utilisateur de choisir si il veut convertir des Celcius en Fahrenheit ou des Fahrenheit en Celcius. Ce choix se fait en tapant 1 ou 2:
		 * Merci de choisir l'une des options suivantes :
		 * 1 - Celcius -> Fahrenheit
		 * 2 - Fahrenheit -> Celcius
		 * c - Crédit
		 * q - Exit
		 * 
		 * 
		 * 
		 * [valeur saisie]
	 * L'utilisateur doit choisir 1 ou 2 pour convertir. Il peut entrer "c" pour avoir les crédits ou "q" pour fermer le programme.
	 * Si "c", afficher les crédit puis 2. :
		 * Programme réalisé par Anni DUAN dans le codre de Travaux Pratiques java.
		 * Ce programme permet de convertir des °C et °F ainsi que des °F en °C.
		 * A noter :
		 * 		°C = (°F - 32) * 59 
		 * 		°F = 9/5* °C + 32
		 * 
		 * 
	 * Nous lui demandons de saisir l'une de ces options jusqu'à ce qu'il le fasse. Si l'utilisateur rentre une valeur différente des options proposées, on affiche le message suivant avec de retourner à la demande initiale :
	 	 * La valeur "[valeur saisie]" ne fait pas partie des options disponibles, merci de choisir une option valide
	 	 * 
	 	 * 
	 	 * 
	 * 3. Convertion
	 * Une fois l'option de conversion selectionnée, on demande à l'utilisateur de saisir la valeur à convertir
	 	 * Merci de saisir la valeur à convertir : [valeur saisie]
 	 * On affiche la valeur de la convertion :
 	 	 * [valeur saisie] °C = [valeur de la convertion] °F
 	 	 * OU
 	 	 * [valeur saisie] °F = [valeur de la convertion] °C
 	 	 * 
 	 	 * 
 	 	 * 
	 * 4. Continuer ?
	 * On demande à l'utilisateur si il souhaite continuer, ou aller au menu principal ou quitter
		 * Souhaitez-vous continuer avec ce mode de conversion ?
		 * y - Oui
		 * n - Non
		 * q - Exit
	 * Si "y", retour en 3.
	 * Si "n", retour en 2
	 * Si "q", fermer le programme
	 * 
	 * 
	 * Autrement, retour étape 4
	 */
	public static void main(String[] args) {
		runConverter();
	}

	private static void runConverter() {
		Scanner sc = new Scanner(System.in);
		String choix;
		welcomingMessage();//prototype : la définition de la méthode, nom , para, type de retour. ici, on retourne rien.
		do {
		    System.out.println("Choisissez le mode de conversion\n\t"
		    		+ "1 - Convertisseur Celsius -> Fahrenheit\n\t"
		    		+ "2 - Convertisseur Fahrenheit -> Celsius\n\t"
		    		+ "c - Credit\n\tq - Exit");
		    //sc.nextLine();
		    choix = sc.nextLine();
		    
		    if ("1".equals(choix) || "2".equals(choix)) {
		    	String choix1;
		    	double temperature;
			    do {
		    		System.out.println("Température à convertir");	
		    		temperature = sc.nextInt();
			    	if ("1".equals(choix)) {
			    		System.out.println(temperature + "°C coresspond à "+fahrenheitDegree(temperature) + "°F" );	
			       	} else if("2".equals(choix)) {
			    		System.out.println(temperature + "°F coresspond à "+ celsiusDegree(temperature) + "°C" );
				    }
			    	do {
			    		System.out.println("Souhaitez-vous continuer avec ce mode de conversion\n\t"
			    				+ "y - Oui\n\t"
			    				+ "n - Non\n\t"
			    				+ "q - Exit");	
			    		sc.nextLine();
			    		choix1 = sc.nextLine();
			    	}while(!"y".equals(choix1) && !"n".equals(choix1) && !"q".equals(choix1));
			    	if("q".equals(choix1)) {
			    		choix = "q";
			    	}
			    }while ("y".equals(choix1));
		    } else if("c".equals(choix)) {
		    	System.out.println("Programme réalisé par Anni DUAN dans le codre de Travaux Pratiques java.\n"
		    			+ "Ce programme permet de convertir des °C et °F ainsi que des °F en °C.\n"
		    			+ "A noter :\n\t"
		    			+ "°C = (°F - 32) * 59\n\t"
		    			+ "°F = 9/5* °C + 32");		
		    } else if("q".equals(choix)) {
		    	//do nothing
		    } else {
	    	    System.out.println("La valeur "+choix+" ne fait pas partie des options disponibles, merci de choisir une option valide");
	    	}   
		}while(!"q".equals(choix));

    	System.out.println("Au revoir");
	}
	
	private static double celsiusDegree(double temperature) {
		return (temperature - 32.0)*5.0/9.0;
	}

	private static double fahrenheitDegree(double temperature) {
		return 9.0/5.0*temperature + 32.0;
	}

	private static void welcomingMessage() {
	    System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
	    System.out.println("-------------------------------------------------");
	    
	    /*
		String welcomingMessage = "CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT";
		System.out.println(welcomingMessage);
		for (int i = 0; i < welcomingMessage.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
		*/
	}

}
