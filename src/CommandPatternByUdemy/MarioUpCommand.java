package CommandPatternByUdemy;

public class MarioUpCommand implements Command {

	private MarioCharacterReceiver mario;

	public MarioUpCommand(MarioCharacterReceiver mario) {
		this.mario = mario;
	}

	@Override
	public void execute() {
		mario.moveUp();

	}

}
