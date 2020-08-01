package ClassAssignment_FinalProjectUpdated;

public class Acts {
	
	public static String prelude() {
	System.out.println("---------------------------------Prelude---------------------------------------\n\n"
			+ "Every 5000 years our world aligns with other planets and a cosmic portal opens\n"
			+ "pouring monsters into our world.\n\n"
			+ "Fair Adventurer we summon thee to fulfill your destiny and take upon the noble quest\n"
			+ "to close the portal and vanquish all evil who descended from the portal.\n\n"
			+ "Would you be The honorable hero to bring peace back to the world?\n" + "yes or no: ");
	
	String chosenHeroName = Utilities.preludeChoice();

	return chosenHeroName;
	}

	public static Hero actOne(String chosenHeroName) {
		System.out.println("---------------------------------Act One---------------------------------------\n\n"
				+ "(Priest): Welcome to Eden noble " + chosenHeroName + ". Many evils ravage this land.\n"
				+ "Your courage is the only thing standing between us and death!\n\n"
				+ "There is a chappel that has been overrun by monsters.\n"
				+ "If you manage to put an end to them, we shall show you the passage to the next town!\n"
				+ "Hurry up, people are dying as we speak! ");

		Hero userHeroChoice = Hero.heroChoice(chosenHeroName);	
		Hero currentHeroAttributes = Battle.battle(userHeroChoice, 5, 1);
		Utilities.rest(currentHeroAttributes);
		
		System.out.println("-------------------------------------------------------------\n"
				+ "It seems there is still one monster in the chappel\n"
				+ "Would you like to continue the fight?\n"
				+ "Or do you need to buy something?\n"
				+ "continue or shop?\n");
		
		String proceedingChoice = Utilities.answerReturn("continue", "shop");
	
		if (proceedingChoice.equalsIgnoreCase("continue")) {
			System.out.println("That's exciting!!!\n"
					+ "-------------------------------------------------------------\n");	
		} else {
			Utilities.shop(currentHeroAttributes);
		} 
		
		Battle.battle(currentHeroAttributes, 5, 1);
		
		System.out.println("-------------------------------------------------------------\n"
				+ "(Priest): Who would have thought.\n"
				+ "You did chased away the monsters!\n"
				+ "But it seems the final challenge is awaiting for you noble hero.\n"
				+ "Would you like to continue the fight?\n"
				+ "Or do you still need to buy something?\n"
				+ "Continue or Shop?\n");
		String proceedingChoice2 = Utilities.answerReturn("continue", "shop");
		
		if (proceedingChoice2.equalsIgnoreCase("continue")) {
			System.out.println("That's exciting!!!\n"
					+ "-------------------------------------------------------------\n");
		} else {
			Utilities.shop(currentHeroAttributes);
		} 
			
		System.out.println("-------------------------------------------------------------\n"
				+ "The battle that lies ahead is no mere battle,\n"
				+ "For a great evil has been taken over the port,\n"
				+ "It is time to summon the courage that no one has ever had,\n"
				+ "and set this land free from the grasps of doom.\n\n");	
		
		Battle.battle(currentHeroAttributes, 1, 16);
		
		if (chosenHeroName.equalsIgnoreCase("archer")) {
			System.out.println("Hard is the path of an Archer,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "A Golden Crossbow +10 Attack\n"
					+ "A Bronze Armor +20 Defense\n"
					+ "50 Crystal-Head Arrows +5 Attack\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 15) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 20));
			
		} else if (chosenHeroName.equalsIgnoreCase("warrior")) {
			System.out.println("Hard is the path of a Warrior,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "A Valinar Sword +15 Attack\n"
					+ "A Bronze Shield +10 Defense\n"
					+ "A Bronze Armor +10 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 15) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 20));
					
		} else {
			System.out.println("Hard is the path of a Wizard,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "An Obsidian Staff +10 Attack\n"
					+ "A Lightning book of spells +10 Attack\n"
					+ "An Elven Robe +15 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 20) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 15));
		}
		
		System.out.println("\n-------------------------------------------------------------\n\n"
				+ "You also found a Crystal.\n\n"
				+ "(Priest): Maybe my eyes are betraying me,\n"
				+ "For I never thought this day would come!\n"
				+ "Free at last!\n\n"
				+ "(Villager): Hero, you must have been sent by the gods!\n"
				+ "You saved us from certain death.\n"
				+ "As promissed, we shall escort you to the passage.\n\n"
				+ "************* An ominous voice echoes in the air *************\n\n"
				+ "Hero, I see that thou have obtained one fundamental crystal,\n"
				+ "The Water Crystal\n"
				+ "If you manage to gather all 3 fundamental crystals, come to find me\n"
				+ "At the Gormaddean mountain.\n"
				+ "For now rest, and take the boat to Webeten.");
			Utilities.rest(currentHeroAttributes);
		
		return currentHeroAttributes;
	}
	
	public static Hero actTwo(String chosenHeroName, Hero currentHeroAttributes) {
		System.out.println("---------------------------------Act Two---------------------------------------\n\n"
				+ "(Village Elder): Welcome to Webeten noble " + chosenHeroName + ".\n"
				+ "We have heard tales of thy courage, and we could use some of that.\n"
				+ "Although the port seems to be free, the only other way out of town,\n"
				+ "is through the tunel.\n\n"
				+ "(Villager): Hovewer, the tunel has collapsed my liege,\n"
				+ "And the monsters are responsible for that.\n"
				+ "If we don't clear it, we might get trapped if an attack comes from the sea.\n"
				+ "We lack the strength to fight those monsters,\n"
				+ "But we know you have it!\n"
				+ "Eliminate them and we shall clear the passage for you!\n");
	
		Battle.battle(currentHeroAttributes, 5, 6);
		Utilities.shop(currentHeroAttributes);
		
		System.out.println("My last battle was no joke!\n"
				+ "The monsters in this area seem to be stronger.\n"
				+ "Oh, what is that sound?\n");
		
		Battle.battle(currentHeroAttributes, 5, 6);
		Utilities.shop(currentHeroAttributes);
		
		System.out.println("\n\nWhy is everything so dark suddenly?\n\n"
				+ "(Specter): You have defeated lesser creatures,\n"
				+ "But, you shall perish before me!");
		
		Battle.battle(currentHeroAttributes, 1, 17);
		
		if (chosenHeroName.equalsIgnoreCase("archer")) {
			System.out.println("Hard is the path of an Archer,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "A Diamond Crossbow +20 Attack\n"
					+ "An Adamantium Armor +40 Defense\n"
					+ "50 Diamond-Head Arrows +15 Attack\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 35) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 40));
			
		} else if (chosenHeroName.equalsIgnoreCase("warrior")) {
			System.out.println("Hard is the path of a Warrior,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "A Diamond Sword +15 Attack\n"
					+ "An Adamantium Shield +10 Defense\n"
					+ "An Adamantium Armor +10 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 35) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 40));
					
		} else {
			System.out.println("Hard is the path of a Wizard,\n"
					+ "But the reward is greatness.\n"
					+ "You also found among the monster remains:\n\n"
					+ "A Lava Staff +20 Attack\n"
					+ "A Flaming book of spells +20 Attack\n"
					+ "A Wizard Robe +35 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 40) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 35));
		}
		
		System.out.println("\n-------------------------------------------------------------\n\n"
				+ "You also found a Crystal.\n\n"
				+ "(Village Elder): The tales were true afterall,\n"
				+ "We will keep our promisse, for now there is hope in our hearts!\n\n"
				+ "************* An ominous voice echoes in the air *************\n\n"
				+ "Hero, I see that thou have obtained another fundamental crystal,\n"
				+ "The Wind Crystal\n"
				+ "They opened the passage to Gormaddean,\n"
				+ "And my magic senses the last crystal here.\n"
				+ "Come and find it, for the world needs you in its darkest hour");
			
			Utilities.rest(currentHeroAttributes);
		
		return currentHeroAttributes;
		
	}
	public static Hero actThree(String chosenHeroName, Hero currentHeroAttributes) {
		System.out.println("---------------------------------Act Three---------------------------------------\n\n"
				+ "I have walked for hours and no sign of a living creature.\n"
				+ "(Drakomega): That is because only death walk among this place,\n"
				+ "And only death will greet you!\n"
				+ "My sons!!! This human came here to destroy us.\n"
				+ "Obliterate him!");
	
		Battle.battle(currentHeroAttributes, 5, 11);
		
		System.out.println("This is bad... I have no time to rest,\n"
				+ "And what is this dust in the air?\n"
				+ "I think I will meet my end here.\n"
				+ "And thre is already another monster comming!!\n\n"
				+ "***** An ominous voice echoes in the air *****\n\n"
				+ "Hero, the monsters here are diffent.\n"
				+ "They are stronger, but they leave a dust behind when they die.\n"
				+ "Cover you body with it, and you shall be restored!\n\n"
				+ "Well it doesn't hurt to try, or does it?\n");
		Utilities.rest(currentHeroAttributes);
		
		Battle.battle(currentHeroAttributes, 5, 11);
		
		System.out.println("There is no end to them!\n"
				+ "I guess I will have to use the dust again\n");
		
		Utilities.rest(currentHeroAttributes);
		
		System.out.println("What on earth is going on? The earth is shaking!\n");
		
		Battle.battle(currentHeroAttributes, 1, 18);
		
		System.out.println("\n-------------------------------------------------------------\n\n"
				+ "You also found a Crystal.\n\n"
				+ "I guess this is it for now. There are no more monsters around.\n"
				+ "I should get going to the mountain.\n\n"
				+ "(Grand Wizard Alf): You made it.\n"
				+ "And I see that thou have obtained the last fundamental crystal,\n"
				+ "The Earth Crystal\n\n"
				+ "I can close the portal using the crystals, but I don't have my wand.\n"
				+ "I lost it fighing Drakomega. He is too powerfull.\n"
				+ "I don't know if even you can defeat him.\n"
				+ "But this might be our only chance.\n"
				+ "He is on the top of the mountain.\n\n"
				+ "I shall pass to you the sacred armory of my ancestors.\n"
				+ "Go, for you carry with you the world's hopes and dreams.\n");
		
		if (chosenHeroName.equalsIgnoreCase("archer")) {
			System.out.println("You have obtained: \n\n"
					+ "A Holy Crossbow +30 Attack\n"
					+ "A Holy Armor +70 Defense\n"
					+ "50 Angelic-Head Arrows +30 Attack\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 60) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 70));
			
		} else if (chosenHeroName.equalsIgnoreCase("warrior")) {
			System.out.println("You have obtained: \n\n"
					+ "A Holy Sword +60 Attack\n"
					+ "A Holy Shield +35 Defense\n"
					+ "A Holy Armor +35 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 60) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 70));
					
		} else {
			System.out.println("You have obtained: \n\n"
					+ "A Holy Staff +35 Attack\n"
					+ "A Holy book of spells +35 Attack\n"
					+ "An Holy Garments +60 Defense\n\n"
					+ "Your new Status are:\n"
					+ "Attack " + (currentHeroAttributes.attack = currentHeroAttributes.attack + 70) 
					+ "\nDefense " + (currentHeroAttributes.defense = currentHeroAttributes.defense + 60));
		}
			
			Utilities.rest(currentHeroAttributes);
		
		return currentHeroAttributes;
		
	}
	public static Hero finalAct(String chosenHeroName, Hero currentHeroAttributes) {
		System.out.println("---------------------------------Final Act---------------------------------------\n\n"
				+ "(Drakomega): I might have underestimated you.\n"
				+ "But your hope was your undoing.\n"
				+ "For you are in the presence of death itself.\n");
		
		Battle.battle(currentHeroAttributes, 1, 19);
		
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "With all the crystals and the Grand Alf's wand,\n"
				+ "The portal was closed, and evil was no more!\n\n"
				+ "The skies are blue again.\n"
				+ "Hope has return to Mankind.\n"
				+ "We shall walk towards a new dawn.\n\n"
				+ "----------------------------------The End--------------------------------------");
				   	
		return currentHeroAttributes;
	}
}
