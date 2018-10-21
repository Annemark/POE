import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Main_TEST {

	@Test
	void Exercice1_test() {
		Main.exercice1();
		assertEquals("La somme des carrés de 5 est de 55", 55, Main.sommePuissance2(5));
		assertEquals("La somme des cubes de 5 est de 225", 225, Main.sommePuissance3(5));
	}
	
	@Test
	void Exercice2_test() {
		Main.exercice2();
		assertEquals(1.69, Main.puissanceN(1.3,2), 0.00001);
		assertEquals(0, Main.puissanceN(0, 10), 0.00001);
		assertEquals(1, Main.puissanceN(1, 10), 0.00001);
		assertEquals(1, Main.puissanceN(-1, 2), 0.00001);
	}

}
