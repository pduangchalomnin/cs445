package Creature;
/**
 * Thing is the top of a class hierarchy. All Things have a name, given to them at birth.
 * Once born, they cannot change their name. Things have no behavior other than producing
 * their string representation.
 */
public class Thing {
	
	private String name;
	/**
	 * @param name the given name of this Thing
	 */
	public Thing(String name)
	{
		this.name = name;
	}
	
	/** 
	 * Produce a String description of this instance.
	 * If the class of the instance is Thing, then return only the name of the Thing.
	 * Otherwise add the name of the class after the name of the thing, separated by a space.
	 * this makes the class name of the thing serve as the thing's last name (surname),
	 * and the given name of the thing is its first name (given name).
	 * @return the description of this instance
	 */
	public String toString()
	{
		if(getClass().getSimpleName().equals("Thing"))
		{
			return name;
		}
		else
		{
			return name+" "+getClass().getSimpleName();
		}
	}
}
