package LordOfTheObjects;

public class GameApp {

	public static void main(String[] args) {
		
		GameDriver gd = new GameDriver();
		Enemies Hitler = new Enemies("Hitler", 5);
		Enemies Mao = new Enemies("Mao", 5);
		Enemies Stalin = new Enemies("Stalin", 5);
		
		System.out.println("Welcome to Zombie Dictator");
		gd.startGame();
		gd.backStory();
		
		gd.fightEnemy(Stalin);
		System.out.println("Stalin: Niet!!!");
		gd.fightEnemy(Mao);
		System.out.println("Mao: 沒有!!!!");
		gd.fightEnemy(Hitler);
		System.out.println("Hitler: Nien!!!");
		
	}

}
