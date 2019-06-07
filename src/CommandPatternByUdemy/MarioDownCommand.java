package CommandPatternByUdemy;

public class MarioDownCommand implements Command {

	private MarioCharacterReceiver mario;

	public MarioDownCommand(MarioCharacterReceiver mario) {
		this.mario = mario;
	}

	@Override
	public void execute() {
		mario.moveDown();
	}

}
