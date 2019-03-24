package LordOfTheObjects;

public class AppCopy {

	public static void main(String[] args) {
		
		DriverCopy gd = new DriverCopy();
		Enemy Mao = new Enemy("Mao", 5);
		Enemy Stalin = new Enemy("Stalin", 5);
		Enemy Hitler = new Enemy("Hitler", 5);
		
		System.out.println("Welcome to Zombie Dictator");
		gd.startGame();
		gd.backStory();
		
		gd.fightEnemy(Mao);
		System.out.println("Mao: 沒有!!!!");
		gd.fightEnemy(Stalin);
		System.out.println("Stalin: Niet!!!");
		gd.fightEnemy(Hitler);
		System.out.println("Hitler: Nien!!!");
		
	}

}
