package Creature;

/**
 * The Class intention is to test Creature and Thing behavior follow the instruction
 * 
 * @author Paitpat Duangchalomnin A20351140 pduangchalomnin@hawk.iit.edu
 */
public class TestCreature {
	
	public static final int CREATURE_COUNT = 6;
	public static final int THING_COUNT = 10;
	
	public static void main(String[] args) {
		Thing thingList[] = new Thing[7];
		Creature creatureList[] = new Creature[4];
		
		thingList[0] = new Thing("Banana");
		thingList[1] = new Tiger("Tigger, Pooh's Friend");
		thingList[2] = new Thing("Locomotive");
		thingList[3] = new Thing("Tick-Tock the Crocodile");
		thingList[4] = new Bat("Batty");
		thingList[5] = new Ant("Ant Man");
		thingList[6] = new Fly("Wee The Fly");
		
		creatureList[0] = (Creature) thingList[1];
		creatureList[1] = (Creature) thingList[4];
		creatureList[2] = (Creature) thingList[5];
		creatureList[3] = (Creature) thingList[6];
		
		System.out.println("Things:");
		System.out.println();
		for(Thing thing:thingList)
		{
			System.out.println(thing.toString());
		}
		System.out.println();
		System.out.println("Creatures:");
		System.out.println();
		for(Creature creature:creatureList)
		{
			System.out.println(creature.toString());
			creature.move();
			creature.whatDidYouEat();
			creature.eat(thingList[0]); // Eat thing
			creature.whatDidYouEat();
			creature.eat(creatureList[0]); // Eat Creature
			creature.whatDidYouEat();
		}
		
	}

}
