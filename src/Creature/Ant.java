package Creature;
/**
 * Ant is a creature.
 */
public class Ant extends Creature {

	/**
	 * Create a Ant with a name.
	 *
	 * @param name the given name of this Ant
	 */
	public Ant(String name) {
		super(name);
	}

	/**
	 * When asked to move, an Ant prints '{name} {class} is crawling around.' (the single quotes are NOT part of the output.) 
	 */
	@Override
	public void move() {
		System.out.println(this.toString()+" is crawling around.");
	}

}
