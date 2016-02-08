package UnitTest;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Creature.Fly;
import Creature.Thing;
import Creature.Tiger;

/**
 *  This unit test intention is to test Fly class
 */
public class FlyTest {

	ByteArrayOutputStream outString = new ByteArrayOutputStream();
	Fly objFly;

	/**
	 * Creates the bat object.
	 */
	@Before
	public void createBat(){
		objFly = new Fly("flyName");
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
		objFly.eat(new Tiger("food"));
		assertEquals("flyName Fly won't eat a food Tiger", outString.toString().trim());
	}
	
	/**
	 * Test eat food that is thing.
	 */
	@Test
	public void testEatThing() {
		objFly.eat(new Thing("food"));
		assertEquals("flyName Fly has just eaten a food", outString.toString().trim());
	}

	/**
	 * Test move.
	 */
	@Test
	public void testMove() {
		objFly.move();
		assertEquals("flyName Fly is buzzing around in flight", outString.toString().trim());
	}

	/**
	 * Test fly.
	 */
	@Test
	public void testFly() {
		objFly.fly();
		assertEquals("flyName Fly is buzzing around in flight", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat without given any food.
	 */
	@Test
	public void testWhatDidYouEatWithOutFood() {
		objFly.whatDidYouEat();
		assertEquals("flyName Fly has had noting to eat!", outString.toString().trim());
	}

	/**
	 * Test whatDidYouEat after eat creature.
	 */
	@Test
	public void testWhatDidYouEatAfterEatCreature() {
		objFly.eat(new Tiger("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objFly.whatDidYouEat();
		assertEquals("flyName Fly has had noting to eat!", outString.toString().trim());
	}
	
	/**
	 * Test whatDidYouEat after eat thing.
	 */
	@Test
	public void testWhatDidYouEatAfterEatThing() {
		objFly.eat(new Thing("food"));
		outString = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outString));
		objFly.whatDidYouEat();
		assertEquals("flyName Fly has eaten a food", outString.toString().trim());
	}

	/**
	 * Test toString.
	 */
	@Test
	public void testToString() {
		assertEquals("flyName Fly", objFly.toString());
	}

}
