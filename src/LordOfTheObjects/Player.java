package LordOfTheObjects;

public class Player extends GameCharacter {
	
	protected String items;
	
	public Player(String name, int health, String items) {
		super(name, health);
		this.items = items;
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
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	
	
	
}
