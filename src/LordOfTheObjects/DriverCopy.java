package LordOfTheObjects;

import java.util.Scanner;

public class DriverCopy {
	static Scanner keyboard = new Scanner(System.in);

	Player player = new Player("Player name", 100, "Backpack");

	Enemy Mao = new Enemy("Mao", 100);
	Enemy Hitler = new Enemy("Hitler", 100);
	Enemy Stalin = new Enemy("Stalin", 100);

	public void startGame() {

		System.out.println("Please choose a name:");
		player.setName(keyboard.nextLine());

	}

	public void fightEnemy(Enemy enemy) {
		int attackOutcome = 0;
		boolean fightOutcome = true;
		int choice = 0;

	while (fightOutcome) {
			System.out.println("What do you want to do first?");

			System.out.println("1. Find zombies and attack");
			System.out.println("2. Run away");
			choice = keyboard.nextInt();

			if (choice == 1) {
				
				System.out.println("Prepare to fight zombie " + enemy.getName());
				keyboard.hasNextLine();
				
				if (enemy.getName() == "Mao") {
					Mao.battleCryMao();
					keyboard.nextLine();
				}

				System.out.println("You attack " + enemy.getName() + " with your trusty K-Bar");
				attackOutcome = (int) (Math.random() * 10 + 1);
				enemy.setHealth(enemy.getHealth() - attackOutcome);

				System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");
				
				if (enemy.getHealth() <= 0) {
					System.out.println(enemy.getName() + " died");
					fightOutcome = false;
					break;
				} else if (player.getHealth() <= 0) {
					System.out.println(player.getName() + " died");
					fightOutcome = false;
					break;
				}
				
				System.out.println("Now it's " + enemy.getName() + "'s turn to attack");

				attackOutcome = (int) (Math.random() * 10 + 1);
				player.setHealth(enemy.getHealth() - attackOutcome);
				System.out.println("You have " + player.getHealth() + " health left");

				if (enemy.getHealth() <= 0) {
					System.out.println(enemy.getName() + " died");
					fightOutcome = false;
					break;
				} else if (player.getHealth() <= 0) {
					System.out.println(player.getName() + " died");
					fightOutcome = false;
					break;
				}
			}
			
			if (choice == 2) {	
			System.out.println("You coward");
			System.out.println("Game Over");
			System.exit(choice);
			}
		}

		}

//	public int choice1Method(Enemies enemy, Player player, int attackOutcome, choice) {
//		
//		boolean fightOutcome1 = true;
//		int choice1 = 0;
//		
//		System.out.println("Prepare to fight zombie " + enemy.getName());
//		keyboard.hasNextLine();
//
//		System.out.println("You attack " + enemy.getName() + " with your trusty K-Bar");
//		attackOutcome = (int) (Math.random() * 10 + 1);
//		enemy.setHealth(enemy.getHealth() - attackOutcome);
//
//		System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");
//		System.out.println("Now it's " + enemy.getName() + "'s" + " turn to attack");
//
//		// attackOutcome = 0;
//
//		attackOutcome = (int) (Math.random() * 10 + 1);
//		player.setHealth(enemy.getHealth() - attackOutcome);
//		System.out.println("You have " + player.getHealth() + " health left");
//
//		if (enemy.getHealth() <= 0) {
//			System.out.println(enemy.getName() + " died");
//			fightOutcome1 = false;
//		} else if (player.getHealth() <= 0) {
//			System.out.println(player.getName() + " died");
//			fightOutcome1 = false;
//		}
//	}
//
//	public int choice2Method(int choice2) {
//		System.out.println("You coward");
//		System.exit(choice2);
//		return choice2;
//	}

	public void backStory() {

		System.out.println("The United States was not the only country working on the atomic bomb during world war 2.");
		keyboard.nextLine();

		System.out.println("Germany, China, and the Soviet Union also developed nuclear weapons.");
		keyboard.nextLine();

		System.out.println("When the Germans nearly captured Moscow, the Soviets decided to use their new weapons.");
		keyboard.nextLine();

		System.out.println("This caused a full blown nuclear war with each country nuking the other powers.");
		keyboard.nextLine();

		System.out.println("While in Normandy, an American soldier named " + player.getName()
				+ " heard the bomb sirens going off.");
		keyboard.nextLine();

		System.out
				.println("He had to think fast, and so he ran into a the nearest house and ran down to the basement.");
		keyboard.nextLine();

		System.out.println(player.getName()
				+ " found a refrigerator and cleared it out and jumped in, closing the door behind him.");
		keyboard.nextLine();

		System.out.println(player.getName()
				+ " was unconcsious for a few hours, but when he emerged, to his surprise, all of his comrades had...");
		keyboard.nextLine();

		System.out.println("turned into zombies!");
		keyboard.nextLine();

		System.out.println("With only his K-Bar in hand " + player.getName() + " set off to hunt zombies.");
		keyboard.nextLine();
	}

}

