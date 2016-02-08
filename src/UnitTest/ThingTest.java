package UnitTest;
import static org.junit.Assert.*;
import Creature.Thing;

import org.junit.Before;
import org.junit.Test;

/**
 * This unit test intention is to test Thing class
 */
public class ThingTest {

	Thing testObj;
	
	/**
	 * Creates Thing object for each test case
	 */
	@Before
	public void createThing(){
		testObj = new Thing("testObj");
	}
	
	/**
	 * Test toString method should return only object name.
	 */
	@Test
	public void testToString() {
		assertTrue(testObj.toString().equals("testObj"));
		
	}
}
