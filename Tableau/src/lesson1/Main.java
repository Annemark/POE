package lesson1;

/**
 * 
 * @author Annie
 * 
 *
 * {Main}  :
 */
public class Main {//La class Main est la classe principale d'un projet java

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {//la méthode main() est la méthode principale du programme
		
		//1. Déclaraion d'un tableau de type int d'une longeur de 4
		int tableau1[] = TableManager.declarerTableau(4);//new int[4];
				
		//2. Initialisation avec des valeurs rentrées par utilisateurs.
		tableau1 = TableManager.initialisationDuTableauAvecEntreesDuClient(tableau1);

		//3. Appel aux méthodes d'afficher le tableau.
		System.out.println("tab1");
		TableManager.afficherLeTableau(tableau1);
			// on appelle une méthode qui se trouve dans la class ' TableManager'
			//et qui s'appelle 'afficherLeTableau 
			//et qui prend en paramètre 'tableau1' de type int
		
		//4. Dans un 2eme tableau : ordonner les valeurs du 1er tableau du plus grand au plus petit
		int tableau2[] = TableManager.ordonnerLeTableauDuPlusGrandAuPlusPetit(tableau1);
		
		//5. Afficher le 2eme tableau
		System.out.println("tab2");
		TableManager.afficherLeTableau(tableau2);

		//6. Dans un 3eme tableau : ordonner les valeurs du plus petit au plus grand
			//6.1. Méthode 1: en utilisant le 1er tableau
		int tableau3[] = TableManager.ordonnerLeTableauDuPlusPetitAuPlusGrand1(tableau1);

		//7. Afficher le 3eme tableau
		System.out.println("tab3Methode1");
		TableManager.afficherLeTableau(tableau3);
		
		//6.2. Méthode 2: en utilisant le 2eme tableau
		tableau2[0] = 4;
		tableau2[1] = 3;
		tableau2[2] = 2;
		tableau2[3] = 1;
		tableau3 = TableManager.ordonnerLeTableauDuPlusPetitAuPlusGrand2(tableau2);
		
		//7. Afficher le 3eme tableau
		System.out.println("tab3Methode2");
		TableManager.afficherLeTableau(tableau3);
		

		
		
		//8. Récupérer la valeur max du tableau
			//puis afficher la valeur max du tableau
		
		
		//9. Récupérer la valeur min du tableau
			//puis afficher la valeur min du tableau
	
		
		//10. Faire la moyenne des valeurs du tableau
			//puis afficher la moyenne
		
		
		//11. Echanger les valeurs des indexs 'x' et 'y' d'un tableau
			//table = switchValue(x, y, table);
		
		
		//12. Afficher le tableau modifié
		
		
		//13. Faire la même chose (1 --> 12) avec des listes
		
	}

}
