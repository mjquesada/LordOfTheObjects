package LordOfTheObjects;

public class GameCharacter {
	protected String name;
	protected int health;

	public GameCharacter(String name, int health) {
		super();
		this.name = name;
		this.health = health;
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
