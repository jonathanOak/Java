package ClassAssignment_FinalProjectUpdated;

import java.util.Random;

/**
 * The Class hero has the attributes of a hero used to interact
 * in the battle method and in the utilities.
 * 
 * @author Jonathan Oak
 *
 */
public class Hero {

	int attack;
	int defense;
	int healthPoints;
	int potions;
	int coins;
	int level;
	String heroName;
	String heroAction;
	
/**
 *  
 * @param attack corresponds to the hero strength. It is used to define how much damage
 * a hero can do when fighting.
 * @param defense corresponds to the hero capability to withstand an enemy attack.
 * @param healthPoints corresponds to the hero heath. Any damage suffered in battle is
 * subtracted from heathPoins.
 * @param potions holds the value of the amount of healthPoints to be restored in case
 * the option to drink a potion is chosen.
 * @param coins is used to buy potion.
 * @param level is used as a point base to calculate the current healthPoints in other methods.
 * @param heroName is a distinguishable name for the purpose of differentiate the hero in methods.
 * @param heroAction is the name displayed on screen when the hero performs an attack.
*/
	public Hero(int attack, int defense, int healthPoints, int potions, int coins, int level, String heroName, String heroAction) {
		super();
		this.attack = attack;
		this.defense = defense;
		this.healthPoints = healthPoints;
		this.potions = potions;
		this.coins = coins;
		this.level = level;
		this.heroName = heroName;
		this.heroAction = heroAction;
	}
/**
 * This method is invoked when the user chooses a hero to play with, giving the initial
 * attributes and information of a hero.
 * @param chosenHeroName is the user input when choosing a hero.
 * @return returns the hero attributes which was chosen by the user.
 */
	public static Hero heroChoice(String chosenHeroName) {
		
		switch(chosenHeroName) {
		case "archer":
			Hero archer =  new Hero(70, 90, 240, 150, 0, 1, "archer", " You fired an arrow with perfect aim landing ");
			
			return archer;
			
		case "warrior":
			Hero warrior = new Hero(80, 80, 240, 150, 0, 1, "warrior", " You delt a devastating blow landing ");
			return warrior;
			
		case "wizard":
			Hero wizard =  new Hero(90, 70, 240, 150, 0, 1, "wizard", " You summoned an arcane meteor from the heavens dealing ");
			return wizard;
		}
		return null ; 
	}
/**
 * Updates the attributes of the chosen hero after a battle.
 * The method also generates a random amount of coins so the hero can buy more potions.
 * @param hero passes the attributes of the chosen hero to be updated in the method after a battle.
 * @return Returns an updated version of the hero.
 * 
 */
	public static Hero levelUp(Hero hero) { 
		
		System.out.println("----------------------Congratulations------------------------\n"
				+ "You've won the battle noble hero.\n"
				+ "You have sharpened your senses and you are stronger than ever.\n");
		
		hero.attack		  +=6;
		hero.defense	  +=6;
		hero.healthPoints +=50;
		hero.level		  +=1;
		
		
		System.out.println("You leveled up to level: " + hero.level 
				+ "\nYour new status are: " 
				+ "\nAttack: " + hero.attack 
				+ "\nDefense: " + hero.defense
				+ "\nHealth Points: " + hero.healthPoints);
		
		Random random = new Random();
		int cashWon = random.nextInt(5) + 2;
		hero.coins += cashWon;
				
		System.out.println("\nYou found " + cashWon + " Gold Coins amongst the moster's remains."
				+ "\nYour total of Gold Coins is: " + hero.coins
				+ "\nYour number of potion is: " + hero.potions / 150 
				+ "\n-------------------------------------------------------------");
		return hero;
		
	}
		
}
