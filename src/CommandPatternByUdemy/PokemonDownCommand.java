package CommandPatternByUdemy;

public class PokemonDownCommand implements Command {

	private PokemonCharacterReceiver pokemon;

	public PokemonDownCommand(PokemonCharacterReceiver pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public void execute() {
		pokemon.moveDown();

	}
}
