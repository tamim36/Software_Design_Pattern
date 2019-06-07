package CommandPatternByUdemy;

public class Main {

	public static void main(String[] args) {

		// create our receiver like game disk
		MarioCharacterReceiver mario = new MarioCharacterReceiver("Foinni mario");

		PokemonCharacterReceiver pokemon = new PokemonCharacterReceiver("Stupid pokemon");

		// create commands
		MarioUpCommand upMario = new MarioUpCommand(mario);
		MarioDownCommand downMario = new MarioDownCommand(mario);

		PokemonUpCommand upPokemon = new PokemonUpCommand(pokemon);
		PokemonDownCommand downPokemon = new PokemonDownCommand(pokemon);

		// Invoker like game console
		GameBoy gameBoy = new GameBoy(upMario, downMario);

		gameBoy = new GameBoy(upPokemon, downPokemon);

		gameBoy.arrowDown();
	}

}
