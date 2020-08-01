package ClassAssignment_FinalProjectUpdated;

public class Monster {
/**
 * This class defines the attributes of a monster.		
 */
	int attack;
	int defense;
	int healthPoints;
	String monsterName;
	String monsterAction;
/**
 * 	The monster constructor.
 * @param attack corresponds to the monster strength. It is used to define how much damage
 * a monster can do when fighting.
 * @param defense corresponds to the monster capability to withstand an enemy attack.
 * @param healthPoints corresponds to the monster heath. Any damage suffered in battle is
 * subtracted from heathPoins.
 * @param monsterName defines a name to be used in the battle method.
 * @param monsterAction defines the action to be performed when battling.
 */
	public Monster(int attack, int defense, int healthPoints, String monsterName, String monsterAction) {
		super();
		this.attack = attack;
		this.defense = defense;
		this.healthPoints = healthPoints;
		this.monsterName = monsterName;
		this.monsterAction = monsterAction;
	}
/**
 * This method returns a monster and its attributes to be used in the battle method.	
 * @param randomGenerated a random method is invoked and the integer result is passed through
 * the method in order to select a monster.
 * @return returns the monster attributes corresponding to the number randomly generated.
 */
	public static Monster monster(int randomGenerated) {
		
		switch(randomGenerated) {
		case 1:
			Monster vampire = new Monster(120, 40, 60, "Vampire", " summoned shadow tentacles ");
			return vampire;
			
		case 2:
			Monster wereWolf = new Monster(140, 30, 70, " Werewolf ", " sunk its claws through your armor ");
			return wereWolf;
			
		case 3:
			Monster golem = new Monster(110, 50, 100, " Golem ", " threw a gigantic boulder ");
			return golem;
		
		case 4:
			Monster wyvern = new Monster(140, 20, 120, " Wyvern ", " blasted a fire breath ");
			return wyvern;
			
		case 5:
			Monster gryphon = new Monster(110, 40, 110, " Gryphon ", " summoned a tornado ");
			return gryphon;
			
		case 6:
			Monster elderVampire = new Monster(170, 70, 90, " Elder Vampire ", " summoned shadow tentacles ");
			return elderVampire;
			
		case 7:
			Monster umbraWereWolf = new Monster(190, 60, 100, " Umbra Werewolf ", " sunk its claws through your armor ");
			return umbraWereWolf;
			
		case 8:
			Monster ironGolem = new Monster(160, 80, 130, " Iron Golem ", " threw a gigantic boulder ");
			return ironGolem;
		
		case 9:
			Monster caveDragon = new Monster(190, 50, 150, " Cave Dragon ", " blasted a fire breath ");
			return caveDragon;
			
		case 10:
			Monster hypoGryphon = new Monster(160, 70, 140, " Hypo Gryphon ", " summoned a tornado ");
			return hypoGryphon;
			
		case 11:
			Monster ancientVampire = new Monster(220, 110, 130, " Ancient Vampire ", " summoned shadow tentacles ");
			return ancientVampire;
			
		case 12:
			Monster titanWereWolf = new Monster(240, 100, 140, " Titan Werewolf ", " sunk its claws through your armor ");
			return titanWereWolf;
			
		case 13:
			Monster diamondGolem = new Monster(210, 120, 170, " Diamond Golem ", " threw a gigantic boulder ");
			return diamondGolem;
		
		case 14:
			Monster flameDragon = new Monster(240, 90, 190, " Flame Dragon ", " blasted a fire breath ");
			return flameDragon;
			
		case 15:
			Monster archGryphon = new Monster(210, 110, 180, " Arch Gryphon ", " summoned a tornado ");
			return archGryphon;
			
		case 16:
			Monster hydra = new Monster(150, 40, 220, " Hydra ", " Spit Acid ");
			return hydra;
			
		case 17:
			Monster obscurus = new Monster(200, 80, 300, " Obscurus ", " summoned shadow thorns ");
			return obscurus;
			
		case 18:
			Monster adamantoise = new Monster(250, 140, 350, " Adamantoise ", " caused an avalanche ");
			return adamantoise;
			
		case 19:
			Monster drakomega = new Monster(320, 180, 400, " Drakomega ", " caused an earthquake ");
			return drakomega;
		
		}
		return null;
	}
	
}
