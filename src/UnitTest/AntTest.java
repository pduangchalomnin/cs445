package UnitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Creature.Ant;
import Creature.Creature;
import Creature.Thing;

/**
 *  This unit test intention is to test Ant class
 */
public class AntTest {
	
	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	Creature objAnt;
	
	/**
	 * Creates the ant object.
	 */
	@Before
	public void createAnt(){
		objAnt = new Ant("antName");
	}
	
	/**
	 * Move system print into stream.
	 */
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outString));
	}

	/**
	 * Clean up streams.
	 */
	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	/**
	 * Test move.
	 */
	@Test
	public void testMove() {
		objAnt.move();
		assertEquals("antName Ant is crawling around.", outString.toString().trim());
	}

	/**
	 * Test eat.
	 */
	@Test
	public void testEat() {
		objAnt.eat(new Thing("food"));
		assertEquals("antName Ant has just eaten a food", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat without given any food.
	 */
	@Test
	public void testWhatDidYouEatWithOutFood() {
		objAnt.whatDidYouEat();
		assertEquals("antName Ant has had noting to eat!", outString.toString().trim());
	}

	/**
	 * Test whatDidYouEat after gave food.
	 */
	@Test
	public void testWhatDidYouEatWithFood() {
		objAnt.eat(new Thing("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objAnt.whatDidYouEat();
		assertEquals("antName Ant has eaten a food", outString.toString().trim());
	}

	/**
	 * Test toString.
	 */
	@Test
	public void testToString() {
		assertEquals("antName Ant", objAnt.toString());
	}


}
