package CommandPatternByUdemy;

public class PokemonUpCommand implements Command {

	private PokemonCharacterReceiver pokemon;

	public PokemonUpCommand(PokemonCharacterReceiver pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public void execute() {
		pokemon.moveUp();

	}

}
