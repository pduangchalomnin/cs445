package UnitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Creature.Bat;
import Creature.Thing;
import Creature.Tiger;

/**
 *  This unit test intention is to test Bat class
 */
public class BatTest {

	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	Bat objBat;

	/**
	 * Creates the bat object.
	 */
	@Before
	public void createBat(){
		objBat = new Bat("batName");
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
	 * Test eat food that is creature.
	 */
	@Test
	public void testEatCreature() {
		objBat.eat(new Tiger("food"));
		assertEquals("batName Bat has just eaten a food Tiger", outString.toString().trim());
	}
	
	/**
	 * Test eat food that is not creature.
	 */
	@Test
	public void testEatThing() {
		objBat.eat(new Thing("food"));
		assertEquals("batName Bat won't eat a food", outString.toString().trim());
	}

	/**
	 * Test move.
	 */
	@Test
	public void testMove() {
		objBat.move();
		assertEquals("batName Bat is swooping through the dark.", outString.toString().trim());
	}

	/**
	 * Test fly.
	 */
	@Test
	public void testFly() {
		objBat.fly();
		assertEquals("batName Bat is swooping through the dark.", outString.toString().trim());
	}

	/**
	 * Test whatDidYouEat without given any food.
	 */
	@Test
	public void testWhatDidYouEatWithOutFood() {
		objBat.whatDidYouEat();
		assertEquals("batName Bat has had noting to eat!", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat after eat creature.
	 */
	@Test
	public void testWhatDidYouEatAfterEatCreature() {
		objBat.eat(new Tiger("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objBat.whatDidYouEat();
		assertEquals("batName Bat has eaten a food Tiger", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat after eat thing.
	 */
	@Test
	public void testWhatDidYouEatAfterEatThing() {
		objBat.eat(new Thing("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objBat.whatDidYouEat();
		assertEquals("batName Bat has had noting to eat!", outString.toString().trim());
	}

	/**
	 * Test toString.
	 */
	@Test
	public void testToString() {
		assertEquals("batName Bat", objBat.toString());
	}

}
