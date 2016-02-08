package Creature;

/**
 * Tiger is a creature that knows how to speak.
 */
public class Tiger extends Creature {

	/**
	 * Create a Tiger with a name.
	 *
	 * @param name the given name of this Tiger
	 */
	public Tiger(String name) {
		super(name);
		
	}

	/**
	 * When asked to move, a Tiger prints '{name} {class} has just pounced.' (the single quotes are NOT part of the output.)
	 *
	 */
	@Override
	public void move() {
		System.out.println(this.toString()+" has just pounced.");

	}

}
