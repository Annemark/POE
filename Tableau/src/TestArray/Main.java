package TestArray;

public class Main {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.afficherLeTableau();
		
		// Afficher la somme des valeurs du tableau 
		
		t1.afficherLaSommeDuTableau();
		t1.afficherLaValeurMaxDuTableau();
		 
		//recuperer la moyenne des valeurs du tableau
		double moyenne =	t1.calculerLaMoyenneDuTableau();
		System.out.println(moyenne);
		System.out.println(t1.calculerLaMoyenneDuTableau());
		
		//afficher l'écart maximum entre les valeurs du tableau
		t1.afficherLecartMaxDuTableau();
		
		   }
	

}


