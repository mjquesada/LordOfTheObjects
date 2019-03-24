package LordOfTheObjects;
import java.util.Scanner;

public class GameDriver {
	public static Scanner kb = new Scanner(System.in);

	private int playerHealth = 0, enemyHealth = 0;
	private String[] misses = { "Ha Ha Ha, you missed", "Good try Stevie Wonder", "My Grandma could do better" };
	private String[] hits = { "Awe, right in my eye", "Ouch, thats going to leave a mark",
			"right in the nut crackers" };
//	private String playerName = "";
	private int choice = 0;
//	GameDriver shopKeeper = new GameDriver();

	public void mainGame() {
		boolean keepPlaying = true;

		System.out.println("Please choose a name.");
		String p1Name = kb.nextLine();
		Player playerOne = new Player(p1Name, 400, "");
		Enemy Mao = new Enemy("Mao", 100);
		Mao.setBattleCries(new String[] {"Mao: 為偉大的飛躍做好準備 (Prepare for the great leap!)",
											 "Mao: 農民團結起來 (Peasants unite!)"});
		Enemy Stalin = new Enemy("Stalin", 100);
		Stalin.setBattleCries(new String[] {"Stalin: для матери России (For mother Russia!)", 
												"Stalin: долой капиталистов (Down with the capitalists!)"}); 
		Enemy Hitler = new Enemy("Hitler", 100);
		Hitler.setBattleCries(new String[] {"Hitler: Du hast keine Chance (You don't stand a chance)", 
												" Hitler: Für das Vaterland (For the fatherland!)"});
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
				System.out.println("You were vistorius!!!");
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
				System.out.println("Welcome to China, the land of the rising sun. \n"
						+ "As you walk through the rice paddy field a shadowy figure \n"
						+ "catches your eye. He walks closer to you and as he slowly rasies \n"
						+ "his eyes to catch yours, you realize its the tyrannical leader, Mao!\n");
				choiceInput = false;
			} else if (choice == 2) {
				System.out.println("Welcome to mutha Russia! The land of vodka and awesome dashcam videos. ");
				choiceInput = false;
			} else if (choice == 3) {
				System.out.println("Welcome to Germany, the land of beer and lederhosen. As you walk \n"
						+ "through the post apocolyptic wasteland of Berlin, a \"aaarrgghhh\" from one \n"
						+ "of the bars. Out stumbles a drunken zombie Hitler!. \n");
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
		System.out.println(hits[h]);
		h++;
//		while (fightOutcome) {
//			if () {
//				attackOutcome = (int) (Math.random() * 10 + 1);
//			} else if (choice == 2) {
//				System.out.println("You little coward, come back and fight me!");
//			} else if (attackOutcome > 3) {
//				damage = (int) (Math.random() * 100 + 1);
//				damage = playerHealth - damage;
//				System.out.println(hits[h]);
//				h++;
//			} else if (attackOutcome <= 3) {
//				System.out.println(misses[m]);
//				m++;
//			}
	}
//}

	public void backStory(Player p) {

		System.out.println("In a galaxy far far away, it was September 2, 1945. A young soldier named" + p.getName()
				+ ", " + "was roaming the country side of southern Germany. \n"
				+ "He then notice a bright light that erupted from the horizon.\n "
				+ "A mushroom cloud slowly climbing towards the heavens appeard. \n" + p.getName()
				+ " thought quickly, like a young Indiana Jones, "
				+ "he ran into the closest house he could find. Ripping through the house like a mad-man, he found the refridgerator. \n"
				+ "He pulled everything out of it and jumped in, \n"
				+ "knowing the led lining would keep him safe. He soon went on for the\n "
				+ "ride of his life. After going unconcious for a few hours, \n" + p.getName()
				+ " woke up and slowly peaked his head out \n"
				+ " of the refridgerator, only to realize the world will never be the same.\n");
	}
}