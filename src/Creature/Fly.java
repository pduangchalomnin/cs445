package Creature;

/**
 * Fly is a creature that knows how to fly.
 */
public class Fly extends Creature implements Flyer {

	/**
	 *  Create a Fly with a name.
	 *
	 * @param the given name of this Fly
	 */
	public Fly(String name) {
		super(name);
	}
	
	/**
	 * A Fly eats only Things; a fly will not eat anything that is a Creature.
	 * If told to eat a Creature instance, a Fly says: '{name} {class} won't eat a {aThing}'
	 * (the single quotes are not part of the message.) Otherwise a fly eats the thing just like any other Creature would.
	 * @param aThing what this is told to eat
	 */
	public void eat(Thing aThing)
	{
		if(aThing instanceof Creature)
			System.out.println(this.toString()+" won't eat a "+aThing.toString());
		else if(aThing instanceof Thing)
		{
			super.eat(aThing);
		}
			
	}
	/**
	 * When asked to fly, a Fly prints the message '{name} {class} is buzzing around in flight'
	 * (the single quotes are not part of the message.)
	 * 
	 */
	@Override
	public void fly() {
		System.out.println(this.toString()+" is buzzing around in flight");

	}

	/**
	 * When asked to move, a Fly flies. That is, the instance calls its own fly() method.	
	 *
	 */
	@Override
	public void move() {
		fly();

	}


}
