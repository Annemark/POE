package lesson1;

import java.util.Scanner;
/**
 * 
 * @author louis
 *
 */
public class TableManager {
	/**
	 * declarerTableau
	 * @param {int} i : la grandeur du tableau
	 * @return {int[]} : mon nouveau tableau 
	 */
	public static int[] declarerTableau(int taille) {
		return new int[taille];
	}
	
	/**
	 * initialisationDuTableauAvecEntreesDuClient
	 * @param {int[]}  tb : le tableau à initialiser
	 * @return {int[]}  tb : le tableau initialisé
	 */
	public static int[] initialisationDuTableauAvecEntreesDuClient(int tb[]){// trois éléments pour définir une méthde, le nom, les types des paramères et le type de retour.
		int[] entree = {1, 2, 4, 3};
		return entree;
		/*System.out.println("Saississez 4 valeurs pour votre tableau");//Initialiser la tableau avec des valeur entrée par l'utilisateur.
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tb.length; i++) {
			System.out.println(" valeur numéro " + (i+1)+":");
			tb[i] = sc.nextInt();			
		}
		return tb;*/
	}
			
	/**
	 * afficherLeTableau
	 * @param {int[]} tbb : le tableau à afficher
	 */
	public static void afficherLeTableau(int tbb[]) {
		for(int i = 0; i < tbb.length; i++)
		{
		  System.out.print("\t"+tbb[i]);
		  
		}
		System.out.println();
	}
	public static int[] ordonnerLeTableauDuPlusGrandAuPlusPetit(int tb[]) {
		for(int i = 0; i < tb.length-1; i++) {
			int temp;
			if (tb[i] < tb[i+1]) {
				temp = tb[i+1];
				tb[i+1] = tb[i];	
				tb[i] = temp;
				i = -1;
			}
		}
		return tb;
	}
	
	/**
	 * ordonnerLeTableauDuPlusPetitAuPlusGrand1
	 * @param tb
	 * @return
	 */
	public static int[] ordonnerLeTableauDuPlusPetitAuPlusGrand1(int tb[]) {
		for(int i = 0; i < tb.length-1; i++) {
			int temp;
			if (tb[i] > tb[i+1]) {
				temp = tb[i+1];
				tb[i+1] = tb[i];	
				tb[i] = temp;
				i = -1;
			}
		}
		return tb;
	}
	
	/**
	 * ordonnerLeTableauDuPlusPetitAuPlusGrand2
	 * @param tb
	 * @return
	 */
	public static int[] ordonnerLeTableauDuPlusPetitAuPlusGrand2(int tb[]) {
		System.out.println("tb dans ordonnerLeTableauDuPlusPetitAuPlusGrand2 =");afficherLeTableau(tb);
		//dans cette méthode, on cherche à retourner l'inverse d'un tableau.
		//par exemple : {1, 2, 4, 3} --> {3, 4, 2, 1}
		//par exemple : {1, 2, 3, 4} --> {4, 3, 2, 1}
		//par exemple : {4, 3, 2, 1} --> {1, 2, 3, 4}
		
	
		//pour faire ça:
		//1. déclarer un nouveau tableau de la même taille que le tableau d'origine
		int newTb[] = declarerTableau(tb.length);
	
		
		//2. parcourir l'ancien tableau pour remplir en même temps le nouveau tableau 
		
		
		//à bien ranger la valeur du premier tableau au bon bon endroit dans le 2eme tableau
		//premiere façon de le faire : (pas optimisé)
		/*int newI = 0;
		for (int i = tb.length - 1; i >=0 && newI <tb.length; i--){
			newTb[newI] = tb[i];	
			newI++; 
		}*/
		
		//2eme façon de le faire : (sans utiliser d'autre index)
		int taille = tb.length;
		for (int i = tb.length - 1; i >= 0; i--){
			newTb[taille-i-1] = tb[i];
		}
		
		//3eme façon de le faire :
		/*int temp;
		int taille2 = tb.length;
		for (int i = 0; i <= tb.length/2-1; i++){
			temp = tb[i];
			tb[i] = tb[taille2-i-1];
			tb[taille2-i-1] = temp;
		}*/

		//indexes: 0, 1, 2, 3, 4, 	5, 		6, 7, 8, 9,  10
		//valeurs: 1, 2, 3, 4, 5, 	6, 		7, 8, 9, 10, 11
		
		//indexes: 0, 1, 2, 3, 4, 5, 		6, 7, 8, 9,  10, 11
		//valeurs: 1, 2, 3, 4, 5, 6, 		7, 8, 9, 10, 11, 12
		return tb;//3. retourner notre nouveau tableau
		
	}
	public static int[] laValeurMaxDuTableau(int tb[]) {
		int i = 0;
		int iMax = tb[i];
		for ( i = 0; i < tb.length; i++) {
	        if(iMax < tb[i]){
	        	iMax = tb[i];
	        }
		}
		return tb;
		
	}
	
	public static int[] laValeurMinDuTableau(int tb[]) {
		int i = 0;
		int iMin = tb[i];
		for (i = 0; i < tb.length; i++) {
	        if(iMin< tb[i]){
	        	iMin = tb[i];
	        }
		}
		return tb;
	}
}

		
	
		

	
	

    
