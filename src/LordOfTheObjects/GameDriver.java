package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {
	static Scanner keyboard = new Scanner(System.in);

	Player player = new Player("Player name", 200, "Backpack");

	Enemies Hitler = new Enemies("Hitler", 100);
	Enemies Stalin = new Enemies("Stalin", 100);
	Enemies Mao = new Enemies("Mao", 100);

	public void startGame() {

		System.out.println("Please choose a name:");
		player.setName(keyboard.nextLine());

	}

	public void fightEnemy(Enemies enemy) {
		int attackOutcome = 0;
		int damage = 0;
		int m = 0, h = 0;
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

				System.out.println("You attack " + enemy.getName() + " with your trusty K-Bar");
				attackOutcome = (int) (Math.random() * 10 + 1);
				enemy.setHealth(enemy.getHealth() - attackOutcome);

				System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left");
				System.out.println("Now it's " + enemy.getName() + "'s" + " turn to attack");

				// attackOutcome = 0;

				attackOutcome = (int) (Math.random() * 10 + 1);
				player.setHealth(enemy.getHealth() - attackOutcome);
				System.out.println("You have " + player.getHealth() + " health left");

				if (enemy.getHealth() <= 0) {
					System.out.println(enemy.getName() + " died");
					fightOutcome = false;
				} else if (player.getHealth() <= 0) {
					System.out.println(player.getName() + " died");
					fightOutcome = false;
				}
			}

			if (choice == 2) {

				System.out.println("You coward");
				System.exit(choice);
			}
		}
	}

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
