
public class Person {
	//Les 4 attributs  de l'objet Person, 
	String nom;
	String prenom;
	int age;
	int taille;
	
	//constructeur par défaut//这个构造器仅有一个参数
	
	public Person() {
		prenom = "";
		nom = "";
	}
	
	/**
	 * Le constructeur Person prend 4 paramètres en entrée
	 * @param newNom : String
	 * @param newPrenom : String
	 * @param newAge : int
	 * @param newTaille : int
	 */
	public Person(String newNom, String newPrenom, int newAge, int newTaille) {
		nom = newNom;
		prenom = newPrenom;
		age = newAge;
		taille = newTaille;
	}

	public void afficherInformations() {
		System.out.println(nom+" "+prenom+" "+age+" "+taille);		
	}

	public void setPrenom(String newPrenom) {
		prenom = newPrenom;
	}

	public void setNom(String newNom) {
		nom = newNom;
	}

	public String getPrenom() {	
		return prenom;
	}	
}
