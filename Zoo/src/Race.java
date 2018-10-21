import java.util.ArrayList;

public class Race {
	 // Les attributs de l'objet Race
	 private static int lastId = 0;// ici l'attribut partagé ' lastId' on commence par 0, on peux le mettre aussi 1000, c'est à dire qu'on pars par 1000.
	 private  int id;
	 private String nom;
	 private ArrayList<Animal> listAnimal = new ArrayList<Animal>();

	// Les constructeurs 
	public Race() {
		 incrementLastId();
		 id = lastId;
		nom = "inconnu";// on déclare qu'une fois les types de  variable, ici on ne refait pas.
		// on n'a pas besoin de mettre une valeur par défaut pour la liste, par défaut : vide
	}
		
	public Race(String newNom) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
	}
	
	public Race(String newNom,  ArrayList<Animal> newListAnimal) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
		 listAnimal = newListAnimal;
	}
	
	private static void incrementLastId() {
		lastId++; // chaque fois on crée un id , last id augment 1.
	}
	
	 // Les getters / setters 
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	 public int getId() {
		return id;
	}

	 public int getLastId() {
		 return lastId;
	 }
	 

	public ArrayList<Animal> getListAnimal() {
		return listAnimal;
	}

	public void setListAnimal(ArrayList<Animal> listAnimal) {
		this.listAnimal = listAnimal;
	}
	
	// Les méthodes "printers"
	@Override
	public String toString() {
		return "Race [nom=" + nom + ", listAnimal=" + listAnimal + "]\n";
	}
	public void print() {
		System.out.println(toString());
	}

	
//===================================
	// =========== mes methodes ===========
	/*
	 * + getNumberOfAnimal() : int --> le nombre d'éléments dans la liste d'animaux
	 * + addAnimal(Animal) : void --> ajoute un animal en dernière position de la liste d'animaux
	 * + addListAnimal(ArrayList<Animal>): void --> ajoute une liste d'animaux en dernière position de la liste d'animaux
	 * + clearListAnimal() : void --> vide la liste d'animaux
	 * + removeAnimal(int) : void --> retire l'animal qui se trouve à un certain index de la liste d'animaux
	 */
	
	/**
	 * @return int : le nombre d'éléments dans la liste d'animaux
	 * @author louis
	 * @date 16/09/2018
	 */
	public int getNumberOfAnimal() {
		return listAnimal.size();
	}
	
	/**
	 * @return int : void --> ajoute un animal en dernière position de la liste d'animaux
	 * @author louis
	 * @date 15/09/2018
	 */
	public void addAnimal(Animal animalToAdd) {
		listAnimal.add(animalToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .
	}
	
	/**
	 * @return int : void --> ajoute une liste d'animaux en dernière position de la liste d'animaux
	 * @author louis
	 * @date 15/09/2018
	 */
	public void addListAnimal(ArrayList<Animal> listAnimalToAdd) {
		listAnimal.addAll(listAnimalToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .		
	}
	
	/**
	 * @return int :void --> vide la liste d'animaux
	 * @author louis
	 * @date 15/09/2018
	 */
	public void clearListAnimal() {
		listAnimal.clear();
	}
	
	/**
	 * @return int : void --> retire l'animal qui se trouve à un certain index de la liste d'animaux
	 * @author louis
	 * @date 15/09/2018
	 */
	public void removeAnimal(int indexAnimalToRemove) {
		listAnimal.remove(indexAnimalToRemove);
	}
}
	

