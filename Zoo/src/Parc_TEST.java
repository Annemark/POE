import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Parc_TEST {

	@Test
	void testToString() {
		Parc p = new Parc();
		assertFalse("Le string retourné ne devrait pas être vide",p.toString().isEmpty());// si empty is true, ( la condition est remplie,
		//true pour la méthode 'assertFalse' me retourne la phrase alert d'erreur
		//is la partie droite n'est pas égale false, on affiche la phrase.
	}

	@Test
	void testPrint() {
		Parc p = new Parc();
		p.print();
	}

	@Test
	void testParc() {
		Parc p = new Parc();
		assertEquals("La liste d'animaux devrait être vide", 0, p.getListAnimal().size());
	}

	@Test
	void testParcStringLongIntArrayListOfAnimal() {
		Parc b = new Parc("newNom", 1000, 100, new ArrayList<Animal>());
		assertEquals("La liste d'animaux devrait être vide", 0, b.getListAnimal().size());
	}

	@Test
	void testGetListAnimal() {
		Parc p = new Parc();
		assertEquals("La liste d'animaux devrait être vide", 0, p.getListAnimal().size());
	}

	@Test
	void testSetListAnimal() {
		Parc p = new Parc();
		ArrayList<Animal> listAnimaux = new ArrayList<Animal>();
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		p.setListAnimal(listAnimaux);
		assertEquals("3 animaux devraient être dans la liste des animaux", 3, p.getListAnimal().size());
	}

	@Test
	void testGetNumberOfAnimal() {
		Parc p = new Parc();
		assertEquals("Le nombre d'animaux devrait être 0", 0, p.getNumberOfAnimal());
	}

	@Test
	void testAddAnimal() {
		Parc p = new Parc();
		p.addAnimal(new Animal());
		assertEquals("La longueure de la liste d'animaux devrait être 1", 1, p.getListAnimal().size());
	}

	@Test
	void testAddListAnimal() {
		Parc p = new Parc();
		p.addAnimal(new Animal());// j'ai 1 animal dans ma liste
		
		ArrayList<Animal> listAnimaux = new ArrayList<Animal>();
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		p.addListAnimal(listAnimaux);// j'ajoute ma liste de 3 animaux à mon animal déjà dans la liste
		assertEquals("4 animaux devraient être dans la liste des animaux", 4, p.getListAnimal().size());
	}

	@Test
	void testClearListAnimal() {
		Parc p = new Parc();
		p.addAnimal(new Animal());
		p.addAnimal(new Animal());
		
		p.clearListAnimal();
		assertEquals("La liste d'animaux devrait être vide", 0, p.getListAnimal().size());
	}

	@Test
	void testRemoveAnimal() {
		Parc p = new Parc();
		p.addAnimal(new Animal());
		p.addAnimal(new Animal());
		p.addAnimal(new Animal());
		int tailleOrigine = p.getListAnimal().size();
		
		p.removeAnimal(0);
		assertEquals("La longueure de la liste d'animaux devrait être 3-1", tailleOrigine-1, p.getListAnimal().size());
	}

}
