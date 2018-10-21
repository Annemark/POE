/**
 * @author louis
 * La class Main est la classe principale d'un projet java
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Faire une superbe calculette
		projet1();
		projet2();
	}

	private static void projet2() {
		//Déclaraion et initialisation des variables
		double x1 = 5.0, y1 = 10.0, resultat3, resultat4;
		int x2 = 5, y2 = 10, resultat1, resultat2;
		
		//Appel aux méthodes de calcul
		// une moyenne de doubles qui retourne un int
		resultat1 = avgToInt(x1, y1);
		
		// une moyenne d'int qui retoune un int
		resultat2 = avgToInt(x2,y2);
		
		// une moyenne de double qui retoune un double
		resultat3 = avgToDouble(x1, y1);
		
		// une moyenne d'int qui retoune un double
		resultat4 = avgToDouble(x2, y2);

		//Affichage des resultats
		System.out.println(resultat1);
		System.out.println(resultat2);
		System.out.println(resultat3);
		System.out.println(resultat4);
		
	}
	
	private static int avgToInt(double x, double y){
		int resultat;
	    resultat = (int)((x + y)/2);
		return resultat;
	}

	private static int avgToInt(int x,int y) {
		int resultat;
	    resultat = (int)((x + y)/2);
		return resultat;
	
	}

	private static double avgToDouble(double x, double y) {
		return (x + y)/2;
	}

	private static double avgToDouble(int x, int y) {
       return ((double)x + (double)y)/2;
	}

	
	private static void projet1() {
		// pour écrire un "System.out.println();" on peut écrire "syso" et faire ctrl+espace
	
		String variable1 = "Hello world !";
		System.out.println(variable1);
		variable1 = "comment vas-tu ?";
		System.out.println(variable1);
		
		
		//déclaration des variables (ce sont des enregistrements de type "Person")
		Person person1 = new Person();
		Person person2 = new Person("Menin", "Valérian", 24, 185);
		
	
		// c'est pas bien car tout le monde a l'acces en modification à ces attributs sans control des données
		// normalemlent on doit faire avec les setters 
		person1.setPrenom("Anni");//On donne la valeur anni à l'attribut prenom de l'enregistrement person1
		person1.setNom("Duan");
		
		//affichage des informations
		System.out.println(person1.getPrenom());
		
		System.out.println(person1.nom);
		System.out.println(person1.age);
		System.out.println(person1.taille);
		
		person2.afficherInformations();
		
		
		int somme;
		somme=person1.age+person2.age;
		
		System.out.println(somme);		
		
		
		}
	}
	
	



