import java.util.ArrayList;

public class ZooCreator {

	public ZooCreator() {
		//La 1ere année, on a 3 annimaux avec 1 batiment. C'est 3 animaux sont tous les trois dans le même batiment
		// Création des animauxBatiments
		ArrayList <Animal > listAnimal = creationAnimaux();	
		
		Batiment b = creationBatiments(listAnimal);
		ArrayList<Endroit> listEndroit = new ArrayList<Endroit>() ;
		listEndroit.add(b);
		
		Zoo z = new Zoo("ZOOZOO", 100000000, 1000, listEndroit);
		// on vient de créer notre zoo avec trois animaux dans un meme batiment.
		System.out.println("==== Année 1 ====");
		z.print();
		
		//La 2eme année, on ajoute 3 nouveaux batiments qui restent vide
		ArrayList<Batiment> listBatiment = new ArrayList<Batiment>();
		listBatiment.add(new Batiment("B", 250, 5, null));
		listBatiment.add(new Batiment("C", 300, 6, null));
		listBatiment.add(new Batiment("D", 500, 10, null));
		
		listEndroit = z.getListEndroit();//ici, on récupère la liste des endroits qui se trouvent dans le zoo "z"
		listEndroit.addAll(listBatiment);//a cette liste, on ajoute nos 3 nouveaux batiments dans la liste
		z.setListEndroit(listEndroit);//on change l'ancienne liste (1 batiment "b") pour la nouvelle liste ("b" + les 3 nouveaux)
		System.out.println("==== Année 2 ====");
		z.print();
		
		//La 3eme année, on ajoute 5 parcs qui restent vide
		ArrayList<Parc> listParc = new ArrayList<Parc>();
		listParc .add(new Parc("P1", 400, 4, null));
		listParc .add(new Parc("P2", 1000, 10, null));
		listParc .add(new Parc("P3", 2500, 25, null));
		listParc .add(new Parc("P4", 10000, 100, null));
		listParc .add(new Parc("P5", 10000, 100, null));
		listEndroit = z.getListEndroit();
		listEndroit.addAll(listParc);
		z.setListEndroit(listEndroit);
		System.out.println("==== Année 3 ====");
		z.print();
		
		//La 4eme année, 
		
		System.out.println("==== Année 4 ====");
		z.print();
		
	}

	
	/**
	 * méthode qui nous permet de lancer notre programme avec seulement les classes suivantes:
	 * 		Animal
	 * 		Endroit
	 * 		Batiment
	 * Nous pouvons commencer à nous amuser avec ça
	 * @return 
	 */
	private ArrayList<Animal> creationAnimaux() {
		// création de mes animaux
		Animal a1 = new Animal("Simo", 4, "male");
		Animal a2 = new Animal("Thimo", 5, "male" );
		Animal a3 = new Animal("Pumba", 7,"male");
		
		ArrayList<Animal> listAnimal = new ArrayList<Animal>();// on n'a pas mis ' private' car c'est dans un méthode, la variable va être oublié à la fin de cette méthode.
		listAnimal.add(a1);
		listAnimal.add(a2);
		listAnimal.add(a3);
		
		return listAnimal;
	}
	
		// création de mes bâtiments
		private Batiment creationBatiments(ArrayList<Animal> listAnimal) {		
			// association de mes animaux à mes bâtiments
			Batiment b =  new Batiment("A", 200,4, listAnimal);
			return b;
		}

				
}


