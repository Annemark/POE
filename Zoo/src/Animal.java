
/**
 * L'objet animal sert à modéliser les animaux
 * @author louis
 * @date 02/09/2018
 * {Animal}  :
 */
public class Animal {
	
	// Les attributs de l'objet Animal
	private static int lastId = 0;
	private int id;
	private String  nom;
	private int age;
	private String sexe;

	// Les constructeurs
	/** 
	 * Le constructeur Animal prend  0 paramères en entrée
	 * @author louis
	 * @date 02/09/2018
	 */
	 public  Animal() {
		 incrementLastId();
		 id = lastId;
		 nom = "inconnu";// on déclare qu'une fois les types de  variable, ici on ne refait pas.
		 sexe = "inconnu";
	}
	 public  Animal(String newNom) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
	}
	 
	/** 
	 * Le constructeur Animal prend 3 paramères en entrée
	 * @param newNom : String
	 * @param newAge : int
	 * @param newSexe  :  String
	 * @author louis
	 * @date 02/09/2018
	 */
	 public Animal( String newNom, int newAge, String newSexe) {
		 incrementLastId();
		 id = lastId;
		 nom = newNom;
		 age = newAge;
		 sexe = newSexe;
	 }
    
	 // Les getters / setters 
	 /**
	  * La methode incrementLastId permet d'ajouter 1 à lastId.
	  * La méthode est utilisée à la création d'un nouvel enregistrement de type Animal
	  */
	private void incrementLastId() {
		lastId++;
	}
	
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
	
	 
	 public static int getLastId() {
		return lastId;
	}

	/** 
	 * @return age : int
	 * @author louis
	 * @date 02/09/2018
	 */
	 public int  getAge() {	
		 return age;
	 }	
	/** 
	 * @param newAge : int
	 * @author louis
	 * @date 02/09/2018
	 */
	 public void setAge(int newAge) {
		 age = newAge;
	 }

	 /** 
	 * @return sexe : String
	 * @author louis
	 * @date 02/09/2018
	 */
	 public String getSexe() {
		 return sexe;
	 }
	/** 
	 * @param newSexe : String
	 * @author louis
	 * @date 02/09/2018
	 */
	 public void setSexe(String newSexe){
		 sexe = newSexe;
		 
	 }
	
	 // Les méthodes "printers"
	/** 
	 * @return String
	 * @author louis
	 * @date 02/09/2018
	 */
	 public String toString() {
		 return "Animal: [ nom: "+nom+", id: "+id+", age: "+age+", sexe: "+sexe+" ]\n";
	 }
	/** 
	 * @author louis
	 * @date 02/09/2018
	 */
	 public void print() {
			System.out.println(toString());
	}
}
