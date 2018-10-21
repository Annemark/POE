/**
 * 
 */
package lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** 
 * @author louis
 *
 * {TableManagerTest}  : 
 */
class TableManagerTest {

	/**
	 * Test method for {@link lesson1.TableManager#declarerTableau(int)}.
	 */
	@Test
	void testDeclarerTableau() {
	    //assertEquals("table should lenght should be 4", TableManager.declarerTableau(4).length, 4);
	    assert TableManager.declarerTableau(4).length == 4 : "table should lenght should be 4";
	}

	/**
	 * Test method for {@link lesson1.TableManager#initialisationDuTableauAvecEntreesDuClient(int[])}.
	 */
	@Test
	void testInitialisationDuTableauAvecEntreesDuClient() {
		assert false : "Not yet implemented";
	}

	/**
	 * Test method for {@link lesson1.TableManager#afficherLeTableau(int[])}.
	 */
	@Test
	void testAfficherLeTableau() {
		assert false : "Not yet implemented";
	}

}
