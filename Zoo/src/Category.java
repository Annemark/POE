import java.util.ArrayList;

public class Category {
	
	// Les attributs de l'objet Category
	private  int id;
	private static int lastId = 0;
	private String nom;
	private ArrayList<Espece> listEspece= new ArrayList<Espece>();
	
	  // Les constructeurs 	
	public Category() {
		 incrementLastId();
		 id = lastId;
		 nom = "inconnu";// on déclare qu'une fois les types de  variable, ici on ne refait pas.
	// on n'a pas besoin de mettre une valeur par défaut pour la liste, par défaut : vide
		}
	
	public Category(String newNom) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
	}
	
	public Category(String newNom,  ArrayList<Espece>newListEspece) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
		 listEspece= newListEspece;
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
	
	public ArrayList<Espece> getListEspece() {
		return listEspece;
	}
	
	public void setListEspece(ArrayList<Espece> listEspece) {
		this.listEspece = listEspece;
	}
	
	 // Les méthodes "printers"
	@Override
	public String toString() {
		return "Category [nom=" + nom + ", listEspece=" + listEspece + "]\n";
	}
	
	public void print() {
		System.out.println(toString());
	}
	//===================================
		// =========== mes methodes ===========
		/*
		 * + getNumberOfEspece() : int --> le nombre d'éléments dans la liste d'animaux
		 * + addEspece(Espece) : void --> ajoute un espece en dernière position de la liste d'animaux
		 * + addListEspece(ArrayList<Espece>): void --> ajoute une liste d'animaux en dernière position de la liste d'animaux
		 * + clearListEspece() : void --> vide la liste d'animaux
		 * + removeEspece(int) : void --> retire l'Espece qui se trouve à un certain index de la liste d'animaux
		 */
		
		/**
		 * @return int : le nombre d'éléments dans la liste d'animaux
		 * @author louis
		 * @date 16/09/2018
		 */
		public int getNumberOfEspece() {
			return listEspece.size();
		}
		
		/**
		 * @return int : void --> ajoute un Espece en dernière position de la liste d'animaux
		 * @author louis
		 * @date 15/09/2018
		 */
		public void addEspece(Espece especeToAdd) {
			listEspece.add(especeToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .
		}
		
		/**
		 * @return int : void --> ajoute une liste d'especes en dernière position de la liste d'animaux
		 * @author louis
		 * @date 15/09/2018
		 */
		public void addListEspece(ArrayList<Espece> listEspeceToAdd) {
			listEspece.addAll(listEspeceToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .		
		}
		
		/**
		 * @return int :void --> vide la liste d'especes
		 * @author louis
		 * @date 15/09/2018
		 */
		public void clearListEspece() {
			listEspece.clear();
		}
		
		/**
		 * @return int : void --> retire l'Espece qui se trouve à un certain index de la liste d'especes
		 * @author louis
		 * @date 15/09/2018
		 */
		public void removeEspece(int indexEspeceToRemove) {
			listEspece.remove(indexEspeceToRemove);
		}

				
}


