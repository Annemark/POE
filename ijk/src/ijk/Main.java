package ijk;

public class Main {

	public static void main(String[] args) {
		
		import java.util.Scanner;

		public class Main {
		  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Saisissez un entier : ");
		    int i = sc.nextInt();
		    System.out.println("Saisissez une chaîne : ");
		    //On vide la ligne avant d'en lire une autre
		    sc.nextLine();
		    String str = sc.nextLine();      
		    System.out.println("FIN ! ");
		  }
		}
		
		
		
		
		
		
		
		
		
		//Déclaration des variables
		//déclarer des 3 variables entière
		int i = 0;
		int j = 0;
		int k = 0;
		
		//Afficher les varibales comme ça:
			//"nom de la variable = valeur de la variable"-appel de méthode
		afficherLesTroisVariblesEntieres(i, j , k );
		
		//Initialisation des variables
		//dire que la 1ere = 2
		//dire que la 2eme = 3
		//dire que la 3eme = 4
		i = 2;
		j = 3;
		k = 4;
		
		//afficher les variables
		afficherLesTroisVariblesEntieres(i, j , k );
		
		//En fait, on s'en fiche de la 2eme variable
		//Ce qu'on veut, c'est échanger les valeurs de la 1ere et de la 3eme variable
		j = i;
		i = k;
		k = j;
		
		//afficher les variables
		afficherLesTroisVariblesEntieres(i, j , k );
	
		//factoriser le code d'affichage des variables pour éviter la "redondance de code"
	}	
	public static void afficherLesTroisVariblesEntieres(int i2, int j2, int k2){
		System.out.println(i2 +"\n"+ j2+"\n"+ k2 + "\n");
	}
}
