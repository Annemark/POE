import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Batiment_TEST {

	@Test
	void testToString() {
		Batiment b = new Batiment();
		assertFalse("Le string retourné ne devrait pas être vide",b.toString().isEmpty());
	}

	@Test
	void testPrint() {
		Batiment b = new Batiment();
		b.print();
	}

	@Test
	void testBatiment() {
		Batiment b = new Batiment();
		assertEquals("La liste d'animaux devrait être vide", 0, b.getListAnimal().size());
	}

	@Test
	void testBatimentStringLongIntArrayListOfAnimal() {
		Batiment b = new Batiment("newNom", 1000, 100, new ArrayList<Animal>());
		assertEquals("La liste d'animaux devrait être vide", 0, b.getListAnimal().size());
	}

	@Test
	void testGetListAnimal() {
		Batiment b = new Batiment();
		assertEquals("La liste d'animaux devrait être vide", 0, b.getListAnimal().size());
	}

	@Test
	void testSetListAnimal() {
		Batiment b = new Batiment();
		ArrayList<Animal> listAnimaux = new ArrayList<Animal>();
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		b.setListAnimal(listAnimaux);
		assertEquals("3 animaux devraient être dans la liste des animaux", 3, b.getListAnimal().size());
	}

	@Test
	void testGetNumberOfAnimal() {
		Batiment b = new Batiment();
		assertEquals("Le nombre d'animaux devrait être 0", 0, b.getNumberOfAnimal());
	}

	@Test
	void testAddAnimal() {
		Batiment b = new Batiment();
		b.addAnimal(new Animal());
		assertEquals("La longueure de la liste d'animaux devrait être 1", 1, b.getListAnimal().size());
	}

	@Test
	void testAddListAnimal() {
		Batiment b = new Batiment();
		b.addAnimal(new Animal());// j'ai 1 animal dans ma liste
		
		ArrayList<Animal> listAnimaux = new ArrayList<Animal>();
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		listAnimaux.add(new Animal());
		b.addListAnimal(listAnimaux);// j'ajoute ma liste de 3 animaux à mon animal déjà dans la liste
		assertEquals("4 animaux devraient être dans la liste des animaux", 4, b.getListAnimal().size());
	}

	@Test
	void testClearListAnimal() {
		Batiment b = new Batiment();
		b.addAnimal(new Animal());
		b.addAnimal(new Animal());
		
		b.clearListAnimal();
		assertEquals("La liste d'animaux devrait être vide", 0, b.getListAnimal().size());
	}

	@Test
	void testRemoveAnimal() {
		Batiment b = new Batiment();
		b.addAnimal(new Animal());
		b.addAnimal(new Animal());
		b.addAnimal(new Animal());
		int tailleOrigine = b.getListAnimal().size();
		
		b.removeAnimal(0);
		assertEquals("La longueure de la liste d'animaux devrait être 3-1", tailleOrigine-1, b.getListAnimal().size());
	}

}
