package LordOfTheObjects;

public class Enemy extends GameCharacter {
	public String[] battleCries;
	
	public void battleCry() {
		System.out.println(battleCries[(int)(Math.random() * battleCries.length)]);
	}
	public String[] getBattleCries() {
		return battleCries;
	}
	public void setBattleCries(String[] battlceCries) {
		this.battleCries = battlceCries;
	}
	public Enemy(String name, int health) {
		super(name, health);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}	