import java.util.ArrayList;

/** - listEndroit : ArrayList<Endroit>

 * @author louis
 *
 * {Zoo}  : 
 */
public class Zoo extends Endroit {
	private ArrayList<Endroit> listEndroit = new ArrayList<Endroit>();// initialisation de l'attribut ' listEndroit ' qui se trouve dans un Zoo
	// ici on a mis 'private' car la portée est limitée dans cette class.

	// Les constructeurs 
	public Zoo() {
		super();
	}
	
	public Zoo(String newNom, long newSurface, int newNbAnimauxMax, ArrayList<Endroit> newListEndroit) {
		super(newNom, newSurface, newNbAnimauxMax);
		listEndroit= newListEndroit;
	}
	
	// Les getters / setters
		 /** 
			 * @return listEndroit: ArrayList<Endroit> 
			 * @author louis
			 * @date 15/09/2018
			 */
	public ArrayList<Endroit> getListEndroit() {
		return listEndroit;
	}
	   /** 
			 * @param newListEndroit : ArrayList<Endroit>
			 * @author louis
			 * @date 15/09/2018
			 */
	public void setListEndroit(ArrayList<Endroit> listEndroit) {
		this.listEndroit = listEndroit;
	}
	
	@Override
	public String toString() {
		return "Zoo [\nlistEndroit=\n" + listEndroit + ", \n " + super.toString() + "]\n";
	}

	public void print() {
		System.out.println(toString());
	}
	//===================================
		// =========== mes methodes ===========
		/*
		 * + getNumberOfEndroit() : int --> le nombre d'éléments dans la liste d'Endroits
		 * + addEndroit(Endroit) : void --> ajoute un Endroit en dernière position de la liste d'Endroits
		 * + addListEndroit(ArrayList<Endroit>): void --> ajoute une liste d'Endroits en dernière position de la liste d'Endroits
		 * + clearListEndroit() : void --> vide la liste d'Endroits
		 * + removeEndroit(int) : void --> retire l'Endroit qui se trouve à un certain index de la liste d'Endroits
		 */
		
		/**
		 * @return int : le nombre d'éléments dans la liste d'Endroits
		 * @author louis
		 * @date 15/09/2018
		 */
		public int getNumberOfEndroit() {
			return listEndroit.size();
		}
		
		/**
		 * @return int : void --> ajoute un Endroit en dernière position de la liste d'Endroits
		 * @author louis
		 * @date 15/09/2018
		 */
		public void addEndroit(Endroit EndroitToAdd) {
			listEndroit.add(EndroitToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .
		}
		
		/**
		 * @return int : void --> ajoute une liste d'Endroits en dernière position de la liste d'Endroits
		 * @author louis
		 * @date 15/09/2018
		 */
		public void addListEndroit(ArrayList<Endroit> listEndroitToAdd) {
			listEndroit.addAll(listEndroitToAdd);// on récupère pas le retour, on considère que ça fonnctionne dans tous les cas .		
		}
		
		/**
		 * @return int :void --> vide la liste d'Endroits
		 * @author louis
		 * @date 15/09/2018
		 */
		public void clearListEndroit() {
			listEndroit.clear();
		}
		
		/**
		 * @return int : void --> retire l'Endroit qui se trouve à un certain index de la liste d'Endroits
		 * @author louis
		 * @date 15/09/2018
		 */
		public void removeEndroit(int indexEndroitToRemove) {
			listEndroit.remove(indexEndroitToRemove);
		}
		
 }

