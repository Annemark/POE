/**
  * Dans le main, créer 1 méthode par exercice.
*
En fin de chaque exercice, afficher "Fin Exercice XX"

On pourra créer plusieurs méthodes appelées depuis les exercices.

*/

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Dans le main, créer 1 méthode par exercice.
		exercice1();
		exercice2();	
	}
	
	public static void exercice2() {
		// TODO un programme calculant XN où X est un nombre décimal et N un entier positif. 
		System.out.println("Début Exercice  2 --- Puissance d'un nombre");
		double a = 1.3;
		int n = 5;
		System.out.println( a + " à la puissance  "  + n+ " est égale à : \t" + puissanceN(a,n));
		System.out.println("Fin Exercice 2 --- Puissance d'un nombre");
	}

	public static double puissanceN(double a, int n) {
		// TODO une méthode qui calcule la puissance d'un nombre;
		double resultatPuissanceN = 1;
		for( int i =1; i <= n; i++) {
			resultatPuissanceN *= a;
		}
		return resultatPuissanceN;
	}

	public static void exercice1() {
		// // TODO un programme qui effectue la somme des carrés et la somme des cubes de 1 à N
		System.out.println("Début Exercice  1 --- Somme de carrés et de cubes");
		int a = 5;
		System.out.println("La Somme de carrés  de " + a + " est égale à : \t" +sommePuissance2(a));
		System.out.println("La Somme de cubes  de " + a + " est égale à : \t" +sommePuissance3(a));
		System.out.println("Fin Exercice 1 --- Somme de carrés et de cubes");
	}
	public static int sommePuissance2(int a) {
		// TODO une méthode qui effectue la somme des carrés 
		int resultatSommePuissance2 = 0;	
		for(int i= 1; i<=a; i++) {
			resultatSommePuissance2 += i*i;	
		}
		return resultatSommePuissance2;	
	}

	public static int sommePuissance3(int a) {
		// TODO une méthode qui effectue la somme des cubes
		int resultatSommePuissance3 = 0;
		for(int i= 1; i<=a; i++) {
			resultatSommePuissance3 += i*i*i;	
		}
		return resultatSommePuissance3;	
	}

	
	
	

	
	
	
	
}
