package LordOfTheObjects;

import java.util.Scanner;

public class GameDriver {
	public static Scanner kb = new Scanner(System.in);
	private int choice = 0;
	
	//private String[] misses = { "Ha Ha Ha, you missed", "Good try Stevie Wonder", "My Grandma could do better" };
	private String[] hits = { "Awe, right in my eye", "Ouch, thats going to leave a mark",
			"right in the nut crackers"};

	public void mainGame() {
		boolean keepPlaying = true;

		System.out.println("Welcome to zombie dictator");
		System.out.println("Please choose a name:");
		String p1Name = kb.nextLine();
		Player playerOne = new Player(p1Name, 400, "");
		Enemy Mao = new Enemy("Mao", 100);
		Mao.setBattleCries(
				new String[] { "Mao: 為偉大的飛躍做好準備 (Prepare for the great leap!)", "Mao: 農民團結起來 (Peasants unite!)" });
		Enemy Stalin = new Enemy("Stalin", 100);
		Stalin.setBattleCries(new String[] { "Stalin: для матери России (For mother Russia!)",
				"Stalin: долой капиталистов (Down with the capitalists!)" });
		Enemy Hitler = new Enemy("Hitler", 100);
		Hitler.setBattleCries(new String[] { "Hitler: Du hast keine Chance (You don't stand a chance)",
				" Hitler: Für das Vaterland (For the fatherland!)" });
		backStory(playerOne);
		int v = 0;
		do {
			int choice1 = playerCountryChoice(playerOne);
			Enemy enemy = null;

			switch (choice1) {
			case 1:
				enemy = Mao;
				break;
			case 2:
				enemy = Stalin;
				break;
			case 3:
				enemy = Hitler;
				break;
			}
			fightEnemy(enemy);
			System.out.println(enemy.getName() + " has " + enemy.getHealth() + " health left.");
			if (enemy.getHealth() <= 0) {
				System.out.println("You were victorius!!!");
				v++;
			} else {

				System.out.println("Now its " + enemy.getName() + "'s turn to attack.");
				enemy.battleCry();
				fightEnemy(playerOne);

				if (playerOne.getHealth() <= 0) {
					System.out.println("You were defeated, peasant");
					keepPlaying = false;
				}
			}
			System.out.println(playerOne.getName() + " has " + playerOne.getHealth() + " health left.");

			if (v >= 3) {
				System.out.println("Congratulations, you won the game");
				keepPlaying = false;
			}

		} while (keepPlaying);
	}
	public int playerCountryChoice(Player p) {
		boolean choiceInput = true;
		do {
			System.out.println("Welcome " + p.getName() + ", where would you like to start your journey?");
			System.out.println("1) China.");
			System.out.println("2) Russia.");
			System.out.println("3) Germany.");
			System.out.println("Choose wisely...");
			choice = kb.nextInt();

			if (choice == 1) {
				System.out.println("Welcome to China, which is currently in the middle of a civil war...");
				kb.nextLine();
				System.out.println("As you walk through the rice paddy field a shadowy figure");
				System.out.println("catches your eye. He walks closer to you and as he slowly rasies");
				System.out.println("his eyes to catch yours, you realize its leader of the zombie revelution, Mao Zedong!");
				System.out.println("Mao attacks!");
			
				choiceInput = false;
			} else if (choice == 2) {
				System.out.println("Welcome to mutha Russia! The land of vodka and awesome dashcam videos. ");
				System.out.println("While scaveging for supplies in Moscow, you run into a group of zombies led by Stalin himself");
				System.out.println("Zombie Stalin attacks!");
				choiceInput = false;
			} else if (choice == 3) {
				System.out.println("Welcome to Germany, the land of beer and lederhosen. As you walk");
				System.out.println("through the post apocolyptic wasteland of Berlin, a \"aaarrgghhh\" from one");
				System.out.println("of the bars. Out stumbles a drunken zombie Hitler and he attacks!.");
				choiceInput = false;
			} else {
				System.out.println("That is not an option. Choose again!");
			}
		} while (choiceInput);
		return choice;
	}
	public void fightEnemy(GameCharacter opponent) {
		int attackOutcome = 0;
		int damage = 0;
		int m = 0, h = 0;
		boolean fightOutcome = true;

		damage = (int) (Math.random() * 100 + 1);
        opponent.setHealth(opponent.getHealth() - damage);
        h = (int)(Math.random() * hits.length);
        System.out.println(hits[h]);
	}
	public void backStory(Player p) {

		System.out.println("In a galaxy far far away, it was September 2, 1945. A young soldier named " + p.getName() +", ");
		kb.nextLine();
				
		System.out.println("was roaming the country side of southern Germany.");
		kb.nextLine();
		System.out.println("He noticed a bright light that suddenly erupted from the horizon.");
		kb.nextLine();
		System.out.println("A mushroom cloud slowly climbing towards the heavens appeard. ");
		kb.nextLine();
		System.out.println(p.getName() + " thought quickly, like a young Indiana Jones, ");
		kb.nextLine();
		System.out.println("he ran into the closest house he could find. Ripping through the house like a mad-man,");
		kb.nextLine();
		System.out.println("he found the refridgerator, and pulled everything out of it and jumped in,");
		kb.nextLine();
		System.out.println("knowing the lead lining would keep him safe. He was now in for the ");
		kb.nextLine();
		System.out.println( "ride of his life. After being unconcious for a few hours, ");
		kb.nextLine();
		System.out.println(p.getName() + " woke up and slowly peaked his head out of the refridgerator");
		kb.nextLine();
		System.out.println("Only to realize the world he knew was gone.");
		kb.nextLine();
	}
}