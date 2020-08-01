package ClassAssignment_FinalProjectUpdated;

import java.util.Scanner;

public class Utilities {
/**
 * Since this is a game response based, this method provides a loop template for
 * right answers only.
 * @param answerOne argument to be passed corresponding to one of the desired answers.
 * @param answerTwo argument to be passed corresponding to one of the desired answers.
 * @return returns the answer in order to store in a variable which be used in if statements.
 */
	public static String answerReturn(String answerOne, String answerTwo) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean userInput = false;

		while (!userInput) {
			System.out.println(" Answer: ");

			if (in.hasNext(answerOne) || (in.hasNext(answerTwo))) {
				userInput = true;
			} else {
				userInput = false;
				String wrongAnswer = in.next();
				System.err.println(wrongAnswer + " Is not a valid answer!\n" + " Please type only, " + answerOne
						+ " or " + answerTwo + "!");
			}
		}
		return in.next();
	}
/**
 * This method allows the user to shop for potions.
 * @param currentHeroAttributes passes the hero attributes as coins and potions to be updated.
 * Also, passes the hero health to heal the hero before another battle.
 * @return returns the updated version of the hero.
 */
	public static Hero shop(Hero currentHeroAttributes) {
		System.out.println("-------------------------------------------------------------\n"
				+ "\nYou should regain your strength before another battle.\n");
		
		if (currentHeroAttributes.healthPoints < ((currentHeroAttributes.level * 50) + 190)) {
			System.out.println("It is dangerous to proceed that much tired.\n" 
					+ "You are our only hope!\n"
					+ "I can't allow you to leave without a proper rest.\n" 
					+ "Take a nap now...");
			rest(currentHeroAttributes);
			
		} 
		
		System.out.println("You can shop for potions now and be prepared for what's yet to come.\n"
				+ "Would you like to shop? Yes or No? ");
		String shopAnswer = answerReturn("yes", "no");

		if (shopAnswer.equalsIgnoreCase("yes") && (currentHeroAttributes.coins > 1)) {
			littleShop(currentHeroAttributes);

		} else if (currentHeroAttributes.coins <= 1) {
			System.err.println("\nYou you don't have enough money to shop for potions. Thank you. See you next time.");
				
		} else {
			System.out.println("You are good to go then...");
		}
		return currentHeroAttributes;
	}

	public static Hero littleShop(Hero currentHeroAttributes) {

		System.out.println("-------------------------------------------------------------\n"
				+ "Welcome to my humble establishment traveller."
				+ "\nI am Grido the peddler"
				+ "\nOur potions cost 2 Golden Cois each." 
				+ "\nHow many would you like to buy?");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
		boolean userInput = false;
		while (!userInput) {
			System.out.println(" Answer: ");

			if (in.hasNextInt()) {
				userInput = true;

			} else {
				userInput = false;
				String wrongAnswer = in.next();
				System.err.println(wrongAnswer + " Is not a number!\n" 
						+ "Please type a valid number!");
			}
		}
			
		int answer = in.nextInt();
		int canBuy = currentHeroAttributes.coins / 2;
		// checks if the user is trying to buy more than they can and loops to the beginning.
		if (answer > canBuy) {
			System.err.println("I am sorry traveller.\n"
					+ "The maximum number of potions you can buy with that amount of gold is: " + canBuy);
			littleShop(currentHeroAttributes);

		} else {
			int result = currentHeroAttributes.coins - (answer * 2); // 2 is the value of each potion.
			currentHeroAttributes.coins = result;
			currentHeroAttributes.potions = currentHeroAttributes.potions + (answer * 150);
			System.out.println("Here you go Traveler. You now have: \n" 
					+ " " + (currentHeroAttributes.potions / 150)
					+ " Potions\n" + " " 
					+ currentHeroAttributes.coins 
					+ " Gold Coins\n");

			if (currentHeroAttributes.coins <= 1) {
				System.out.println("It seems you ran out of coins.\n"
						+ "Thank you for your patronage.\n"
						+ "See you next time.\n");
					
			} else {
				System.out.println("Would you like to buy something else? yes or no?\n");
				String newAnswer = answerReturn("yes", "no");

				if (newAnswer.equalsIgnoreCase("yes")) {
					littleShop(currentHeroAttributes);

				} else {
					System.out.println("You are good to go then!\n"
									+ "-------------------------------------------------------------\n");
				}
			}
		}
		return currentHeroAttributes;
	}
/**
 * This method restores the hero heath points.	
 * @param currentHeroAttributes passes the hero attributes to be updated.
 * @return returns a updated version of the hero attributes.
 */
	public static Hero rest(Hero currentHeroAttributes) {

		currentHeroAttributes.healthPoints +=
				(((currentHeroAttributes.level * 50) + 190) - currentHeroAttributes.healthPoints);
		
		System.out.println("\nWith your strength back, you can proceed on your journey hero.\n" 
				+ "You are back with "
				+ currentHeroAttributes.healthPoints + " HP.\n"
				+ "-------------------------------------------------------------");
		return currentHeroAttributes;
	}
	
	
	public static String preludeChoice() {

		String answer = answerReturn("yes", "no");
		if (answer.equalsIgnoreCase("no")) {
			System.out.println("Farewell, we shall await for the chosen one!");
			System.exit(1);

		} else {
			System.out.println("-------------------------------------------------------------\n"
					+ "It seems the light and courage of your ancestors resides inside of you!\n"
					+ "We rely on your mighty to defend us from this evil.\n\n"
					+ "What is your profession noble hero?\n\n" + "Archer, Warrior or Wizard?\n\n"
					+ "archer  [Level 1, Attack = 70, Defense = 90, Heath Points = 240]\n"
					+ "warrior [Level 1, Attack = 80, Defense = 80, Heath Points = 240]\n"
					+ "wizard  [Level 1, Attack = 90, Defense = 70, Heath Points = 240]\n");
		}
		@SuppressWarnings("resource")
		Scanner aswr = new Scanner(System.in);
		boolean userInput = false;

		while (!userInput) {
			System.out.println(" Answer: ");

			if (aswr.hasNext("archer") || (aswr.hasNext("warrior") || (aswr.hasNext("wizard")))) {
				userInput = true;
				break;
			} else {
				userInput = false;
				String answer2 = aswr.next();
				System.err.println(
						answer2 + " Is not a valid answer!\n" + " Please type only, archer or warrior or wizard!");
			}
		}
		String chosenHero = aswr.next();
		
		if (chosenHero.equalsIgnoreCase("archer")) {
			System.out.println("You carry with you a wooden bow, 50 wooden arrows, Grandpa's Armor and 1 potion.");

		} else if (chosenHero.equalsIgnoreCase("warrior")) {
			System.out.println("You carry with you a Wooden Sword, a Wooden Shield, Grandpa's Armor and 1 potion.");

		} else {
			System.out.println("You carry with you a Wooden Staff, a Magic Book, a Robe and 1 potion.");

		}
		return chosenHero;
	}
}
