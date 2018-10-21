/**
 * 
 * @author louis
 *
 * {Endroit}  :
 */
public class Endroit {
	
	private static int lastId = 0;
	
	//Les attributs de l'objet Endroit	private String  nom;
	private String  nom;
	private int id;
	private long surface;
	private int nbAnimauxMax;

	//Les constructeurs
		/** 
		 * Le constructeur Endroit  prend  0 paramères en entrée
		 * @author louis
		 * @date 02/09/2018
		 */
	public Endroit() {
		incrementLastId();
		id = lastId;
		nom = "inconnu";	// on n'a pas besoin de mettre une valeur par défaut pour la liste, par défaut : vide
	}
	
	/** 
	 * Le constructeur Endroit prend 3 paramères en entrée
	 * @param newNom : String
	 * @param newSurface: long
	 * @param newNbAnimauxMax  :  String
	 * @author louis
	 * @date 02/09/2018
	 */
	public Endroit( String newNom, long newSurface, int newNbAnimauxMax) {
		incrementLastId() ;
		id = lastId;
		 nom = newNom;
		 surface  = newSurface;
		 nbAnimauxMax  = newNbAnimauxMax;
	 }
	
	 // Les getters / setters
	 /** 
	 * @return nom : String
	 * @author louis
	 * @date 02/09/2018
	 */
	 public String getNom() {
		 return nom;
	 }
	 
	 /** 
		 * @param newNom : String
		 * @author louis
		 * @date 02/09/2018
		 */
	 public void setNom(String newNom) {
		 nom = newNom;
		 }
		 
	 /** 
		 * @return id : int
		 * @author louis
		 * @date 02/09/2018
		 */
	public int  getId() {
			 return id;
		 }	
	
	
	/** 
	 * @return surface : long
	 * @author louis
	 * @date 02/09/2018
	 */
	 public long  getSurface() {	
		 return surface;
	 }
	/** 
	 * @param newAge : long
	 * @author louis
	 * @date 02/09/2018
	 */
	 public void setSurface(long newSurface) {
		 surface  = newSurface;
	 }

	/** 
		 * @return  nbAnimauxMax  : int
		 * @author louis
		 * @date 02/09/2018
		 */
	 public int  getNbAnimauxMax() {	
		 return  nbAnimauxMax ;
		 }	
		/** 
		 * @param newNbAnimauxMax : int
		 * @author louis
		 * @date 02/09/2018
		 */
		 public void setNbAnimauxMax(int newNbAnimauxMax) {
			 nbAnimauxMax  = newNbAnimauxMax;
		 }
		// Les méthodes "printers"
			/** 
			 * @return String
			 * @author louis
			 * @date 02/09/2018
			 */
	 public String toString() {
		 return "Endroit: [ nom: "+nom+", id: "+id+", surface: "+surface+", nbAnimauxMax: "+nbAnimauxMax+" ]\n";
	 }
	/** 
	 * @author louis
	 * @date 02/09/2018
	 */
	 public void print() {
			System.out.println(toString());	
	}

	 private static void  incrementLastId() {
		 lastId ++;
	 }
	public static int getLastId() {
		return lastId;
	}

	

}