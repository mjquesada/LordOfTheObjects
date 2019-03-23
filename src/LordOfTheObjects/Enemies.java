package LordOfTheObjects;

public class Enemies extends GameCharacters {

	public Enemies(String name, int health) {
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
