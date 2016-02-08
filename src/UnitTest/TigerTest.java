package UnitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Creature.Creature;
import Creature.Thing;
import Creature.Tiger;

/**
 *  This unit test intention is to test Tiger class
 */
public class TigerTest {
	
	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	Creature objTiger;
	
	/**
	 * Creates the tiger object.
	 */
	@Before
	public void createTiger(){
		objTiger = new Tiger("tigerName");
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
		objTiger.move();
		assertEquals("tigerName Tiger has just pounced.", outString.toString().trim());
	}
	
	/**
	 * Test eat.
	 */
	@Test
	public void testEat() {
		objTiger.eat(new Thing("food"));
		assertEquals("tigerName Tiger has just eaten a food", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat without given any food.
	 */
	@Test
	public void testWhatDidYouEatWithOutFood() {
		objTiger.whatDidYouEat();
		assertEquals("tigerName Tiger has had noting to eat!", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat after gave food.
	 */
	@Test
	public void testWhatDidYouEatWithFood() {
		objTiger.eat(new Thing("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objTiger.whatDidYouEat();
		assertEquals("tigerName Tiger has eaten a food", outString.toString().trim());
	}

	/**
	 * Test toString.
	 */
	@Test
	public void testToString() {
		assertEquals("tigerName Tiger", objTiger.toString());
	}

}
