package ClassAssignment_FinalProjectUpdated;

import java.util.Random;

public class Battle {
	
/**
 * This method is used to provide the outcome of a battle.	
 * @param heroChosen is an object of the hero class chosen by the user.
 * @param monsterSelector since there are different levels of monsters, this parameter is used
 * to select a window inside the monster class where it fits the current strength of the hero.
 * @param monsterGap used to refine the window aforementioned and select the bosses for a boss fight.
 * @return returns the updated version of the hero attributes.
 */
		
	public static Hero battle(Hero hero, int monsterSelector, int monsterGap) {
		
		Random random = new Random();
		int number = random.nextInt(monsterSelector) + monsterGap;
		Monster sortedMonster = Monster.monster(number);
		
		
		System.out.println("\nThe " + sortedMonster.monsterName + " charging towards you.");
		for (int i = 0; sortedMonster.healthPoints > 0; i++) {
			System.out.println("What will you do noble hero?\n" 
					+ "Type:\n 1 for Attack\n 2 to Drinking Potion\n");
			
			String choice = Utilities.answerReturn("1", "2");
			// answer 1 = user chooses attack
			if (choice.equalsIgnoreCase("1")) {
				int heroDamage = hero.attack - sortedMonster.defense;
				int remainingMonsterHp = sortedMonster.healthPoints - heroDamage;
				if (remainingMonsterHp < 0) {
					remainingMonsterHp = 0;
				}
				
				System.out.println(hero.heroAction + heroDamage + " damage points.\n" 
				+ "The monster has now "  + remainingMonsterHp + " HP left.\n");
							
				sortedMonster.healthPoints = remainingMonsterHp;
				if (remainingMonsterHp > 0) {
					int monsterDamage =  sortedMonster.attack  - hero.defense;
					int remainingHeroHp = hero.healthPoints - monsterDamage;
									
					System.out.println("Oh no! The monster " + sortedMonster.monsterAction
							+ " landing " + monsterDamage + " damage points.\n" 
							+ "You now have " + remainingHeroHp + " HP left.\n");
					hero.healthPoints = remainingHeroHp;
				} 
			// answer 2 = user chooses to drink a potion	
			} else {
				if (hero.potions == 0) {
					System.err.println("You don't have any more potions, you can only attack!");
					continue;
			// validates if it is possible to drink a potion first		
				} else {
					
					System.out.println("You drank a potion and restored 150 Heath Points");
					hero.healthPoints = hero.healthPoints + 150;
					
					hero.healthPoints = Math.min(hero.healthPoints, (hero.level * 50) + 190);
					
					int monsterDamage =  sortedMonster.attack  - hero.defense;
					System.out.println("You now have " + hero.healthPoints + " HP\n\n"
							+ "But the enemy seizes the oportunity and lands another blow dealing "
							+ monsterDamage + " damage.");

					int remainingHeroHp = hero.healthPoints - monsterDamage;
					System.out.println("You now have " + remainingHeroHp + " HP left.\n");
					hero.healthPoints = remainingHeroHp;

					int potionUsage = (hero.potions - 150) / 150;
					System.out.println("Potions left: " + potionUsage);
					hero.potions = potionUsage * 150;
					
				}
				
			} 
			System.out.println(
					"--------------------------Round " + (i + 1) + "-----------------------------------\n");
		} // level up method to upgrade a hero after a battle
		Hero currentHeroAttributes = Hero.levelUp(hero);
		return currentHeroAttributes;
	}

}
