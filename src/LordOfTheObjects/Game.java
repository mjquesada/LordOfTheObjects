package LordOfTheObjects;

public class Game {

	public static void main(String[] args) {
		
		Game game = new Game();
		GameDriver gd = new GameDriver();
		Enemies Hitler = new Enemies("Hitler", 5);
		Enemies Mao = new Enemies("Mao", 5);
		Enemies Stalin = new Enemies("Stalin", 5);
		
		
		gd.fightEnemy(Stalin);
		System.out.println("Stalin: Niet!!!");
		gd.fightEnemy(Mao);
		System.out.println("Mao: 沒有!!!!");
		gd.fightEnemy(Hitler);
		System.out.println("Hitler: Nien!!!");

	}

}



//} else if (choice == 2) {
//	System.out.println("You little coward, come back and fight me!");
//} else if (attackOutcome > 3) {
//	damage = (int) (Math.random() * 100 + 1);
//	damage = player.getHealth() - damage;
//	System.out.println(hits[h]);
//	h++;
//} else if (attackOutcome <= 3) {
//	System.out.println(misses[m]);
//	m++;
//} else if (player.getHealth() <= 0) {
//	System.out.println("You were defeated peasant");
//	fightOutcome = false;
//} else if (enemy.getHealth() <= 0) {
//	System.out.println("You were victorius!!!");
//	fightOutcome = false;
//}
//}while (fightOutcome);

// }


//+ "In a galaxy far far away, it was September 2, 1945. A young soldier named" + player.getName() + ", "
//
//
//+ "was roaming the country side of southern Germany. He then notice a bright light that erupted from the horizon. "
//+ "A mushroom cloud slowly climbing towards the heavens appeard. " + player.getName()
//+ " thought quickly, like a young Indiana Jones, "
//+ "he ran into the closest house he could find. Ripping through the house like a mad-man, he found the refridgerator. "
//+ "He pulled everything out of it and jumped in, "
//+ "knowing the led lining would keep him safe. He soon went on for the "
//+ "ride of his life. After going unconcious for a few hours, " + player.getName()
//+ " woke up and slowly peaked his head out "
//+ " of the refridgerator, only to realize the world will never be the same.");

