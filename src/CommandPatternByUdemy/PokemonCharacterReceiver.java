package CommandPatternByUdemy;

public class PokemonCharacterReceiver {

	private String name;

	public PokemonCharacterReceiver(String name) {
		this.name = name;
	}

	public void moveUp() {
		System.out.println(getName() + " moving up");
	}

	public void moveDown() {
		System.out.println(getName() + " move down");
	}

	public void moveLeft() {
		System.out.println(getName() + " move Left");
	}

	public void moveRight() {
		System.out.println(getName() + " move Right");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
