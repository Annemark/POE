import java.util.ArrayList;

public class Espece {
		
	// Les attributs de l'objet Espece
	private  int id;
	private static int lastId = 0;// ici l'attribut partagé ' lastId' on commence par 0, on peux le mettre aussi 1000, c'est à dire qu'on pars par 1000.
	
	private String nom;
	private ArrayList<Race> listRace = new ArrayList<Race>();
	
	// Les constructeurs 
	
	public Espece() {
		incrementLastId();
		 id = lastId;
		nom = "inconnu";// on déclare qu'une fois les types de  variable, ici on ne refait pas.
		// on n'a pas besoin de mettre une valeur par défaut pour la liste, par défaut : vide
	}
	
	public Espece(String newNom) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
	}
	
	public Espece(String newNom,  ArrayList<Race> newListRace) {
		incrementLastId();
		id = lastId;
		nom = newNom;
		listRace= newListRace;
	}
	
	private void incrementLastId() {
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
	
	public static int getLastId() {
		return lastId;
	}
	
	public ArrayList<Race> getListRace() {
		return listRace;
	}
	
	public void setListRace(ArrayList<Race> listRace) {
		this.listRace = listRace;
	}
	
	 // Les méthodes "printers"
	@Override
	public String toString() {
		return "Race [nom=" + nom + ", listRace=" + listRace + "\n";
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
		 * @return int : le nombre d'éléments dans la liste de Race
		 * @author ANNI
		 * @date 22/09/2018
		 */
		public int getNumberOfRace() {
			return listRace.size();
		}
		
		/**
		 * @return int : void --> ajoute un animal en dernière position de la liste d'animaux
		 * @author louis
		 * @date 15/09/2018
		 */
		public void addRace(Race raceToAdd) {
			listRace.add(raceToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .
		}
		
		/**
		 * @return int : void --> ajoute une liste de race en dernière position de la liste de race
		 * @author ANNI
		 * @date 22/09/2018
		 */
		public void addListRace(ArrayList<Race> listRaceToAdd) {
			listRace.addAll(listRaceToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .		
		}
		
		/**
		 * @return int :void --> vide la liste d'animaux
		 * @author louis
		 * @date 15/09/2018
		 */
		public void clearListRace() {
			listRace.clear();
		}
		
		/**
		 * @return int : void --> retire l'animal qui se trouve à un certain index de la liste d'animaux
		 * @author louis
		 * @date 15/09/2018
		 */
		public void removeRace(int indexRaceToRemove) {
			listRace.remove(indexRaceToRemove);
		}
}
		


	
