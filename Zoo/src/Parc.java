import java.util.ArrayList;

public class Parc extends Endroit {
	private ArrayList<Animal> listAnimal = new ArrayList<Animal>();// initialisation de l'attribut 'listAnimal' qui se trouve dans un parc
	// ici on a mis 'private' car la portée est limitée dans cette class.

	// Les constructeurs 
	public Parc() {
		// Ce mot clé appelle le contstructeur de la classe mère
		super();
	}
	
	public Parc(String newNom, long newSurface, int newNbAnimauxMax, ArrayList<Animal> newListAnimal) {
		super(newNom, newSurface, newNbAnimauxMax);
		listAnimal = newListAnimal;
	}
	
	// Les getters / setters
	 /** 
		 * @return listAnimal : ArrayList<Animal> 
		 * @author louis
		 * @date 02/09/2018
		 */
	public  ArrayList<Animal> getListAnimal(){
		return listAnimal;
	}
	
	 /** 
	 * @param newListAnimal : ArrayList<Animal>
	 * @author louis
	 * @date 02/09/2018
	 */
	public void setListAnimal(ArrayList<Animal> newListAnimal) {
		listAnimal = newListAnimal;
	}

	@Override
	public String toString() {
		return "Parc [listAnimal=" + listAnimal + "\n" + super.toString() + "]\n";
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
	 * @date 15/09/2018
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